

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
import java.util.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws UnsupportedFlavorException, IOException, SQLException {
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
		try {
			Robot robot = new Robot();
			String question=" ";
			Scanner inputer= new Scanner(System.in);
			robot.mouseMove(175,82);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(200);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			//type("This is a test of the Java Robot class");
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
				robot.delay(500);
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
				//robot.mouseRelease(InputEvent.BUTTON1_MASK);
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
				robot.delay(1000);
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
				char[] fullQuestionArray = result.toCharArray();
				one("one");
				String options = correct();
				String correctAnswer = "";
				String[] words = options.split("\\W+");
				System.out.println(Arrays.toString(words));
				for(int i=0;i<words.length;i++) {
					 if(words[i].equals("Correct")){
						 correctAnswer = words[i-1].toString();
					 } else if (words[i].equals("Your")){
						 correctAnswer = words[i-1].toString();
					 }
				}
				for (int i = 0; i < fullQuestionArray.length; i++) {
					if ((fullQuestionArray[i] == zero || fullQuestionArray[i] == one || fullQuestionArray[i] == two || fullQuestionArray[i] == three || fullQuestionArray[i] == four || fullQuestionArray[i] == five || fullQuestionArray[i] == six || fullQuestionArray[i] == seven || fullQuestionArray[i] == eight || fullQuestionArray[i] == nine) && (fullQuestionArray[i+1] == w)) {
						if (i == 0) {
							number1 = Arrays.copyOfRange(fullQuestionArray, 0, 1);  
							questionArray = Arrays.copyOfRange(fullQuestionArray, 1, 23);  
							numberOfDigits = 1;
						} else if (i == 1) {
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
				Connection con=DriverManager.getConnection("jdbc:mysql://hackathon.cliosjusorja.us-east-1.rds.amazonaws.com:3306/Questions","Hackathon","Hackathon");
				Statement myStmt = con.createStatement();
				if (numberOfDigits == 1) {
					String b = new String(number1);
					int i = Integer.parseInt(b);

					myStmt.execute("INSERT INTO questionsTable " + "VALUES ( '" + i +"', '" + result + "', '"+ correctAnswer +"')");
				} else if (numberOfDigits == 2) {
					String b = new String(number2);
					int i = Integer.parseInt(b);

					myStmt.execute("INSERT INTO questionsTable " + "VALUES ( '" + i +"', '" + result + "', '"+correctAnswer+"')");

				} else {
					String b = new String(number3);
					int i = Integer.parseInt(b);

					myStmt.execute("INSERT INTO questionsTable " + "VALUES ( '" + i +"', '" + result + "', '"+correctAnswer+"')");

				}
		 }
		 catch (AWTException e) {
	            e.printStackTrace();
	     }
		
	}
	@SuppressWarnings("deprecation")
	static void one (String choice) {
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
			/*robot.mouseMove(378,400);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.delay(200);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			robot.delay(200);*/
		}
		catch (AWTException e) {
	        e.printStackTrace();
	    }
	}
	
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
			
			//System.out.println("String from Clipboard:" + result);
			
			
		}
		catch (AWTException e) {
	        e.printStackTrace();
	    }
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		String result = (String)clipboard.getData(DataFlavor.stringFlavor);
		return result;
		
	}
	
	
	
	
}
