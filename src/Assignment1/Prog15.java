//Multiplication table of given number
package Assignment1;
import java.util.Scanner;

class Prog15{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a Number: ");
        int number=input.nextInt();
        
        for (int i=1;i<=10;i++)
            System.out.println(number + " X " + i + " = " + number*i);
        
        
    }

    
}