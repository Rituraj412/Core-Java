package Thread;

public class MethodLSync {

    public static void main(String[] args) {
        Hello h=new Hello();
        MyThread t1=new MyThread(h,"vikas");
        t1.start();
        MyThread t2=new MyThread(h,"rinkesh");
        t2.start();


    }
}
class MyThread extends Thread{
    Hello h=null;
    MyThread(Hello h, String s){
        super(s);
        this.h=h;
    }
    public void run(){
        h.m1();
    }
}
class Hello{
    synchronized void m1(){
        Thread th=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(th.getName()+" "+i);
            try {
                this.wait(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
