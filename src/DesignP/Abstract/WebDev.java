package DesignP.Abstract;

public class WebDev implements Employee{

    public int salary() {
        return 4000;
    }


    public String name() {
        System.out.println("i am a web developer");
        return "WEB DEVELOPER";
    }
}
