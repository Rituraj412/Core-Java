package Basic;

public class BankAccount {
    private long accNum;
    private String accHName;
    private double balance;

    public BankAccount(long accNum, String accHName, double balance) {
        this.accNum = accNum;
        this.accHName = accHName;
        this.balance = balance;
    }

    public void deposit(double amt) {
        this.balance = this.balance + amt;
    }

    public void withdraw(double amt) {
        this.balance = this.balance - amt;
    }

    public void currentBalace() {
        System.out.println(balance);
    }

    public long getAccNum() {
        return accNum;
    }

}

class DepositorThread extends Thread {

    private BankAccount acc;
    private double amt;

    public DepositorThread(BankAccount acc, double amt) {
        this.acc = acc;
        this.amt = amt;
    }

    @Override
    public void run() {
        acc.deposit(amt);
        System.out.println(getName() + " deposited "+amt +"in the account "+ acc.getAccNum() );
    }
}

class WithdraweeThread extends Thread {

    private BankAccount acc;
    private double amt;

    public WithdraweeThread(BankAccount acc, double amt) {
        this.acc = acc;
        this.amt = amt;
    }

    @Override
    public void run() {
        acc.withdraw(amt);
        System.out.println(getName() + " withdrawn "+amt +"from the account "+ acc.getAccNum() );
    }
}


