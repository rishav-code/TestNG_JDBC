package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	public Statement insert() {
		try {
			Scanner sc = new Scanner(System.in);
			Connection con = new Database().loading();
			java.sql.Statement stmt = con.createStatement();
			
			int id=sc.nextInt();
			
			((java.sql.Statement) stmt).executeUpdate("INSERT INTO actor " + 
	                "VALUES (id, 'suvu', 'bar', '2020-09-08 16:16:16')");
			System.out.println("Data inserted");
			return stmt;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

		
	}

}
