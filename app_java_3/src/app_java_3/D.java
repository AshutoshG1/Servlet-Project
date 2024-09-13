package app_java_3;

import java.sql.*;

public class D {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nov_db", "root", "test");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from registration");
			while (result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));



			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
