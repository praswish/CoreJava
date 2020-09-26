package Assignment1;
import java.util.Scanner;

class Addition{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number1;
        int number2;
        System.out.print("Enter the first number: ");
        number1=input.nextInt();
        System.out.print("Enter the second number: ");
        number2=input.nextInt();
        //int sum ;
        int sum = number1 + number2;
        System.out.println("Sum of "+ number1 + " & " + number2 + " is "+ sum);

    }
}