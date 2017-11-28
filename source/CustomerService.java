import java.util.Calendar;

public class CustomerService extends Employee{
    private int experience;

    public CustomerService(int id, String name, double salary, Calendar retirementDate, int experience){
        super(id, name, salary, retirementDate);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}