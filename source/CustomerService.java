import java.util.Calendar;

public class CustomerService extends Employee{
    private int experience;

    public CustomerService(int id, String name, double salary, int day, int month, int year, int experience){
        super(id, name, salary, day, month, year);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}