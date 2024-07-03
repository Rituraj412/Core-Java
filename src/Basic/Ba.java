package Basic;

public class Ba {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bank start");

        BankAccount acc1 = new BankAccount(1234, "C1", 10000);
        BankAccount acc2 = new BankAccount(5678, "C2", 20000);
        BankAccount acc3 = new BankAccount(4321, "C3", 30000);
        BankAccount acc4 = new BankAccount(4567, "C4", 40000);

        DepositorThread dt1 = new DepositorThread(acc1, 5000);
        DepositorThread dt2 = new DepositorThread(acc2, 7000);
        WithdraweeThread wt1 = new WithdraweeThread(acc3, 5000);
        WithdraweeThread wt2 = new WithdraweeThread(acc4, 7000);

        dt1.start();
        dt2.start();
        wt1.start();
        wt2.start();

        Thread.sleep(1000);

        System.out.print("acc1 balance: ");
        acc1.currentBalace();
        System.out.print("acc2 balance: ");
        acc2.currentBalace();
        System.out.print("acc3 balance: ");
        acc3.currentBalace();
        System.out.print("acc4 balance: ");
        acc4.currentBalace();

        System.out.println("Bank end");
    }
}
