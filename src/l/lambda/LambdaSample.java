package l.lambda;

@FunctionalInterface
interface Calculate{
    int operation(int a,int b);
}

public class LambdaSample {
    public static void main(String[] args) {
        LambdaSample sample=new LambdaSample();
        sample.calculateClassic();
    }
    private void calculateClassic(){
        Calculate calculateAdd=new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(calculateAdd.operation(1,2));
    }
    private void calculateLambda(){
        Calculate calculateAdd=(a, b) -> a+b;
        System.out.println(calculateAdd.operation(2,4));
    }
    private void runCommonThread(){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }
    private void runThread(){
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
    }
}
