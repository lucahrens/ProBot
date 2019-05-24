import java.sql.*;
public class Main {

  public static void main(String[] args) {
	  try {
		Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
		  System.out.println("hey");
		  Array src;
		  	Statement myStmt = con.createStatement();
		  	String sql = "test";
		  	//myStmt.execute("INSERT INTO questionsTable " + "VALUES ( '69', 'Test', 'holy hsit')");
		  	//ResultSet rs = myStmt.executeQuery("SELECT * FROM questionsTable");
		  	//rs.absolute(2);
		  	//src = rs.getArray("answers");
		  	//System.out.println(src.toString());
		  	//DBTablePrinter.printTable(conn, "employees");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
  }
 }
