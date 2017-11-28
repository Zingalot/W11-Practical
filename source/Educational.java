import java.util.List;

public class Educational extends Application{
    private String educationLevel;
    private float academicDiscount;
    private float academicPrice = academicDiscount*this.price;

    public Educational(int productCode, String name, float versionNumber, float price, List<Employee> developmentTeam, String educationLevel, float academicDiscount){
        super(productCode, name, versionNumber, price, developmentTeam);
        this.educationLevel = educationLevel;
        this.academicDiscount = academicDiscount;
    }

    public String getEducationlevel() {
        return educationLevel;
    }

    public float getAcademicDiscount() {
        return academicDiscount;
    }

}
