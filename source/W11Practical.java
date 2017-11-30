import java.util.ArrayList;
import java.util.Arrays;

public class W11Practical {
    public static void main(String[] args){
        //Creating some skillsets for Software Developers
        ArrayList<String> tobySkills = new ArrayList<>(Arrays.asList("Java", "Python", "Leadership"));
        ArrayList<String> rileySkills = new ArrayList<>(Arrays.asList("C", "Python", "Team-player"));

        //Creating new employees (of different types)
        SoftwareDeveloper toby = new SoftwareDeveloper(1, "Toby Smith", 30000, 10, 10, 2020, tobySkills);
        //SoftwareDeveloper riley = new SoftwareDeveloper(2, "Riley Cameron", 35000, 20, 5, 2018, rileySkills);
        CustomerService justin = new CustomerService(3, "Justin Fong", 32000, 19, 1, 2025, 5);
        CustomerService hylas = new CustomerService(4, "Hylas Mok", 28000, 5, 9, 2028, 9);

        //Defining retirement age differently to test no retirees in a year.
        SoftwareDeveloper riley = new SoftwareDeveloper(2, "Riley Cameron", 35000, 20, 5, 2020, rileySkills);

        //Creating development teams for two applications (of different types)
        ArrayList<Employee> itunesEmployees = new ArrayList<>(Arrays.asList(toby, justin, riley));
        ArrayList<Employee> intelliJEmployees = new ArrayList<>(Arrays.asList(toby, riley, hylas));

        //Creating 4 entertainment applications. A few are needed to test the genre checking method
        Entertainment Itunes = new Entertainment(1, "Itunes", 1, 40, itunesEmployees, "music", 7);
        Entertainment Netflix = new Entertainment (3, "Netflix", 1, 0, itunesEmployees, "film", 10);
        Entertainment Steam = new Entertainment(4, "Steam", 1, 20, itunesEmployees, "games", 10);
        Entertainment AmazonVideo = new Entertainment(5, "Amazon Prime Video", 1, 30, itunesEmployees, "film", 8);

        //Creating an educational application to test the academic price calculation, as well as to add some variety
        Educational IntelliJ = new Educational(2, "IntelliJ", 1, 100, intelliJEmployees, "University", 10);

        //Creating a new company, and adding the applications to its product list
        Company apple = new Company("apple");
        apple.addProduct(Itunes);
        apple.addProduct(Netflix);
        apple.addProduct(Steam);
        apple.addProduct(AmazonVideo);

        //Testing all 7 functions
        apple.printProductList();
        Itunes.printDevelopmentTeam();
        System.out.println(apple.totalSalaryCost());
        //apple.printRetiringEmployees();
        IntelliJ.printAcademicPrice();
        apple.printApplicationsInGenre("film");
        apple.mostExperiencedCS();


        //Testing incorrect data
        apple.printApplicationsInGenre("lol");
        apple.printRetiringEmployees(); //Test data has been edited so that no employees will retire in a year
    }
}
