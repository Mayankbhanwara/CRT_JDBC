package CRT.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertjdbc {
    public static void main(String[] args){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRT","root","root");
            System.out.println("Connection Success");
            Statement statement = conn.createStatement();

            String str = "insert into Student values(101,'Aryan',10,19),(102,'Mayank',32,18),(103,'Dhruv',15,19);";

            statement.executeUpdate(str);

            System.out.println("Insert Record Success");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
