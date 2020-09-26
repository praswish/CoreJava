package Assignment1;

import java.util.Scanner;

class Prog7{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        String line1;
        System.out.print("Enter a sequence: ");
        line1=input.nextLine();
        //line1 = "the quick brown fox jumps over the lazy dog";

        System.out.println();

        System.out.print ((char) ((int) line1.charAt(0) & 65503));
        for (int i=1; i<line1.length(); i++) {
            if (line1.charAt(i-1) == ' ')
                System.out.print ((char) ((int) line1.charAt(i) & 65503));
            else
                System.out.print(line1.charAt(i));
        }


        
    }

    
}