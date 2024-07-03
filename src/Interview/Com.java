package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class Com {

    public static void main(String[] args) {
        ArrayList<Emp> emps=new ArrayList<>();
        emps.add(new Emp("Rikesh","987645",11));
        emps.add(new Emp("Rituraj","123456",9));
        emps.add(new Emp("Anand","912837",10));
        System.out.println(emps);

        Collections.sort(emps);
        System.out.println(emps);

    }
}

class Emp implements Comparable<Emp>{

    private String name;
    private String phone;
    private int empId;

    @Override
    public int compareTo(Emp o) {
        return this.empId-o.empId;
    }

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }


}
