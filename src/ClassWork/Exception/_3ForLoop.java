package ClassWork.Exception;
import java.util.Scanner;

public class _3ForLoop {
    static int gas;
    static int initialGas=0;
    public static void main(String[] args) {
        //DEFINE ARRAY
        //CARD  PIN BALANCE  of array 3 records...
        System.out.println("Please Enter Your Name ?");
        String name= new Scanner(System.in).nextLine();
        showGreeting(name);
        gas=askFill();
        //greetings..
        //startPumpWhile();
        startPumpFor();
        //startPumpWhile();
        endPump();
    }

    private static void endPump() {
        if(initialGas>=gas) {
            System.out.println("Gas is filled !!");
        }
        else
        {
            System.out.println("Gas is filling .. please wait");
        }
    }
    private static void startPumpWhile() {
        System.out.println("Pump Started..");
        while(initialGas<=gas) {
            System.out.println("Gas...  " + initialGas);
            initialGas++;
        }
    }
    private static void startPumpFor() {
        System.out.println("Pump Started..");
        for(initialGas=2;initialGas<gas;initialGas++) {
            System.out.println("Gas...  " + initialGas);
        }
    }
    private static void showGreeting(String name) {
        System.out.println("Hi"+name);
    }
    private static int askFill() {
        System.out.println("Enter how much Gas to fill");
        return new Scanner(System.in).nextInt();
    }
}
