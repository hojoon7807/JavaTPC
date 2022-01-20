package f.forkjoin;

import java.util.concurrent.RecursiveTask;

public class GetSum extends RecursiveTask<Long> {
    long from,to;

    public GetSum(long from,long to){
        this.from=from;
        this.to=to;
    }
    public Long compute(){
        long gap=to-from;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        if (gap <= 3) {
            long tempSum=0;
            for(long i=from;i<=to;i++){
                tempSum+=i;
            }
            log("Return !"+from+"~"+to+tempSum);
            return tempSum;
        }
        long middle=(from+to)/2;
        GetSum sumPre=new GetSum(from,middle);
        log("Pre !"+from+"~"+"to="+middle);
        sumPre.fork();
        GetSum sumPost=new GetSum(middle+1,to);
        log("post !"+(middle+1)+"~"+"to="+to);

        return sumPost.compute()+sumPre.join();
    }

    private void log(String message) {
        String threadName=Thread.currentThread().getName();
        System.out.println("["+threadName+"]"+message);
    }
}