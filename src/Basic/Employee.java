package Basic;

public class Employee {

    private int    eno;
    private String ename;
    private String dept;
    private double sal;

    void setSal(double sal){
        this.sal =sal;
    }
    double getSal(){
        return sal;
    }


}
class company{
    public static void main(String[] args) {
        Employee e1 =new Employee();

        e1.setSal(10000);

        System.out.println("current sal:" +e1.getSal());

        double sal = e1.getSal();
        sal =sal +(sal*20)/100;

        e1.setSal(sal);
        System.out.println(e1.getSal());

    }
}