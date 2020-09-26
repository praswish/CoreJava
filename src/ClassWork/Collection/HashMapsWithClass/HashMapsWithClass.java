package ClassWork.Collection.HashMapsWithClass;

import java.util.HashMap;
import java.util.Map;

public class HashMapsWithClass {
    public static void main(String[] args) {
        HashMap<Account, AccountHolder> records =new HashMap<>();
        Account ac1= new Account(200000000,"Saving",28000.50);
        Account ac2= new Account(200000001,"Current",8000.50);
        Account ac3= new Account(200000002,"Fixed",280000.50);

        AccountHolder ah1 = new AccountHolder("John",200000000,(byte)34);
        AccountHolder ah2 = new AccountHolder("Dan",200000001,(byte)24);
        AccountHolder ah3 = new AccountHolder("Niva",200000003,(byte)33);

        //Adding to Hash Maps
        records.put(ac1,ah1);
        records.put(ac2,ah2);
        records.put(ac3,ah3);

        System.out.println("Initial Value");
        System.out.println(records.toString());

        //After Removing
        System.out.println("After Removing John");
        records.remove(ac1); // remove the record with key
        System.out.println(records.toString());

        //Looping to show in tabular format
        // acountNumbar name,account Type,balance
        System.out.println("\nList of Records..");
        System.out.println("Account Number \t\t Name \t\tAccountType \t\tBalance");
        for (Map.Entry mapElement : records.entrySet()){
            //System.out.println(mapElement.getKey());//all key
            //System.out.println(mapElement.getValue());//all value

            Account acKey = (Account) mapElement.getKey();
            AccountHolder acHolderValue =(AccountHolder) mapElement.getValue();
            System.out.print(acKey.getAccountNumber());
            System.out.print("\t\t\t" + acHolderValue.getName());
            System.out.print("\t\t" + acKey.getAccountType());
            System.out.print("\t\t\t\t" + acKey.getBalance());
            System.out.println("");
        }

    }
}
