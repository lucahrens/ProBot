import java.sql.*;
public class Main {

  public static void main(String[] args) {
	  try {
		Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
		  System.out.println("hey");
		  	Statement myStmt = con.createStatement();
		  //you have to change the 69 because the id has to be differnet every time
		  	myStmt.execute("INSERT INTO questionsTable " + "VALUES ( '69', 'Test', 'holy hsit')");
		  	

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
 }
