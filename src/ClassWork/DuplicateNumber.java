package ClassWork;
/*
* Coded by: Praswish Maharjan 09/17/2020
* Find the Duplicate Number in the array
* Ask five numbers and find the duplicate no
* */
import java.util.Scanner;
public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int TOTAL =10;
        int [] num = new int[TOTAL];
        int [] num_duplicate = new int[TOTAL];
        int total_duplicate=0;

        System.out.println("Enter " + TOTAL + " numbers:");
        for (int i = 0 ; i < TOTAL ; i++) {
            num[i]= input.nextInt();
        }
        // To find Duplicate Numbers
        for (int i = 0; i < TOTAL-1 ; i++)
            for (int j = i + 1; j < TOTAL; j++)
                if (num[i] == num[j])
                    if (!isDuplicate(num[i], num_duplicate, total_duplicate)){
                        num_duplicate[total_duplicate]= num[j];
                        total_duplicate++;
                    }
        //To print the numbers
        if (total_duplicate >0 ){
            System.out.println("Duplicate Numbers: ");
            int i=0;
            for (i =0; i<total_duplicate-1; i++){
                System.out.print(num_duplicate[i] + ", ");
            }
            System.out.print(num_duplicate[i]);
        }
        else{
            System.out.println("No Duplicate Numbers. ");
        }
    }

    static boolean isDuplicate(int x, int[] list, int size_list){
        // function to find if x exist in array list
        // size_list is size of the list
        boolean flag_found = false;
        for (int i = 0; i < size_list; i++) {
            if (x == list[i]) {
                flag_found = true;
                break;
            }
        }
        return (flag_found);
    }
}
