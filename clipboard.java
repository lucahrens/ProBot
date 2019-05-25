//The database is filled with 100 lines of text
//this program goes through all one hundred and finds the one that says bye 
//then prints out the whole line
import java.sql.*;
public class Main {
	
public static void main(String[] args) {
	
	String temp;
	int index = 0;
	try {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
		Statement myStmt = con.createStatement();
		ResultSet rs = myStmt.executeQuery("SELECT * FROM questionsTable");
		for (int i = 1; i < 100; i++) {
			
			rs.first();
			rs.absolute(i);
			temp = rs.getString(3);
			if (temp.equals("Bye")) {
				
				index = i;
			}
		}
		rs.first();
	        rs.absolute(index);
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));  
	} catch (SQLException e) {
		
		e.printStackTrace();
	}  
  }
}
