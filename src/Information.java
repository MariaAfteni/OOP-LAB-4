import static java.lang.System.out;

public class Information {

    University un = new University();
    Faculty fac = new Faculty();
    Course c = new Course();

    public void Display_info(){

        out.print("\n-> View university information");
        un.Display_info_u();

        out.print("\n-> View faculty information");
        fac.Display_info_f();

        out.print("\n-> View course information");
        c.name();
        out.print("\n" + Course_Interface.faculty);
        c.nr_credits();
        c.nr_student();
        out.print("\n-------------------------------------------------");
    }
}
