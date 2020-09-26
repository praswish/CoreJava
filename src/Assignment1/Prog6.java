//Number divisible by 3 and 5form 1 to 100
package Assignment1;
import java.util.Scanner;

class Prog6{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.println("Divisble by 3:");
        int i;
        for (i=1;i<=100;i++)
        {
            if (i%3==0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("Divisble by 5:");
        for (i=1;i<=100;i++)
        {
            if (i%5==0)
                System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("Divisble by 3 and 5:");
        for (i=1;i<=100;i++)
        {
            if (i%3==0 && i%5==0)
                System.out.print(i + ", ");
        }
        System.out.println();
        
        
    }

    
}