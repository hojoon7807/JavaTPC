package c.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample=new ListSample();
        sample.checkArrayList7();
    }
    public void checkArrayList1(){
        //초기 크기 10
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("A");
        list1.add("A");
        list1.add("A");
        list1.add("A");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        ArrayList<String> list3 = new ArrayList<>(list2);
        for (String list:list3) {
            System.out.println(list);
        }
    }
    public void checkArrayList7(){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        String [] array1=new String[1];
        String [] tempArray=list1.toArray(new String[0]);
        for (String array:tempArray) {
            System.out.println(array);
        }
    }
}
