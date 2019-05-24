import java.sql.*;
public class Main {

  public static void main(String[] args) {
	  try {
		Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Hackathon","Hackathon","Hackathon");
		  System.out.println("hey");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
 
}
