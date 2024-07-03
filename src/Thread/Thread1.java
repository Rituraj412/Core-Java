package Thread;

public class Thread1 {
    public static void main(String[] args) {
        ThreadGroup tg=new ThreadGroup("aman");
        MyThread3 t1=new MyThread3(tg,"suman");
        t1.start();

        MyThread3 t2=new MyThread3(tg,"chaso");
        t2.start();
    }
}

class MyThread3 extends Thread{
    public MyThread3(ThreadGroup tg,String name) {

        super(tg,name);
    }

    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for(int i=0;i<=5;i++) {
            try {
                System.out.println(th.getName()+" "+th.getThreadGroup());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
