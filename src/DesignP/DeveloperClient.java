package DesignP;

public class DeveloperClient {

    public static void main(String[] args) {

      Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("web Developer");
        System.out.println(employee1.salary());



    }
}
