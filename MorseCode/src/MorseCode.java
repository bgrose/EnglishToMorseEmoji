/*
 * Bradley Grose
 * Intented for Nathan 1223Y
 * 5/23/2020
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args){

	    char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
	                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
	                  ',', '.', '?' };

	    String[] morse = { ":eye::eyes:", ":eyes::eye::eye::eye:", ":eyes::eye::eyes::eye:", ":eyes::eye::eye:", ":eye:", ":eye::eye::eyes::eye:", ":eyes::eyes::eye:", ":eye::eye::eye::eye:", ":eye::eye:", 
                ":eye::eyes::eyes::eyes:", ":eyes::eye::eyes:", ":eye::eyes::eye::eye:", ":eyes::eyes:", ":eyes::eye:", ":eyes::eyes::eyes:", ":eye::eyes::eyes::eyes::eye:", ":eyes::eyes::eye::eyes:", ":eye::eyes::eye:",
                ":eye::eye::eye:", ":eyes:", ":eye::eye::eyes:", ":eye::eye::eye::eyes:", ":eye::eyes::eyes:", ":eyes::eye::eye::eyes:", ":eyes::eye::eyes::eyes:", ":eyes::eyes::eye::eye:", ":eye::eyes::eyes::eyes::eyes:",
                ":eye::eye::eyes::eyes::eyes:", ":eye::eye::eye::eyes::eyes:", ":eye::eye::eye::eye::eyes:", ":eye::eye::eye::eye::eye:", ":eyes::eye::eye::eye::eye:", ":eyes::eyes::eye::eye::eye:", ":eyes::eyes::eyes::eye::eye:", ":eyes::eyes::eyes::eyes::eye:",
                ":eyes::eyes::eyes::eyes::eyes:", ":eyes::eyes::eye::eye::eyes::eyes:", ":eye::eyes::eye::eyes::eye::eyes:", ":eye::eye::eyes::eyes::eye::eye:" };


	    Scanner keyboard = new Scanner(System.in);

	    do
	    {
	    System.out.println(" This is an English to Morse Code Translator.  ");
	    System.out.println(" Please enter what you would like translate ");
	    System.out.println("             into Morse Code. ");
	    System.out.println(" ============================================ ");

	    String userInput = keyboard.nextLine().toLowerCase();
	   

	    char[] chars = userInput.toCharArray();

	    String str = "";
	    for (int i = 0; i < chars.length; i++){
	        for (int j = 0; j < english.length; j++){

	            if (english[j] == chars[i]){
	                str = str + morse[j] + ":eye_in_speech_bubble:";  
	            }
	        }
	    }
	    System.out.println(str);
	    System.out.println("\n\n");
	    }while(1==1);
	} 
}
