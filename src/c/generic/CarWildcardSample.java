package c.generic;

public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample=new CarWildcardSample();
        sample.callGenericMethod();
    }
    public void callBoundedWildcardMethod(){
        WildcardGeneric<Car> wildcard = new WildcardGeneric<Car>();
        wildcard.setWildCard(new Car("Hyundai"));
        boundedWildcardMethod(wildcard);
    }
    public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
        Car value = c.getWildCard();
        System.out.println(value);
    }
    public void callBusBoundedWildcardMethod(){
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<Bus>();
        wildcard.setWildCard(new Bus("7737"));
        boundedWildcardMethod(wildcard);
    }
    public <T> T genericMethod(WildcardGeneric<T> c,T addValue){
        c.setWildCard(addValue);
        T value=c.getWildCard();
        System.out.println(value);
        return value;
    }
    public <T extends Car> void boundedGenericMethod(WildcardGeneric<T> c){

    }
    public <T extends Car,S> void multipleGenericMethod(WildcardGeneric<T> c,S value){

    }
    public void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        genericMethod(wildcard,"String");
    }
}
