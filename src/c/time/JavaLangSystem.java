package c.time;

import c.string.StringSample;

public class JavaLangSystem {
    public static void main(String[] args) {
        JavaLangSystem.printNull();
    }
    public void printStreamCheck(){
        byte b=127;
        short s=32767;
        System.out.println(b);
        System.out.println(s);

    }
    public static void printNull(){
        Object obj=null;
        //String.valueOf(obj)
        StringSample sample = new StringSample();
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(sample);
        System.out.println(String.valueOf(sample));
        System.out.println(obj+" is object's value");
    }
}
