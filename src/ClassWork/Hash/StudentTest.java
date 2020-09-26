package ClassWork.Hash;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Jack");
        Student s2 = new Student(2, "Jim");
        Student s3 = new Student(1, "Jack");
        Student s4 = s3;
        //System.out.println(s1.id + " "+s1.name);

        System.out.println("Verify s1==s2 :" + (s1==s2));
        System.out.println("Verify s1==s3 :" + (s1==s3));
        System.out.println("Verify s3==s4 :" + (s3==s4));

        System.out.println("Verify s1.equals(s2) :" + s1.equals(s2));
        System.out.println("Verify s1.equals(s3) :" + s1.equals(s3));
        System.out.println("Verify s3.equals(s4) :" + s3.equals(s4));
    }
}
