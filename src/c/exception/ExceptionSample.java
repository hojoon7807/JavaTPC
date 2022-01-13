package c.exception;

public class ExceptionSample {
    public static void main(String[] args) {
        arrayOutOfBounds();
    }
    public static void arrayOutOfBounds(){
        int[] intArray=null;
        try{
            intArray = new int[5];
            System.out.println(intArray[5]);
        }catch (Exception e){
            System.out.println(intArray.length);
        }
        }
}
