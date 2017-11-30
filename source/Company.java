import java.util.*;

public class Company {
    private String name;
    private ArrayList<Application> products = new ArrayList<Application>();
    private Calendar currentTime = Calendar.getInstance();
    private final long MILLISECONDS_TO_DAYS = 1000*3600*24;
    private final int DAYS_IN_A_YEAR = 365;

    public Company(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void printProductList(){
        int x = 1;
        for(Application item: products){
            System.out.println("Product #" + x + ": " + item.getName());
            System.out.println("Price: £" + item.getPrice());
            x++;
        }
    }

    public void addProduct(Application product) {
        this.products.add(product);
    }

    public double totalSalaryCost(){
        double totalCost = 0;

        for(Application product: products){
            for(Employee employee: product.getDevelopmentTeam()){
                totalCost += employee.getSalary();
            }

        }
        return totalCost;
    }

    public void printRetiringEmployees(){
        boolean foundRetiringEmployee = false;
        for(Application product: products){
            for(Employee employee: product.getDevelopmentTeam()){
                if(employee.retirementDate.getTimeInMillis()/MILLISECONDS_TO_DAYS - currentTime.getTimeInMillis()/MILLISECONDS_TO_DAYS <= DAYS_IN_A_YEAR){
                    foundRetiringEmployee = true;
                    System.out.println(employee.getName());
                    System.out.println(employee.getSalary());
                }
            }

        }
        if(!foundRetiringEmployee){
            System.out.println("No employees retiring in less than a year");
        }
    }

    public void printApplicationsInGenre(String genre){
        boolean foundInGenre = false;
        for(Application product: products){
            if(product instanceof Entertainment){
                if(((Entertainment) product).getGenre().equals(genre)){
                    if(!foundInGenre){
                        System.out.println("The Applications in genre " + genre + " are: ");
                    }
                    foundInGenre = true;
                    System.out.println(product.getName());
                }
            }
        }
        if(!foundInGenre){
            System.out.println("No applications in that genre");
        }
    }

    public void mostExperiencedCS(){
        int x = 0;
        CustomerService mostExperienced = null;
        for(Application product: products){
            for(Employee employee: product.getDevelopmentTeam()){
                if(employee instanceof CustomerService){
                    if(((CustomerService) employee).getExperience() > x){
                        mostExperienced = ((CustomerService) employee);
                        x = ((CustomerService) employee).getExperience();
                    }
                }
            }
        }
        if(mostExperienced != null) {
            System.out.println(mostExperienced.name);
        }
        else{
            System.out.println("No Customer Service Workers!");
        }
    }
}
