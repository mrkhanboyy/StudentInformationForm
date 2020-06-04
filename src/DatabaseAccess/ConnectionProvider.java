package DatabaseAccess;

import java.sql.*;
//class to get connection
public class ConnectionProvider {
	private Connection con=null;
	
	private ConnectionProvider(){
	}
	//it will return new instance of the class
	public static ConnectionProvider getInstance(){
		return new ConnectionProvider();
	}
	//connection method
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
