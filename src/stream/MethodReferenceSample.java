package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface MakeString{
    String fromBytes(char[] chars);
}
public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample=new MethodReferenceSample();
        String[] stringArray={"aa","bbb","cccc"};
        sample.staticReference(stringArray);
        sample.createInstance();
    }
    private static void printResult(String value){
        System.out.println(value);
    }
    private void staticReference(String[] stringArray){
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }
    private void objectReference(String[] stringArray){
        new ArrayList<>(Arrays.asList(stringArray));
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().forEach(System.out::println);
    }
    private void createInstance(){
        MakeString makeString=String::new; //chars -> new String(chars)
        char[] chars={'g','c','d','p','o'};
        String madeString=makeString.fromBytes(chars);
        System.out.println(madeString);
    }
}
