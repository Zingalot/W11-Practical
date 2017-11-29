import java.util.ArrayList;
import java.util.List;

public class Entertainment extends Application{
    private String genre;
    private int rating;

    public Entertainment(int productCode, String name, float versionNumber, float price, ArrayList<Employee> developmentTeam, String genre, int rating){
        super(productCode, name, versionNumber, price, developmentTeam);
        this.genre = genre;
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }
}
