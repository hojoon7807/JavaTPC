package c.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample=new QueueSample();
        sample.checkLinkedList1();
    }
    public void checkLinkedList1(){
        LinkedList<String> link=new LinkedList<>();
        link.add("A");
        link.addFirst("B");
        System.out.println(link);
        link.offerFirst("C");
        System.out.println(link);
        link.addLast("D");
        System.out.println(link);
        link.offer("E");
        System.out.println(link);
        link.offerLast("F");
        System.out.println(link);
        link.push("G");
        System.out.println(link);
        link.add(0,"H");
        System.out.println(link);
        System.out.println("EX="+link.set(0,"I"));
        System.out.println(link);
        printList(link);
    }
    public void printList(LinkedList<String> list) {
        ListIterator<String> listIterator=list.listIterator(2);
        Iterator<String> iterator = list.descendingIterator();
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
        System.out.println(" ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
