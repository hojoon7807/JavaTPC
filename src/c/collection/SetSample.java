package c.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String[]cars=new String[]{
                "Tico","benz","bmw","honda","kia"
        };
        System.out.println(sample.getCarkinds(cars));
    }
    public int getCarkinds(String[] cars){
        if(cars==null) return 0;
        if(cars.length==1) return 1;
        Set<String> carSet= new HashSet<>();
        for(String car:cars){
            carSet.add(car);
        }
        printCarSet2(carSet);
        return carSet.size();
    }
    public void printCarSet(Set<String> carSet){
        for(String car:carSet){
            System.out.print(car+" ");
        }
    }
    public void printCarSet2(Set<String> carSet){
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
        System.out.println();
    }
}
