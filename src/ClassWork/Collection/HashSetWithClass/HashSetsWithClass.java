package ClassWork.Collection.HashSetWithClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetsWithClass {
    public static void main(String[] args) {

        Book b1 = new Book(1,"CoreJava",34.23);
        Book b2 = new Book(2, "Unity in Action", 40.00);
        Book b3 = new Book (3, "JS for FrontEnd Engineer",23.23);

        HashSet<Book> h = new HashSet<>();

        h.add(b1);
        h.add(b2);
        h.add(b3);

        System.out.println(Arrays.toString(h.toArray()));
        System.out.println(h.contains(b1));

        //System.out.println(b1.getTitle().equals("CoreJava"));
        //h.remove(b1);
        //System.out.println("Set after removing :" + h);

        // Using Iterator
        System.out.println("Print HashSet Using Iterator");
        Iterator<Book> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //Using For Loop
        for(Book book:h){
            System.out.println("Books Details\n" + book.getId() + book.getTitle() +book.getPrice());
        }

    }
}
