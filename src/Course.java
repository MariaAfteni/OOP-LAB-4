import static java.lang.System.out;
import  java.util.Random;


public class Course extends Faculty implements Course_Interface {
    String course_name;
    String teacher;

    String[] courses = {"OOP", "AMS", "MS", "PSA", "AM", "SDA"};

    Random rand = new Random();

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public void name() {
        int name;
        name = rand.nextInt(6);
        out.print("\n-------------------------------------------------");
        out.print("\n| " + courses[name] + " Course" + "                                     |");
        out.print("\n-------------------------------------------------");
    }

    @Override
    public void nr_credits() {
        int credits;

        credits = 1+ rand.nextInt(8);
        out.print("\nCredits per course: " + credits);
    }

    @Override
    public void nr_student() {
        int students;

        students = rand.nextInt(100);
        out.print("\nStudents enrolled in course this semester: " + students);
    }
}