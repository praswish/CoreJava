package Assignment1;
//Prime Check
import java.util.Scanner;

class Prog8{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a number: ");
        int number=input.nextInt();
        
        int count=0;
        for (int i=2;i<number;i++)
        {
            if (number%i ==0){
                count=1;
            }
        }
        if (count==0)
            System.out.println(number + " is Prime.");
        else
            System.out.println(number + " is not Prime.");
        
        
    }

    
}