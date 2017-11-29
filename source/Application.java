import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    protected int productCode;
    protected String name;
    protected float versionNumber;
    protected float price;
    protected ArrayList<Employee> developmentTeam = new ArrayList<Employee>();

    public Application(int productCode, String name, float versionNumber, float price, ArrayList<Employee> developmentTeam){
        this.productCode = productCode;
        this.name = name;
        this.versionNumber = versionNumber;
        this.price = price;
        this.developmentTeam = developmentTeam;
    }

    public void printDevelopmentTeam(){
        System.out.println("Development Team for " + this.name);
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

    public List<Employee> getDevelopmentTeam() {
        return developmentTeam;
    }
}
