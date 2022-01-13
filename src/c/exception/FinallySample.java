package c.exception;

public class FinallySample {
    public static void main(String[] args) {
    finallySample();
    }
    // 코드의 중복을 피하기 위해서 finally 필요
    public static void finallySample(){
        int[] intArray=new int[5];
        try{
            System.out.println(intArray[4]);
        }catch(Exception e){
            System.out.println(intArray.length);
        }finally {
            System.out.println("here is finally");
        }
    }
}
