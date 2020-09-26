package ClassWork.Exception;

public class ExcDemo4 {
    public static void main(String[] args) {
        try{
            throw new CustomExceptionFileNotFound();
        }

        catch (CustomExceptionFileNotFound e){
            System.out.println("Catch Custom Exception");
            e.getMessage();
        }
    }
}
