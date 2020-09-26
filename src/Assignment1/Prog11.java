//Convert Second to H:M:S
package Assignment1;
import java.util.Scanner;

class Prog11{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        System.out.print("Enter a Seconds: ");
        
        int seconds=input.nextInt();
        
        int minutes = seconds/(60);
        seconds =seconds % 60;
        int hours = minutes /60;
        minutes = minutes %60;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
        
        
    }

    
}