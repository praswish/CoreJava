package ClassWork.Collection.HashMap;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> hp =new HashMap<>();

        hp.put(0,"Don");
        hp.put(1,"Sandy");
        hp.put(2,"john");
        hp.put(3,"Daniel");
        hp.put(null,null);
        hp.put(null,"Will Smith");

        //Getting the value with the key

        System.out.println(hp.get(0)); // Don
        System.out.println(hp.get(1)); // Sandy

        //Print the value as HashMaps using Set
        Set s=hp.keySet();  // To Print Keys
        System.out.println(s);

        //To Print values using collection
        Collection c=hp.values();
        System.out.println(c);

        //To Print Entry objects
        Set contents = hp.entrySet();
        //System.out.println(contents);
        //Using Iterator on Hash Map
        Iterator iterator=contents.iterator();
        while  (iterator.hasNext()){
            Map.Entry m1 =(Map.Entry) iterator.next();
            System.out.println(m1.getKey() +"::" + m1.getValue());
        }

        //Using for Loop
        for (Map.Entry mapElement:hp.entrySet()){
            Object key =  mapElement.getKey();
            String value= (String) mapElement.getValue();
            System.out.println(key + " " + value);
        }

        //Using Java 8, Lambda Function....
        System.out.println("Using Lambda");
        hp.forEach((k,v)-> System.out.println(k +"::::"+ v));


    }
}
