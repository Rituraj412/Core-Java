package DesignP.Abstract;

import Basic.Employee;

public class JavaDeveloper extends Employee {

    public int salary() {
        return 5000;
    }

    public String name() {
        System.out.println("i am Java developer");
        return " JAVA DEVELOPER";
    }
}
