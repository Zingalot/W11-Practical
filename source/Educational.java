import java.util.*;

public class Educational extends Application{
    private String educationLevel;
    private float academicDiscount;
    private float academicPrice;

    public Educational(int productCode, String name, float versionNumber, float price, ArrayList<Employee> developmentTeam, String educationLevel, float academicDiscount){
        super(productCode, name, versionNumber, price, developmentTeam);
        this.educationLevel = educationLevel;
        this.academicDiscount = academicDiscount;
        this.academicPrice = ((100-academicDiscount)/100)*this.price;
    }

    public String getEducationlevel() {
        return educationLevel;
    }

    public float getAcademicDiscount() {
        return academicDiscount;
    }

    public void printAcademicPrice() {
        System.out.println(academicPrice);
    }

}
