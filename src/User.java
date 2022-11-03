import static java.lang.System.out;
import java.util.Random;

public class User {
    String name;
    Random rand = new Random();

    public int User_type(){
        int type;

        type = rand.nextInt(2);
        return type;
    }

    public String getName() {
        return name;
    }

}