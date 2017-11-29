import java.util.Calendar;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected Calendar retirementDate = Calendar.getInstance();

    public Employee(int id, String name, double salary, int day, int month, int year){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.retirementDate.set(year, month, day);
    }
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
