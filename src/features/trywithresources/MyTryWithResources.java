package features.trywithresources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyTryWithResources {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		we doesnt need to provide the path of the driver it will automactically load the driver class
//		in jdbc hence we can skip the use of Class.forName(DriverclassName) inside our jdbc program
//		try with resources in java 7 we need to declare the resources locally
//		we declared the connection inside the try parameters locally bcoz in java 7 we need 
//		to declare the resources locally
//		the resources must implement the autocloseable interface for auto closing of
//		all the resources inside the try block parameters
//		try(Connection con = DriverManager.getConnection
//				("jdbc:mysql://localhost:3306/mvc", "root", "faisal");
//				Statement stmt = con.createStatement();){
//			int status = stmt.executeUpdate
//					("insert into user values(55,'@gmail.com','neko','583','cipher')");
//			System.out.println("query executed"+status);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		we can also use finally with try with resources
//		finally {
//			System.out.println("finally block will be executed");
//		}
		
//		in java 9 we can declare the resources outside the parameters of the try and we 
//		can directly use these resources inside the try parameters
//		here we declared the connection object outside the try parameters
//		still we can use this object inside the try parameters locally
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/mvc", "root", "faisal");
//		connection object used inside the try resources
		try(con){
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while(rs.next()) {
				int id = rs.getInt(1);
				String email = rs.getString(2);
				String name = rs.getString(3);
				String number = rs.getString(4);
				String password = rs.getString(5);
				System.out.println(id);
				System.out.println(name);
				System.out.println(email);
				System.out.println(password);
				System.out.println(number);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
