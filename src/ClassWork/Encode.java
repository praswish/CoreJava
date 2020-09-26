package ClassWork;
import java.util.Scanner;

public class Encode {
    public static void main(String[] args){

        Scanner input=new Scanner( System.in );
        String msg, encmsg = "",decmsg="";
        int key =88;

        System.out.print("Orignal Message: ");
        //line1 = input.nextLine();
        msg = "the quick brown fox jumps over the lazy dog";
        System.out.println(msg);

        //Encryption routine
        for ( int i=0 ; i< msg.length(); i++ )
            encmsg=encmsg + (char) (msg.charAt(i) ^ key);
        System.out.println("Encoded Message: " + encmsg);

        //Decryption Routine
        for ( int i=0 ; i< encmsg.length(); i++ )
            decmsg=decmsg + (char) (encmsg.charAt(i) ^ key);
        System.out.println("Decoded Message : " + decmsg);
    }

}
