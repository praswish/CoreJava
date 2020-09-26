package ClassWork.Collection;

import java.util.*;


public class ArrayListWithPrimities {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Daniel");

        List names1 = new ArrayList();
        names1.add(1);
        names1.add("One");

        ArrayList finalList =new ArrayList();
        finalList.add(names);
        finalList.add(names1);
        System.out.println(finalList.toString());

    }
}
