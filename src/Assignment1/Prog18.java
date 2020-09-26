//Ten Numbers ODD EVEN SUM and Average
package Assignment1;
import java.util.Scanner;

class Prog18{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        int list[] = new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Enter a Number: ");
            list[i]=input.nextInt();
        }
        
        int odd_counter=0, even_counter =0,sum=0;
        double average =0;
        for (int i=0;i<10;i++){
            sum=sum+list[i];
            if (list[i]%2==0)
                even_counter++;
            else
                odd_counter++;
        }
       
        System.out.println("No of ODD: " + odd_counter);
        System.out.println("No of EVEN: " + even_counter);
        System.out.println("SUM: " + sum);
        System.out.println("AVG: " + sum/10.0);
            
        
        
    }

    
}