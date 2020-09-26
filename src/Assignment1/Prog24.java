package Assignment1;

import java.util.Scanner;

public class Prog24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numItems=0, i;
        double price, total_price =0;
        System.out.print("How many items: ");
        numItems = input.nextInt();

        for (i=1; i<=numItems ; i++){
            System.out.print("Please enter the Price " + i +" : ");
            price = input.nextDouble();
            total_price += price;
        }

        System.out.println("Your Total Bill : " + total_price);
        System.out.println("Your Tax        : " + total_price * 0.05);
        System.out.print("Please Enter Tip (Press enter to skip) : ");
        String tip = input.nextLine();
        tip = input.nextLine();
        double tip_amount=0;
        if (tip.length() > 0)
            tip_amount = Double.parseDouble(tip);

        System.out.println("Your Final Bill is : " + (total_price * 1.05 + tip_amount) );
    }
}
