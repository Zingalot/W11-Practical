import java.util.*;

public class Company {
    private String name;
    private List<Application> products;
    private Calendar currentTime;
    private final long MILLISECONDS_TO_DAYS = 1000*3600*24;
    private final int DAYS_IN_A_YEAR = 365;

    public String getName(){
        return this.name;
    }

    public void printProductList(){
        for(Application item: products){
            System.out.print(item.getName());
            System.out.print(item.getPrice());
        }
    }

    public void addProduct(Application product) {
        this.products.add(product);
    }

    public double totalSalaryCost(){
        double totalCost = 0;

        for(Application product: products){
            for(Employee employee: product.developmentTeam){
                totalCost += employee.getSalary();
            }

        }
        return totalCost;
    }

    public void printReitiringEmployees(){
        for(Application product: products){
            for(Employee employee: product.developmentTeam){
                if(employee.retirementDate.getTimeInMillis()/ MILLISECONDS_TO_DAYS - currentTime.getTimeInMillis()/ MILLISECONDS_TO_DAYS <= DAYS_IN_A_YEAR){
                    System.out.println(employee.getName());
                    System.out.println(employee.getSalary());
                }
            }

        }
    }
}
