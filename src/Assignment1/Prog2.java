package Assignment1;
import java.util.Scanner;
class Prog2{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        double width;
        double height;
        System.out.print("Enter the width: ");
        width = input.nextDouble();
        System.out.print("Enter the height: ");
        height = input.nextDouble();

        double area = width*height;
        double perimeter = 2 * (width + height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: "+ perimeter);


    
    }
}