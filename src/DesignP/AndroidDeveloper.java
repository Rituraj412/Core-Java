package DesignP;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("getting Android Developer salary");
        return 50000;
    }
}
