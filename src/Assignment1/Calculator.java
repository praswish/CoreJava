package Assignment1;
import java.util.Scanner;

class Calculator{
    public double add(double number1,double number2){
        return (number1+number2);
    }
    public double sub(double number1,double number2){
        return (number1-number2);
    }
    public double mul(double number1,double number2){
        return (number1*number2);
    }
    public double div(double number1,double number2){
        return (number1/number2);
    }

    void menu(){
        System.out.println("1. Add \n2. Subtact\n3. Multiply\n4. Divide \n5. Quit");
    }

    public static void main(String[] args){
        Calculator cal1=new Calculator();
        Scanner input=new Scanner(System.in);
        
        double number1= 3.0;
        double number2= 1.5;
        int choice =1;
        while(choice != 5){
            cal1.menu();
            choice = input.nextInt();
            if (choice>=1 && choice <=4){
                System.out.print("Enter the first number: ");
                number1=input.nextDouble();
                System.out.print("Enter the second number: ");
                number2=input.nextDouble();
                if (choice==1)
                    System.out.println(cal1.add(number1,number2));
                else if (choice==2)
                    System.out.println(cal1.sub(number1,number2));
                else if (choice==3)
                    System.out.println(cal1.mul(number1,number2));
                else if (choice==4)
                    System.out.println(cal1.div(number1,number2));
                
            }
        }
        
        
    }
}