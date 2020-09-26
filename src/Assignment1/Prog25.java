// Students
package Assignment1;

import java.util.Scanner;

public class Prog25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total_students, total_male, total_female;

        System.out.print("How many Students in Class: ");
        total_students = input.nextInt();
        System.out.print("How many Male Students in Class: ");
        total_male = input.nextInt();
        if (total_male > total_students)
            System.out.println("This is not possible");
        else {
            System.out.println("Total number of female students : " + (total_students - total_male));
            System.out.println("We have : " + total_male * 100.0 / total_students + " % male and " + (total_students - total_male) * 100.0 / total_students + " % female.");

        }

    }

}
