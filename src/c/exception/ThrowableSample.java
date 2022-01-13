package c.exception;

public class ThrowableSample {
    public static void main(String[] args) {
        throwable();
    }
    public static void throwable(){
        int[] intArray=new int[5];
        try{
            intArray=null;
            System.out.println(intArray[5]);
        }catch(Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
