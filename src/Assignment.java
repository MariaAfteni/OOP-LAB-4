import static java.lang.System.out;
import  java.util.Random;

public class Assignment extends Course {
    int due_hour;
    int due_minutes;
    int submit_hour;
    int submit_minutes;
    int due_day;
    int submit_day;
    int submit;
    Random rand = new Random();
    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String[] assignments = {"Individual task", "Laboratory", "Group task"};
    public void add_asignment(){
        int a;

        a = rand.nextInt(3);
        out.print("\n" + assignments[a] + " assignment added");
    }

    public void due_assignment() {
        due_hour = rand.nextInt(24);
        due_minutes = rand.nextInt(60);
        due_day = rand.nextInt(6);
        out.print("\nAssignment due hour " + due_hour + ":" + due_minutes + " on " + weekdays[due_day]);

    }

    public void submitted_by(){
        int total, after;

        total = rand.nextInt(100);
        out.print("\nAssignment submitted by " + total + " students");

        after = rand.nextInt(total);
        out.print("\n" + after + " students submitted after deadline");
    }

    public void submit_assignment() {
        submit_hour = rand.nextInt(24);
        submit_minutes = rand.nextInt(60);
        submit_day = rand.nextInt(6);
        out.print("\nAssignment submitted at " + submit_hour+ ":" + submit_minutes+ " on " + weekdays[submit_day]);
    }

    public void status_submit(){
        int late_day, late_hours, late_minutes = 0;
        if (((submit_hour > due_hour) & (submit_day >= due_day)) || ((submit_hour < due_hour) & (submit_day > due_day))
        || ((submit_hour >= due_hour) & (submit_day == due_day))){
            late_day = submit_day - due_day;
            if (due_hour > submit_hour){
                late_hours = due_hour - submit_hour;
            }
            else if ((due_minutes > submit_minutes) & (due_hour >= submit_hour)){
                late_hours = 24 - due_hour + submit_hour ;
                late_day = late_day - 1;
                late_minutes = 60 - due_minutes + submit_minutes;
            }
            else if ((due_minutes > submit_minutes) & (due_hour < submit_hour)){
                late_hours = submit_hour - due_hour -  1;
                late_minutes = 60 - due_minutes + submit_minutes;
            }
            else{
            late_hours = submit_hour - due_hour;
            late_minutes = submit_minutes - due_minutes;
            }
            submit = 0;
            out.print("\nAssignment submitted late by " + late_day + " days, " + late_hours + " hours and " + 
                    late_minutes + " minutes");
        }
        else {
            submit = 1;
            out.print("\nAssignment submitted on time");
        }
    }

    public void grade_assignment() {
        int g;
        int grade;

        g = rand.nextInt(3);
        if (g == 0){
            out.print("\nAssignment not gradded");
        }
        else {
            grade = 1 + rand.nextInt(10);
            if (submit == 0){
                grade = grade - 1;
            }
            out.print("\nAssignment gradded");
            out.print("\nGrade " + grade);

        }
    }
}