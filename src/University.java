import static java.lang.System.out;

public class University {
    String name = "Technical University of Moldova";
    int nr_faculties = 12;
    int nr_students = 11500;
    int nr_teachers = 973;

    public void Display_info_u(){
        out.print("\n" + name);
        out.print("\nFaculties: " + nr_faculties);
        out.print("\nStudents: " + nr_students);
        out.print("\nTeachers: " + nr_teachers);
    }
}
