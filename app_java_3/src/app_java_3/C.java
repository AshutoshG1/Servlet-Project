package app_java_3;

import java.sql.*;

public class C {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nov_db", "root", "test");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("update registration set email='adam@gmail.com' where mobile='9998887776'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
