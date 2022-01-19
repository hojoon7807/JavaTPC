package e.thread;

public class RunThreads {
    public static void main(String[] args) {
        RunThreads sample=new RunThreads();
        sample.runBasic();
    }
    public void runBasic(){
        RunnableSample runnable=new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread=new ThreadSample();
        thread.start();
    }
}
