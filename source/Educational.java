public class Educational extends Application{
    private String educationlevel;
    private float academicDiscount;
    private float academicPrice = academicDiscount*this.price;



    public String getEducationlevel() {
        return educationlevel;
    }

    public float getAcademicDiscount() {
        return academicDiscount;
    }

}
