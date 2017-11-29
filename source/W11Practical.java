import java.util.ArrayList;
import java.util.Arrays;

public class W11Practical {
    public static void main(String[] args){
        ArrayList<String> tobySkills = new ArrayList<>(Arrays.asList("Java", "Python", "Leadership"));
        ArrayList<String> rileySkills = new ArrayList<>(Arrays.asList("C", "Python", "Team-player"));
        SoftwareDeveloper toby = new SoftwareDeveloper(1, "Toby Smith", 30000, 10, 10, 2020, tobySkills);
        SoftwareDeveloper riley = new SoftwareDeveloper(2, "Riley Cameron", 35000, 20, 5, 2018, rileySkills);
        CustomerService justin = new CustomerService(3, "Justin Fong", 32000, 19, 1, 2025, 5);
        CustomerService hylas = new CustomerService(4, "Hylas Mok", 28000, 5, 9, 2028, 9);
        ArrayList<Employee> itunesEmployees = new ArrayList<>(Arrays.asList(toby, justin, riley, hylas));
        Entertainment Itunes = new Entertainment(1, "Itunes", 1, 40, itunesEmployees, "music", 7);
        Entertainment Netflix = new Entertainment (3, "Netflix", 1, 0, itunesEmployees, "film", 10);
        Entertainment Steam = new Entertainment(4, "Steam", 1, 20, itunesEmployees, "games", 10);
        Entertainment AmazonVideo = new Entertainment(5, "Amazon Prime Video", 1, 30, itunesEmployees, "film", 8);


        Educational IntelliJ = new Educational(2, "IntelliJ", 1, 100, itunesEmployees, "University", 10);
        Company apple = new Company("apple");
        apple.addProduct(Itunes);
        apple.addProduct(Netflix);
        apple.addProduct(Steam);
        apple.addProduct(AmazonVideo);
        apple.printProductList();
        Itunes.printDevelopmentTeam();
        System.out.println(apple.totalSalaryCost());
        apple.printRetiringEmployees();
        IntelliJ.printAcademicPrice();
        apple.printApplicationsInGenre("film");
        apple.mostExperiencedCS();
    }
}
