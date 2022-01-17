package c.generic;

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();
    }
    public void callWildcardMethod(){
        WildcardGeneric<StringBuffer> wildcard = new WildcardGeneric<StringBuffer>();
        wildcard.setWildCard(new StringBuffer("A"));
        wildcardStringMethod(wildcard);
    }
    public void wildcardStringMethod(WildcardGeneric<?> c){
        Object value = c.getWildCard();
        if(value instanceof String){
            System.out.println(value);
        }
    }
}
