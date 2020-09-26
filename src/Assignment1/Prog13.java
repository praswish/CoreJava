//Factorial of number
package Assignment1;
import java.util.Scanner;

class Prog13{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a Number: ");
        int number=input.nextInt();
        int factorial =1;
        for (int i=1; i<=number; i++){
            factorial = factorial * i ;
        }
        
        System.out.println (number + "! = " + factorial);
        
        
    }

    
}