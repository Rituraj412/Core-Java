package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab1 {
    public static void main(String[] args) {
        Connection connection= null;
        Statement st=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pract", "root", "Rajanand412@");
            String sql = "insert into jlcstudent values(99,'sri','sri@jlc',999911)";
            st = connection.createStatement();
            int x = st.executeUpdate(sql);
            if (x == 1)
                System.out.println("record inserted");
            else
                System.out.println("record not inserted");
        }catch (Exception e){
            e.printStackTrace();

        }
        finally {
            try{
                if(st != null)
                    st.close();
                if(connection != null)
                    connection.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
