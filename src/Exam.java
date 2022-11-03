import static java.lang.System.out;
import java.util.Random;

public class Exam {
    Random rand = new Random();
    int grade;

    public int Take_exam(){
        int take;

        take = rand.nextInt(3);
        if (take == 0){
            out.print("\n# Taking an exam #");
        }
        else if (take == 1) {
            out.print("\n# Absent at the exam");
        }
        else {
            out.print("\n# Exam canceled");
        }
        return take;
    }

    public void Grade_exam(){

        grade = 1 + rand.nextInt(10);
        out.print("\nExam grade: " + grade);
    }

    public void Status_exam(){

        if (grade >= 5){
            out.print("\nCongratulation, you passed the exam");
        }
        else{
            out.print("\nExam Failed. Retake exam");
        }
    }

    public void Check_statistics(){
        int taken, failed;
        float avg;

        taken = rand.nextInt(100);
        out.print("\nExam taken by " + taken + " students");

        failed = rand.nextInt(taken);
        out.print("\n" + failed +" failed the exam");

        avg =  1 + rand.nextFloat(10);
        out.print("\nAverage grade: " + avg);
    }
}
