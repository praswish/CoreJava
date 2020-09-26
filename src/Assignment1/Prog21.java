//Star Generator
package Assignment1;
import java.util.Scanner;

class Prog21{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        
        System.out.print("Enter a Number: ");
        int number=input.nextInt();
        
        for (int i=1 ; i < number ; i++){
            for(int j=1; j<=number - i ; j++ )
                System.out.print(" ");
        
            for(int j=1; j< 2 * i ; j++ )
                System.out.print("*");
               
            System.out.println();
        }
        for (int i=number ; i >= 1 ; i--){
            for(int j=1; j<=number - i ; j++ )
                System.out.print(" ");
        
            for(int j=1; j< 2 * i ; j++ )
                System.out.print("*");

            System.out.println();
        }
        
        
        
    }

    
}