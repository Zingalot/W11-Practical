import java.util.Calendar;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;
    protected Calendar retirementDate;

    public Employee(int id, String name, double salary, Calendar retirementDate){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.retirementDate = retirementDate;
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
