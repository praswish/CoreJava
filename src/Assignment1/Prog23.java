package Assignment1;
import java.util.Scanner;

class Prog23 {
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        String line1;
        System.out.print("Enter A Alphabet: ");
        line1=input.nextLine();
        //line1 = "the quick brown fox jumps over the lazy dog";

        System.out.println();
        if (line1.length()==1) {
            if ((line1.charAt(0) >='A' && line1.charAt(0)<='Z') || (line1.charAt(0) >='a' && line1.charAt(0)<='z')) {
                switch (line1.charAt(0)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':

                        System.out.println("Vowel");
                        break;
                    default:
                        System.out.println("Consonant");
                }
            }
            else{
                System.out.println("Not Matched");
            }

        }
        else {
            System.out.println("Not Matched");
        }


    }

    
}