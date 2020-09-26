//Area of the Hexagon
package Assignment1;
import java.util.Scanner;

class Prog4{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        double side;
        System.out.print("Enter the side: ");
        side=input.nextDouble();
        double area = 3 * Math.sqrt(3) * side * side /2;
        System.out.println("Area = " + area);
        
    }

    
}