package ClassWork;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price[]=new double[5];

        double sum=0, discount=0;
        System.out.println("Please enter the five Price");
        int i;
        for(i = 0 ; i < 5 ; i++ ){
            System.out.print("Please Enter Price " + (i+1) + " : ");
            price[i] = input.nextDouble();
            sum = sum + price[i];
        }
        System.out.print("Please Enter Discount : ");
        discount = input.nextDouble();
        double final_bill = (sum - discount) * (1.07);
        System.out.println("Your Final Bill is : " + final_bill);
    }
}
