package Assignment1;
class Prog3{

    public static int getItself(int itself, int dummy)
    {
        return itself;
    }

    private static int demo(int a) //Why this has to be private static
    {
        return a;
    }
    public static void main(String[] args){
        int a=2,b=3;
        System.out.print("a = " + a + " b = " + b );
        a = getItself(b, b = a);
        System.out.print(" After swap a = " + a + " b = " + b );


        //System.out.println(demo(1));
    }

}