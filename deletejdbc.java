package CRT.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class deletejdbc {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRT","root","root");
            System.out.println("Connection Success");
            Statement statement = conn.createStatement();
            String str = "Delete From Student WHERE Stdid = 101";
            statement.executeUpdate(str);

            System.out.println("Delete Record Success.....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
