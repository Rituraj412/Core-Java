package Basic;

public class Student {
    static String institute;

    int sno;
    String sname;

    void set(int sno,String sname ){
        sno=sno;
        sname=sname;
    }
    void display(){
        System.out.println(sno+" "+sname);
    }

}

class college{
    public static void main(String[] args) {
        Student.institute ="Naresh IT";

        Student s1=new Student();
        s1.set(101, "HK");
        s1.display();

        Student s2 =new Student();
        s2.set(102, "BK");
        s2.display();
    }
}
