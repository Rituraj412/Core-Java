package DesignP.Abstract;

public class Client {

    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee(new JavaDevFactory());
        e1.name();
    }
}
