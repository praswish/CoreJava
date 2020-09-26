//Equality check of 4 numbers
package Assignment1;
import java.util.Scanner;

class Prog17{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        int list[] = new int[4];
        for (int i=0;i<4;i++){
            System.out.print("Enter a Number: ");
            list[i]=input.nextInt();
        }
        
        if (list[0]==list[1] && list[0]==list[2] && list[0]==list[3])
            System.out.println("All numbers are equal");
        else
            System.out.println("All numbers are not equal");
        
        
        
    }

    
}