package NewFea;

public class Demo1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eating();
        d.running();
        d.sleeping();
        System.out.println("******************************************************");
        Cat c=new Cat();
        c.eating();
        c.thinking();
        c.sleeping();
        c.running();
    }
}
interface Animal{
    public abstract void eating();
    public abstract void sleeping();

    default void running()
    {
        System.out.println("Animal is Running");
    }

    default void thinking(){
        System.out.println("Animal is thinking");
    }
}
class Dog implements Animal{

    @Override
    public void eating() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void running() {
        System.out.println("Dog is running");
    }
}
class Cat implements Animal{

    @Override
    public void eating() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleeping() {
        System.out.println("cat is sleeping");
    }

    @Override
    public void thinking() {
        System.out.println("cat is thinking");
    }
}
