import static java.lang.System.out;

public class Student extends User {
    Information info = new Information();

    public void Student_activity() {
        Exam e = new Exam();
        out.print("\n## Student account");
        info.Display_info();

        out.print("\n-> Submit assignment");
        Assignment a1 = new Assignment();
        a1.due_assignment();
        a1.submit_assignment();
        a1.status_submit();

        out.print("\n-> Check grade");
        a1.grade_assignment();

        out.print("\n-> Exam");
        int g = e.Take_exam();
        if (g == 0) {
            e.Grade_exam();
            e.Status_exam();
        }
    }
}
