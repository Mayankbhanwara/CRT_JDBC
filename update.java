package CRT.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRT","root","root");
            System.out.println("Connection Success");
            Statement statement = conn.createStatement();


            String str = "update Student set Salary =50000 WHERE Stdid = 102";
            statement.executeUpdate(str);

            System.out.println("Update Record Success.....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
