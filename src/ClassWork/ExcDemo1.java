package ClassWork;

public class ExcDemo1 {

    public static void main(String[] args) throws InterruptedException {
    try {
        System.out.println(10 / 0);
    }
    catch (ArithmeticException exc){
        System.out.println("Alert User : No can't be divided by 0 ");
        //System.out.println("Error :" + exc);
    }
        Thread.sleep(5000);


    }
}
