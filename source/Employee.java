import java.util.Calendar;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected Calendar retirementDate;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Calendar getRetirementDate() {
        return retirementDate;
    }
}
