package ClassWork;

public class AccountStatic {
    byte id =34;
    static  String name ="RR";
    static float balance = 340.0f;

    {   // this is called every time the object is created
        System.out.println("Instant Block");
        getInfoNonStatic();
    }

    // Static Block is called before Instant Block
    static
    {
        System.out.println("Static Block Called");
        getAccountInfo();
    }



    AccountStatic() {
        System.out.println("Constructor: AccountStatic");
    }

    public static void getAccountInfo(){
        System.out.println(name +" "+ balance );
    }

    public void getInfoNonStatic(){
        System.out.println(id);

    }
}
