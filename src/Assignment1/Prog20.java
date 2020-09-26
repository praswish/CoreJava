//Star Generator
package Assignment1;
import java.util.Scanner;

class Prog20{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        //char ch=new char[3];
        //ch[0]='*';ch[1]='#';ch[2]='^';
        System.out.print("Enter a Number: ");
        int number=input.nextInt();
        
        for (int i=1 ; i <= number ; i++){
            for(int j=1; j<=i ; j++ ){
                if (i%3==0) System.out.print("*");
                if (i%3==1) System.out.print("#");
                if (i%3==2) System.out.print("^");
            }
            System.out.println();
        }
        
        
        
    }

    
}