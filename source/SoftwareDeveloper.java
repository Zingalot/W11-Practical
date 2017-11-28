import java.util.Calendar;
import java.util.List;

public class SoftwareDeveloper extends Employee {
    private List<String> skills;

    public SoftwareDeveloper(int id, String name, double salary, Calendar retirementDate){
        super(id, name, salary, retirementDate);
    }

    public void addSkill(String skill){
        skills.add(skill);
    }

    public List<String> getSkills() {
        return skills;
    }
}
