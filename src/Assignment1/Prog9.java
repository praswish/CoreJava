//American Flag

package Assignment1;
import java.util.Scanner;

class Prog9{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        
        for (int row=1 ;row<=15;row++){
            for (int col=1 ;col<=45;col++){
                if (row<=9 && col<=11){
                    if ( (row+col) % 2 ==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");

                    
                    }
                }
                else if(row <=9 && col==12){
                    System.out.print(" ");
                }
                else {
                    System.out.print("=");
                }
            }
        System.out.println();
        }
        
        }


    
}