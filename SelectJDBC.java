package CRT.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJDBC {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRT","root","root");
            System.out.println("Connection Success");
            Statement statement = conn.createStatement();
            String str = "SELECT * FROM Student";

            ResultSet rs = statement.executeQuery(str);

            while (rs.next()){
                System.out.println("Student ID: - "+rs.getInt(1)+" | Student Name:- "+rs.getString(2)+" | Student Roll No:- "+rs.getInt(3)+" | Student Age:- "+rs.getInt(4));
            }

//            System.out.println("Delete Record Success.....");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
