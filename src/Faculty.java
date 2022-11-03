import static java.lang.System.out;

public class Faculty extends University {
    String faculty_name = "FCIM";
    int total_students = 2647;
    int staff = 210;

    public void Display_info_f(){
        out.print("\n" + faculty_name);
        out.print("\nStudents: " + total_students);
        out.print("\nDidactic Staff: " + staff);
    }
}
