package l.lambda.functional;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        PredicateExample sample=new PredicateExample();

        Predicate<String> predicateLength5=(a)->a.length()>5;
        Predicate<String> predicateContains=(a)->a.contains("hojoon");
        Predicate<String> predicateStart=(a)->a.startsWith("hojoon");

        String hojoon="hojoon";
        String hojun="hojun";

        sample.predicateTest(predicateLength5,hojoon);
        sample.predicateTest(predicateLength5,hojun);

        sample.predicateNegate(predicateLength5,hojoon);
        sample.predicateNegate(predicateLength5,hojun);

        sample.predicateAnd(predicateLength5,predicateContains,hojoon);
        sample.predicateAnd(predicateLength5,predicateContains,hojun);

        sample.predicateOr(predicateLength5,predicateStart,hojoon);
        sample.predicateOr(predicateLength5,predicateStart,hojun);
    }
    private void predicateTest(Predicate<String> p,String data){
        System.out.println(p.test(data));
    }
    private void predicateAnd(Predicate<String> p1,Predicate<String> p2,String data){
        System.out.println(p1.and(p2).test(data));
    }
    private void predicateOr(Predicate<String> p1,Predicate<String> p2,String data){
        System.out.println(p1.or(p2).test(data));
    }
    private void predicateNegate(Predicate<String> p,String data){
        System.out.println(p.negate().test(data));
    }
}
