package Serialization;

import Serialization.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {

    public static void main(String[] args) {

        try {
            Student st=new Student("Rituraj","rituraj@gmail.com",22,"Banglore");

            FileOutputStream fos=new FileOutputStream("ob.txt");

            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(st);

            oos.close();
            fos.close();
            System.out.println("object is transfered");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
