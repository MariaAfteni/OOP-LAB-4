import java.util.Random;

public class log_into implements Log{
    @Override
    public int Verify_log() {
        Random rand = new Random();
        int ch;
        ch = rand.nextInt(2);
        return ch;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
