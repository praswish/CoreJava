package ClassWork.Collection.ArrayListWithClass;

import java.util.ArrayList;

public class ArrayListWithClass {

    public static void main(String[] args) {
        ArrayList<AccountHolder> names = new ArrayList<>();

        names.add(new AccountHolder("Jack",1001,(byte) 34));
        names.add(new AccountHolder("Daniel",1002,(byte) 40));
        names.add(new AccountHolder("John",1003,(byte) 45));
        names.add(new AccountHolder("John",1004,(byte) 45));

        //To Add later
        AccountHolder ac1 = new AccountHolder("Tina",1005,(byte) 25);
        names.add(ac1);

        //Print all the AccountHolder Names
        System.out.println("Initial");
        System.out.println(names.toString());

        //Remove the arraylist , say John info
        names.remove(2);

        //Print all the AccountHolder Names
        System.out.println("Initial");
        System.out.println(names.toString());

        //Print List of Names Using Loop
        System.out.println("List of Names Using Loop");
        //AccountHolder name;
        for (AccountHolder name:names){
            System.out.println(name.toString());
        }
    }
}
