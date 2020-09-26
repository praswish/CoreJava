package ClassWork;
import java.util.Scanner;

// Demonstration of if else
public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String subjects[]={"English","Java","Maths","Science","Java Script"};
        double total=0;
        double[] subject_marks = new double[5];
        System.out.println("Please Enter Marks: ");
        for (int i=0; i<5; i++){
            System.out.print(subjects[i] +" : ");
            subject_marks[i] = input.nextDouble();
            total= total + subject_marks[i];
        }
        double per = total /5;
        System.out.println("Percentage : " + per);
        if (per > 60)
            System.out.println("First Div");
        else if (per > 45)
            System.out.println("Second Div");
        else if (per >30)
            System.out.println("First Div");
        else
            System.out.println(" You Failed, Please Retake the Exam");
    }





}
