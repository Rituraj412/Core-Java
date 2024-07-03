package Basic;

public class BankAccount1 {

    private long   accNum;
    private String accHName;
    private double balance;

    public BankAccount1(long accNum, String accHName, double balance) {
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
