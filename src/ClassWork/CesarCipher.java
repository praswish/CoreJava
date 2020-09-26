package ClassWork;
import java.util.Scanner;

public class CesarCipher {
    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        String line1, line2 = "";
        char ch;
        System.out.print("Enter a sequence: ");
        line1 = input.nextLine();
        //line1 = "the quick brown fox jumps over the lazy dog";
        //System.out.println(line1);

        //Encryption routine
        for ( int i=0 ; i< line1.length(); i++ ){
            ch = (char) line1.charAt(i);
            if ((ch >= 'A' && ch <'Z') || (ch >= 'a' && ch <'z'))
                ch = (char) (ch + 1);
            else if (ch =='Z' || ch =='z')
                ch = (char) (ch + 'A' -'Z');
            line2 = line2 + (char) ch;
        }
        System.out.println("After Encryption : " + line2);

        //Decryption Routine
        String line3="";
        for ( int i=0 ; i< line2.length(); i++ ){
            ch = (char) line2.charAt(i);
            if ((ch > 'A' && ch <='Z') || (ch > 'a' && ch <='z'))
                ch = (char) (ch - 1);
            else if (ch =='A' || ch =='a')
                ch = (char) (ch + 'Z' -'A');
            line3 = line3 + (char) ch;
        }
        System.out.println("After Decryption : " + line3);

    }

}
