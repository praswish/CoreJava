//Leap Year Checker
package Assignment1;
import java.util.Scanner;

class Prog14{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a Year: ");
        int number=input.nextInt();
        if ((number%4==0 && number % 100 !=0 ) || (number%4==0 && number % 400 ==0 )){
            System.out.println("Leap Year ");
        }
        else{
            System.out.println("Not Leap Year ");
        }
        
        
    }

    
}