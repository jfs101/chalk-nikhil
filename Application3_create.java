import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Application3_create{

	public static void main(String args[]) {

		try {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		}catch (Exception e) {

			// TODO: handle exception

			System.out.println(e);



		}

		try {

		Connection connection = null;

		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","sys "
				+ "as sysdba","randomPass123");

		System.out.println("It's working!");

		Statement stmt = connection.createStatement();  
		  
		//execute query  
		ResultSet rs=stmt.executeQuery("CREATE TABLE emp(id integer, "
				+ "name varchar(12), dob date, location varchar(10), project_id varchar(10))");
//		while(rs.next()) { 
//		System.out.println(rs.getString(1)+" "+rs.getString(2));
//		}

		
		System.out.println("Query executed!");
		connection.close();

		}catch (Exception e) {

			// TODO: handle exception

			System.out.println(e);



		}

		



		

	}

}

