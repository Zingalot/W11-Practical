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
        for(Application product: products){
            for(Employee employee: product.getDevelopmentTeam()){
                if(employee.retirementDate.getTimeInMillis()/ MILLISECONDS_TO_DAYS - currentTime.getTimeInMillis()/ MILLISECONDS_TO_DAYS <= DAYS_IN_A_YEAR){
                    System.out.println(employee.getName());
                    System.out.println(employee.getSalary());
                }
            }

        }
    }

    public void printApplicationsInGenre(String genre){
        System.out.println("The Applications in genre " + genre + " are: ");
        for(Application product: products){
            if(product instanceof Entertainment){
                if(((Entertainment) product).getGenre().equals(genre)){
                    System.out.println(product.getName());
                }
            }
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
