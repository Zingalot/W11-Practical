import java.util.ArrayList;
import java.util.List;

public class Financial extends Application{
    private boolean personal;
    public Financial(int productCode, String name, float versionNumber, float price, ArrayList<Employee> developmentTeam, boolean personal){
        super(productCode, name, versionNumber, price, developmentTeam);
        this.personal = personal;
    }
}
