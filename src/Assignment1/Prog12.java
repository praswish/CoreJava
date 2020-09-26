//Febonacci Series from 1 to 100
package Assignment1;
import java.util.Scanner;

class Prog12{
    

    public static void main(String[] args){
        Scanner input=new Scanner( System.in );
        int n1=1;int n2=1;int sum;
        while (n1<=100)
        {
            System.out.print(n1 + " ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
        }
        System.out.println();
        
    }

    
}