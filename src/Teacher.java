import static java.lang.System.out;

public class Teacher extends User {
    Information info = new Information();
    Assignment a = new Assignment();
    Exam e = new Exam();

    public void Teacher_activity(){
      out.print("\n## Teacher account");
      info.Display_info();

      out.print("\n-> Add assignment");
      a.add_asignment();
      a.due_assignment();

      out.print("\n-> Check assignment statistic");
      a.submitted_by();

      out.print("\n-> Check exam statistic");
      e.Check_statistics();

    }
}