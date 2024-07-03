package Practice;

public class Test14 {
        public static void main(String[] args) {                            //Old states      Java 5v
            System.out.println("main start");
            MyThread7 mt = new MyThread7();  //thread object is created -     1. New                NEW
            System.out.println("in main #1: "+ mt.getState());

            mt.start();  //thread is ready to execute -                     2. Ready-To-Run        RUNNABLE
            System.out.println("In main #2: "+ mt.getState());

            try {Thread.sleep(2000);}
            catch (InterruptedException e) {}

            System.out.println("In main #4: "+ mt.getState());


            try {Thread.sleep(7000);}
            catch (InterruptedException e) {}

            System.out.println("In main #5: "+ mt.getState());
            System.out.println("main end");

        }
    }

    class MyThread7 extends Thread {
        @Override
        public void run() { //thread is running                                3. Running             RUNNABLE
            System.out.println("run start");
            System.out.println("In run  #3: "+ this.getState());

            try {Thread.sleep(5000);} //thread is blocked                    4. Blocked             TIMED_WAITING
            catch(InterruptedException e) { }                                                    //WAITING
            //BLOCKED
            System.out.println("run end");
        } //thread is dead                                                    5. Dead                TERMINATED
    }

