package Basic;
// project using getter setter method.

public class Studentt {
    static String Institute;
    int sno;
    String sname;

    static void setInstitute(String Institute){
        Studentt.Institute =Institute;
    }

    static String getInstitute(){
        return Institute;
    }
    void setSno(int sno){
        this.sno =sno;
    }

    int getSno(){
        return sno;
    }

    void setSname(String sname){
        this.sname =sname;
    }
    String getSname(){
        return sname;
    }
    void display(){
        System.out.println(" institute\t:" +Institute);
        System.out.println(" sno\t\t:" +sno);
        System.out.println(" sname\t\t:" +sname);

    }
}

class college1{
    public static void main(String[] args) {
        Studentt.setInstitute("naresh it");

        Studentt s1 =new Studentt();
        System.out.println("s1 object initial values");
        s1.display();

        s1.setSno(101);
        s1.setSname("HK");

        System.out.println("\ns1 object values after initilization");
        s1.display();

        System.out.println("\ns1 object values by using getter methods");
        System.out.println(" Institute\t:" +s1.getInstitute());
        System.out.println(" sno\t\t:" +s1.getSno());
        System.out.println(" sname\t:" +s1.getSname());

        String sname =s1.getSname();
        System.out.println(sname.toLowerCase());
    }
}
