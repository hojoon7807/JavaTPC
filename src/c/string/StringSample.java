package c.string;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.checkFormat();
        byte b=1;
        String byte1=String.valueOf(b);
        String byte2=b+"";
        System.out.println(byte1);
        System.out.println(byte2);
    }
    public void convert(){
        try{
            String korean = "한글";
            byte[] array1 = korean.getBytes();
            for(byte data:array1){
                System.out.print(data+" ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void printByteArray(byte[] array){
        for(byte data:array){
            System.out.print(data+" ");
        }
        System.out.println();
    }
    public void convertUTF16(){
        try{
            String korean="한글";
            byte[] array1=korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2=new String(array1,"UTF-16");
            System.out.println(korean2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void checkSubstring(){
        String text="Java technology";
        int start = text.indexOf('t');
        String tech=text.substring(start,start+4);
        System.out.println(tech);
    }
    public void checkSplit(){
        String text="Java technology is both a programming language and a platform.";
        String[] splitArray=text.split(" ");
        for(String temp:splitArray){
            System.out.println(temp);
        }
    }
    public void checkTrim(){
        String[] strings = new String[]{
                " a"," b ","    c","d    ","e   f","    "
        };
        for(String string:strings){
            System.out.println("["+string+"] ");
            System.out.println("["+string.trim()+"] ");
        }
    }
    public void checkReplace(){
        String text="The String class represents character strings.";
        System.out.println(text.replace('s','z'));
        System.out.println(text);
        System.out.println(text.replace(' ','|'));
    }
    void checkFormat(){
        String text="My name is %s. I have %d cars, %f%%";
        String real=String.format(text,"hojoon",5,14.0);
        System.out.println(real);
    }
}
