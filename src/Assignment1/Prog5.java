//Odd Number and its count form 1 to 99
package Assignment1;
import java.util.Scanner;

class Prog5{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        int count=0;
        for (int i=1;i<=99;i++)
        {
            if (i%2==1){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("total = " + count);
        
    }

    
}