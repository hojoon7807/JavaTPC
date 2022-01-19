package e.thread.sync;

public class CommonCalculate {
    private int amount;
    private int interest;
    Object amountLock=new Object();
    Object interesttLock=new Object();
    public CommonCalculate(){
            amount = 0;
            interest=0;
    }
    public void addInterest(){
        synchronized (interesttLock){
            interest+=1;
        }
    }
    public void plus(){
        //synchronized(this)
        synchronized (amountLock) {
            amount += 1;
        }
    }
    public void minus(){
        amount-=1;
    }
    public int getAmount(){
        return amount;
    }
}
