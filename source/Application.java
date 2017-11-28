import java.text.SimpleDateFormat;
import java.util.List;

public class Application {
    public final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    protected int productCode;
    protected String name;
    protected float versionNumber;
    protected float price;
    protected List<Employee> developmentTeam;


    public void printDevelopmentTeam(){
        for(Employee employee: developmentTeam){
            System.out.println("Name: " + employee.name);
            System.out.println("Retirement Date: " + DATE_FORMAT.format(employee.retirementDate.getTime()));
        }
    }


    public int getProductCode() {
        return productCode;
    }

    public String getName(){
        return name;
    }

    public float getVersionNumber() {
        return versionNumber;
    }

    public float getPrice() {
        return price;
    }
}
