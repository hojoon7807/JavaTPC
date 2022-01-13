package c.exception;

public class MultiCatchSample {
    public static void main(String[] args) {
    multiCatch();
    }
    public static void multiCatch(){
        int[] intArray=new int[5];
        try{
            intArray=null;
            System.out.println(intArray[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
