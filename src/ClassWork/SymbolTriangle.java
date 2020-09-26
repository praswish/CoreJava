package ClassWork;
/*
 * Coded by: Praswish Maharjan 09/17/2020
 * Triangle Generator of Symbols
 * Enter Three Symbols
 * Enter the number of level
 * */
import java.util.Scanner;
public class SymbolTriangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char[] symbol = new char[3];
        char choice ='y';
        int level;
        while(choice =='y' || choice =='Y') {
            System.out.println("Enter three symbols: ");
            for (int i = 0; i < 3; i++) {
                symbol[i] = input.next().charAt(0);
            }
            System.out.println("Enter the number of level: ");
            level = input.nextInt();

            //Generate the Triangle
            for (int i = 0; i < level; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(symbol[i % 3]);
                }
                System.out.println();
            }
            System.out.println("Do you want to continue (Y/y to continue): ");

            choice = input.next().charAt(0);
        }
    }
}
