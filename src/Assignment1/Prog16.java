//Sum of given number
package Assignment1;
import java.util.Scanner;

class Prog16{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a Number: ");
        int number=input.nextInt();

        int sum =0, rem;
        while (number>0){
            rem=number % 10;
            sum =sum +rem;
            number =number /10;
        }
        System.out.println("The Sum = " + sum);
        
        
    }

    
}