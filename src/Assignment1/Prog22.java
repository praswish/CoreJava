//Program to Write the Day of Week
package Assignment1;
import java.util.Scanner;

class Prog22 {

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );

        String [] DayName ={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        System.out.print("Enter the weekday: ");
        int number=input.nextInt();

        if (number >=1 && number <=7)
            System.out.println(DayName[number-1]);

        
        
        
    }

    
}