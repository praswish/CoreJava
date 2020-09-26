package ClassWork;
//1. Program to Ask for Number 1 to 7
//2. If Invalid Ask again 1
//3. If valid check no is 7
//4. If 7 prinf "You are lukcy you win
//5. If not 7 print you are not lucky go to step 1

import java.awt.event.InputEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LuckyGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lucky_number = 7;
        int user_choice = 0;

        do {

            boolean iscontinue =true;
            do {
                try {
                    System.out.println("Please enter the number between 1 & 7");
                    user_choice = input.nextInt();
                    iscontinue = false;
                } catch (InputMismatchException e) {
                    System.out.println("Input type mismatch: ");
                    input.nextLine();
                }

            } while (iscontinue == true);


            if (isInputValid(user_choice) == false)
                System.out.println("Please select the value between 1 & 7 (Invalid Input).");
            else{
                if (isLucky(user_choice, lucky_number) == true){
                    System.out.println(user_choice + " is the lucky number.");
                }
                else{
                    System.out.println(user_choice + " is not the lucky number.");
                }
            }
        } while (user_choice != lucky_number);
    }


    private static boolean isInputValid(int user_choice) {
        if (user_choice >= 1 && user_choice <= 7)
            return (true);
        else
            return (false);
    }
    private static boolean isLucky(int user_choice, int lucky_number){
        return (user_choice == lucky_number);
    }

}