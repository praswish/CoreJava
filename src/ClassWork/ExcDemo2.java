package ClassWork;

import java.util.Scanner;

public class ExcDemo2 {
    public static void main(String[] args) {
        String[] names=new String[5];
        System.out.println("Please Enter 5 Persons Name !!");

        for (int i = 0; i <= 5; i++){
            try {
                names[i] = new Scanner(System.in).nextLine();
            }
            catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("Array Index Out of Bound");
            }
        }
    }
}
