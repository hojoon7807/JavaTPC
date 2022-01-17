package c.stack;

import java.util.Stack;

//arrayDeque 보다 느리지만 쓰레드에서 안전
public class StackSample {
    public static void main(String[] args) {
        StackSample sample = new StackSample();
        sample.checkPeek();
    }
    public void checkPeek(){
        Stack<Integer> intStack=new Stack<>();
        for(int i=0;i<5;i++){
            intStack.push(i);
            System.out.println(intStack.peek());
        }
        System.out.println("size"+intStack.size());
    }
}
