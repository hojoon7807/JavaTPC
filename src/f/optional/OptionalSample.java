package f.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample {
    public static void main(String[] args) throws Exception {
        OptionalSample.creaetOptionalObjects();
    }
    private static void creaetOptionalObjects() throws Exception {
        Optional<String> emptyString=Optional.empty();
        printOptional(emptyString);
        String common=null;
        Optional<String> nullableString=Optional.ofNullable(common);
        printOptional(nullableString);
        common="common";
        Optional<String> commonString=Optional.of(common);
        printOptional(commonString);
    }
    private static void printOptional(Optional<String> data)throws Exception{
        Supplier<String> stringSupplier=new Supplier<String>() {
            @Override
            public String get() {
                return "hojoon";
            }
        };
//        String result3=data.orElseGet(stringSupplier);
        Supplier<Exception> exceptionSupplier =new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        Supplier<String> string2= ()->"hojjoon";
        //String result4=data.orElseThrow(exceptionSupplier);
        if(data.isPresent()){
            String result1=data.get();
            System.out.println(result1);
        }else {
            String result3=data.orElseGet(stringSupplier);
            System.out.println(result3);
        }
    }
}
