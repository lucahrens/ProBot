import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.InputEvent;
import java.util.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.sql.*;


public class Main {

	@SuppressWarnings({ "deprecation", "unused" })
	public static void main(String[] args) throws UnsupportedFlavorException, IOException, SQLException {
		while (true) {
		char w = 'W';
		char zero = '0';
		char one = '1';
		char two = '2';
		char three = '3';
		char four = '4';
		char five = '5';
		char six = '6';
		char seven = '7';
		char eight = '8';
		char nine = '9';
		char[] number1 = new char[1];
		char[] number2 = new char[2];
		char[] number3 = new char[3];
		char[] questionArray = new char[21];
		int numberOfDigits = 0;
		boolean ifInDatabase = false;
		String options = "";
		try {
			Robot robot = new Robot();
			@SuppressWarnings("unused")
			String question=" ";
			@SuppressWarnings("resource")
			Scanner inputer= new Scanner(System.in);
			robot.mouseMove(175,82);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(200);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_SEMICOLON);
				robot.keyRelease(KeyEvent.VK_SEMICOLON);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyRelease(KeyEvent.VK_PERIOD);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_F);
				robot.keyRelease(KeyEvent.VK_F);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyRelease(KeyEvent.VK_PERIOD);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_U);
				robot.keyRelease(KeyEvent.VK_U);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_Z);
				robot.keyRelease(KeyEvent.VK_Z);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_MINUS);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_PERIOD);
				robot.keyRelease(KeyEvent.VK_PERIOD);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_P);
				robot.keyRelease(KeyEvent.VK_P);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.delay(700);
				robot.keyPress(KeyEvent.VK_SLASH);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.delay(700);
				robot.keyRelease(KeyEvent.VK_SLASH);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_I);
				robot.keyRelease(KeyEvent.VK_I);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_T);
				robot.keyRelease(KeyEvent.VK_T);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_L);
				robot.keyRelease(KeyEvent.VK_L);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_EQUALS);
				robot.keyRelease(KeyEvent.VK_EQUALS);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_J);
				robot.keyRelease(KeyEvent.VK_J);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_Q);
				robot.keyRelease(KeyEvent.VK_Q);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_4);
				robot.keyRelease(KeyEvent.VK_4);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_D);
				robot.keyRelease(KeyEvent.VK_D);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_5);
				robot.keyRelease(KeyEvent.VK_5);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_W);
				robot.keyRelease(KeyEvent.VK_W);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_8);
				robot.keyRelease(KeyEvent.VK_8);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(5000);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.mouseMove(272,545);
				robot.delay(300);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_H);
				robot.keyRelease(KeyEvent.VK_H);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_K);
				robot.keyRelease(KeyEvent.VK_K);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_E);
				robot.keyRelease(KeyEvent.VK_E);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_M);
				robot.keyRelease(KeyEvent.VK_M);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_A);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_N);
				robot.keyRelease(KeyEvent.VK_N);
				robot.delay(200);
				robot.mouseMove(420, 550);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.keyPress(KeyEvent.VK_S);
				robot.keyRelease(KeyEvent.VK_S);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_O);
				robot.keyRelease(KeyEvent.VK_O);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_Y);
				robot.keyRelease(KeyEvent.VK_Y);
				robot.delay(200);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.mouseMove(307,611);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(3000);
				int counter = -1;
				for (int o = 0; o < 10; o++) {
				counter = counter + 1;
				robot.mouseMove(253,199);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseMove(538,200);
				robot.keyPress(KeyEvent.VK_META);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyRelease(KeyEvent.VK_META);
				robot.delay(200);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				String result = (String) clipboard.getData(DataFlavor.stringFlavor);
				Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
				Statement myStmt = con.createStatement();
				ResultSet rs = myStmt.executeQuery("SELECT COUNT(*) FROM questionsTable");
				rs.next();
			    int rowCount = rs.getInt(1);
				ResultSet rs1 = myStmt.executeQuery("SELECT * FROM questionsTable");
			    for (int i = 1; i <= rowCount; i++) {
					String temp;
					rs1.first();
					rs1.absolute(i);
					temp = rs1.getString(2);
					if (temp.equals(result)) {
						ifInDatabase = true;
						String answer = rs1.getString(3);
						if (answer.equals("1")) {
							one();
							robot.delay(1000);
							if (counter != 9) {
							robot.mouseMove(327, 406);
							} else {
								robot.mouseMove(273, 428);
							}
							robot.delay(300);
							robot.mousePress(InputEvent.BUTTON1_MASK);
							robot.delay(200);
							robot.mouseRelease(InputEvent.BUTTON1_MASK);
							robot.delay(900);
						} else if (answer.equals("2")) {
							two();
							robot.delay(1000);
							if (counter != 9) {
								robot.mouseMove(327, 406);
								} else {
									robot.mouseMove(273, 428);
								}
							robot.delay(300);
							robot.mousePress(InputEvent.BUTTON1_MASK);
							robot.delay(200);
							robot.mouseRelease(InputEvent.BUTTON1_MASK);
							robot.delay(900);
						} else if (answer.equals("3")) {
							three();
							robot.delay(1000);
							if (counter != 9) {
								robot.mouseMove(327, 406);
								} else {
									robot.mouseMove(273, 428);
								}
							robot.delay(300);
							robot.mousePress(InputEvent.BUTTON1_MASK);
							robot.delay(200);
							robot.mouseRelease(InputEvent.BUTTON1_MASK);
							robot.delay(900);

						} else if (answer.equals("4")) {
							four();
							robot.delay(1000);
							if (counter != 9) {
								robot.mouseMove(327, 406);
								} else {
									robot.mouseMove(273, 428);
								}
							robot.delay(300);
							robot.mousePress(InputEvent.BUTTON1_MASK);
							robot.delay(200);
							robot.mouseRelease(InputEvent.BUTTON1_MASK);
							robot.delay(500);

						}
					}
			    }
			    con.close();
			    myStmt.close();
			    rs.close();
			    rs1.close();
			    if (ifInDatabase == false) {
				char[] fullQuestionArray = result.toCharArray();
				one();
				robot.delay(2000);
				if (counter != 9) {
				options = correct();
				} else {
							robot.mouseMove(190,285);
							robot.mousePress(InputEvent.BUTTON1_MASK);
							robot.mouseMove(210,284);
							robot.mouseRelease(InputEvent.BUTTON1_MASK);
							robot.keyPress(KeyEvent.VK_META);
							robot.delay(500);
							robot.keyPress(KeyEvent.VK_C);
							robot.delay(500);
							robot.keyRelease(KeyEvent.VK_META);
							robot.delay(500);
							robot.keyRelease(KeyEvent.VK_C);
							robot.delay(500);				
							options = (String)clipboard.getData(DataFlavor.stringFlavor);
				}
				String correctAnswer = "";
				String[] words = options.split("\\W+");
				boolean foundAnswer = false;
				for(int q=0;q<words.length;q++) {
					 if(words[q].equals("Correct")){
						 correctAnswer = words[q-1].toString();
						 foundAnswer = true;
					 } }
				if (foundAnswer == false) {
				for(int q=0;q<words.length;q++) {
					 
					 if (words[q].equals("Your")){
						 correctAnswer = words[q-1].toString();
					 }
				}
				}
				for (int y = 0; y < fullQuestionArray.length; y++) {
					if ((fullQuestionArray[y] == zero || fullQuestionArray[y] == one || fullQuestionArray[y] == two || fullQuestionArray[y] == three || fullQuestionArray[y] == four || fullQuestionArray[y] == five || fullQuestionArray[y] == six || fullQuestionArray[y] == seven || fullQuestionArray[y] == eight || fullQuestionArray[y] == nine) && (fullQuestionArray[y+1] == w)) {
						if (y == 0) {
							number1 = Arrays.copyOfRange(fullQuestionArray, 0, 1);  
							questionArray = Arrays.copyOfRange(fullQuestionArray, 1, 23);  
							numberOfDigits = 1;
						} else if (y == 1) {
							number2 = Arrays.copyOfRange(fullQuestionArray, 0, 2);
							questionArray = Arrays.copyOfRange(fullQuestionArray, 2, 24);  
							numberOfDigits = 2;
						} else {
							number3 = Arrays.copyOfRange(fullQuestionArray, 0, 3);
							questionArray = Arrays.copyOfRange(fullQuestionArray, 3, 25);  
							numberOfDigits = 3;
						}
					}
				}
				Connection con1=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
				Statement myStmt1 = con1.createStatement();
				if (numberOfDigits == 1) {
					String b = new String(number1);
					int k = Integer.parseInt(b);

					myStmt1.execute("INSERT INTO questionsTable " + "VALUES ( '" + k +"', '" + result + "', '"+ correctAnswer +"')");
				} else if (numberOfDigits == 2) {
					String b = new String(number2);
					int k = Integer.parseInt(b);

					myStmt1.execute("INSERT INTO questionsTable " + "VALUES ( '" + k +"', '" + result + "', '"+correctAnswer+"')");

				} else {
					String b = new String(number3);
					int k = Integer.parseInt(b);

					myStmt1.execute("INSERT INTO questionsTable " + "VALUES ( '" + k +"', '" + result + "', '"+correctAnswer+"')");

				}
				if (counter != 9) {
				robot.mouseMove(327, 406);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(2000);
			    } else {
			    	robot.mouseMove(273, 428);
			    	robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.delay(2000);
			    }
			    myStmt1.close();
			    con1.close();
			    
		 }
			    
			    ifInDatabase = false;
		}
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				robot.mouseMove(406,670);
			    robot.mousePress(InputEvent.BUTTON1_MASK);
			    robot.delay(400);
			    robot.mouseMove(415, 670);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.keyPress(KeyEvent.VK_META);
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_C);
				robot.delay(200);
				robot.keyRelease(KeyEvent.VK_META);
				robot.delay(200);
				robot.keyRelease(KeyEvent.VK_C);
				robot.delay(200);
				String score = (String)clipboard.getData(DataFlavor.stringFlavor);
				System.out.println(score);
		}
		 catch (AWTException e) {
	            e.printStackTrace();
	     }
		}
		
	}
	@SuppressWarnings("deprecation")
	static void one () {
		try {
			Robot robot= new Robot();
			robot.mouseMove(506,235);
			robot.delay(300);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(400);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(400);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.delay(300);
			robot.mouseMove(375,446);
			robot.delay(300);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(200);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.delay(200);
			
		}
		catch (AWTException e) {
	        e.printStackTrace();
	    }
	}
	
	@SuppressWarnings("deprecation")
	static String correct() throws UnsupportedFlavorException, IOException {
		try {
			@SuppressWarnings("unused")
			Robot robot= new Robot();
			robot.mouseMove(228,259);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseMove(255,265);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.keyPress(KeyEvent.VK_META);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_C);
			robot.delay(500);
			robot.keyRelease(KeyEvent.VK_META);
			robot.delay(500);
			robot.keyRelease(KeyEvent.VK_C);
			robot.delay(500);
			
			
			
			
		}
		catch (AWTException e) {
	        e.printStackTrace();
	    }
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		String result = (String)clipboard.getData(DataFlavor.stringFlavor);
		return result;
		
	}
	
	@SuppressWarnings("deprecation")
	static void two () {
		try {
				Robot robot= new Robot();
				robot.mouseMove(267,291);
				robot.delay(300);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(400);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(400);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(300);
				robot.mouseMove(298,445);
				robot.delay(300);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(200);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(200);
				
			}
			catch (AWTException e) {
		        e.printStackTrace();}
		    }	
		
	
		@SuppressWarnings("deprecation")
		static void three () {
			try {
					Robot robot= new Robot();
					robot.mouseMove(268,336);
					robot.delay(300);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.delay(400);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.delay(400);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.delay(300);
					robot.mouseMove(298,445);
					robot.delay(300);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.delay(200);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					robot.delay(200);
					
				}
				catch (AWTException e) {
			        e.printStackTrace();}
			    }	
			@SuppressWarnings("deprecation")
			static void four () {
				try {
						Robot robot= new Robot();
						robot.mouseMove(268,383);
						robot.delay(300);
						robot.mousePress(InputEvent.BUTTON1_MASK);
						robot.delay(400);
						robot.mouseRelease(InputEvent.BUTTON1_MASK);
						robot.mousePress(InputEvent.BUTTON1_MASK);
						robot.delay(400);
						robot.mouseRelease(InputEvent.BUTTON1_MASK);
						robot.delay(300);
						robot.mouseMove(298,445);
						robot.delay(300);
						robot.mousePress(InputEvent.BUTTON1_MASK);
						robot.delay(200);
						robot.mouseRelease(InputEvent.BUTTON1_MASK);
						robot.delay(200);

					}
					catch (AWTException e) {
				        e.printStackTrace();
				    }
			}
}
