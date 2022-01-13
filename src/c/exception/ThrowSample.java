package c.exception;

public class ThrowSample {
    public static void main(String[] args) {
        throwException(13);
        try{
            throwsException(13);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void throwException(int number){
        try{
            if(number>12){
                throw new Exception("hi");
            }
            System.out.println("Number is " +number);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void throwsException(int number) throws Exception {
            if (number > 12) {
                throw new Exception();
            }
            System.out.println("Number is " + number);
    }
}
