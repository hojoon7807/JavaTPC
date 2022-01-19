package e.thread;

public class NameClacThread extends Thread{
    private int calcNumber;
    public NameClacThread(String name,int calcNumber){
        super(name);
        this.calcNumber = calcNumber;
    }

    @Override
    public void run() {
        calcNumber ++;
    }
}
