package app_java_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class E {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nov_db", "root", "test");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values ('saloni', 'chennai', 'saloni@gmail.com', '2228887776')");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
