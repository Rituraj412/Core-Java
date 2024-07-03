package DesignP;

// Singleton Design Pattern

public class Example {

    public static void main(String[] args) {

        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
    }
}
