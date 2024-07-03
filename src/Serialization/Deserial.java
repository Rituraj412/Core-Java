package Serialization;

import Serialization.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {

    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("ob.txt");

            ObjectInputStream ois=new ObjectInputStream(fis);

            Student st =(Student) ois.readObject();
            st.displayName();
            System.out.println(st.getName());
            System.out.println(st.getEmail());
            System.out.println(st.getAge());
            System.out.println(st.getAddress());

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
