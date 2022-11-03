import static java.lang.System.out;

public class System{
    public static void main(String[] args) {

        out.print("\n# User logging into system #");
        log_into l = new log_into();
        int cho = l.Verify_log();
        if (cho == 0) {

            out.print("\n-------------------------------------------------");
            out.print("\n| Log in Failed                                 |");
            out.print("\n| Insert correct username and password          |");
            out.print("\n-------------------------------------------------");
        }
        else{
            out.print("\n-------------------------------------------------");
            out.print("\n| Successfully logged into account              |");
            out.print("\n| Welcome to university management system       |");
            out.print("\n-------------------------------------------------");

            User u = new User();
            int type = u.User_type();
            Information info = new Information();

            // Student system
            if (type == 0){
                Student s = new Student();
                s.Student_activity();
                }


            // Teacher system
            else if (type == 1) {
                Teacher t = new Teacher();
                t.Teacher_activity();
            }
        }
    }
}

