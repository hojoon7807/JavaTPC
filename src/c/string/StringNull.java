package c.string;

public class StringNull {
    public static void main(String[] args) {
    nullCheck(null);
    }
    public static boolean nullCheck(String text){
        if(text==null){
            System.out.println("true");
            return true;
        }
        else {
            int textLength=text.length();
            System.out.println(text);
            return false;
        }
    }
}
