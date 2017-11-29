import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SoftwareDeveloper extends Employee {
    private ArrayList<String> skills = new ArrayList<String>();

    public SoftwareDeveloper(int id, String name, double salary, int day, int month, int year, ArrayList<String> skills){
        super(id, name, salary, day, month, year);
        this.skills = skills;
    }

    public void addSkill(String skill){
        skills.add(skill);
    }

    public List<String> getSkills() {
        return skills;
    }
}
