package Thread;

public class ThreadingUsingRunnable {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("A");
        MyThread1 th = new MyThread1(threadGroup, "S");
        th.start();

        MyThread2 th2 = new MyThread2();
        Thread th1 = new Thread(th2);
        th1.start();
    }
}

class MyThread1 extends Thread {

    MyThread1(ThreadGroup threadGroup, String name){
          super(name);
          this.getThreadGroup();

    }


    @Override
    public void run() {

        Thread th = Thread.currentThread();
        ThreadGroup tg = th.getThreadGroup();
        super.run();
        System.out.println(th.getName() + " Thread Started"+ " "+tg.getName());
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2 Started");
    }
}
