import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.List;

public class W11Practical {
    public static void main(String[] args){
        ArrayList<String> tobySkills = new ArrayList<>(Arrays.asList("Java", "Python", "Leadership"));
        ArrayList<String> rileySkills = new ArrayList<>(Arrays.asList("C", "Python", "Team-player"));
        SoftwareDeveloper toby = new SoftwareDeveloper(1, "Toby Smith", 30000, 10, 10, 2020, tobySkills);
        SoftwareDeveloper riley = new SoftwareDeveloper(2, "Riley Cameron", 35000, 20, 5, 2018, rileySkills);
        CustomerService justin = new CustomerService(3, "Justin Fong", 32000, 19, 1, 2025, 5);
        ArrayList<Employee> itunesEmployees = new ArrayList<>(Arrays.asList(toby, justin, riley));
        Entertainment Itunes = new Entertainment(1, "Itunes", 1, 40, itunesEmployees, "music", 7);



        Educational IntelliJ = new Educational(1, "IntelliJ", 1, 100, itunesEmployees, "University", 10);
        Company apple = new Company("apple");
        apple.addProduct(Itunes);
        apple.printProductList();
        Itunes.printDevelopmentTeam();
        System.out.println(apple.totalSalaryCost());
        apple.printReitiringEmployees();
        IntelliJ.printAcademicPrice();
    }
}
