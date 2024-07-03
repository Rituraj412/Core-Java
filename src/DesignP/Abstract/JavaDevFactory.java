package DesignP.Abstract;

public class JavaDevFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {

        return (Employee) new JavaDeveloper();
    }
}
