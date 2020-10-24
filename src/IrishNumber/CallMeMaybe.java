/**
 *@author Miriam 
 *ID 2019430
 *GitHub --  https://github.com/miriamaraujo/
 */

package IrishNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallMeMaybe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Here I have decided to go for BufferedReader to handle the user input

		do {
			System.out.println("Please insert your number in the following format 081 1234567 or 081-1234567");

			try {
//				As I am using BufferedReader I had to surround this block with try-catch 
				userInput = br.readLine();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Invalid Input");
			}

		} while (!userInput.contains(" ") && !userInput.contains("-")); // here it checks the presence of a dash or
																		// space in the user input

		if (userInput.length() < 11 || userInput.length() > 11) {// the length will be of 11 as I am counting the dash
																	// or space inserted
			System.out.println("Sorry, your phone number must be 10 digits long.");
		} else {
			String prefix = userInput.substring(0, 3);//here I am selecting the first digits that are the prefix
			String userNumber = userInput.substring(4);// here the rest of the number

			if (prefix.matches("085") || prefix.matches("086")
					|| prefix.matches("087") && userNumber.matches("[0-9]+")) {
//				with the string prefix I check if they match the requirements using the string method Matches
//				to check the rest of the number I use Regex where they must be whole numbers from 0-9.
				System.out.println("YOU HAVE ENTERED A VALID NUMBER");
				System.out.println("Prefix " + prefix + " Number " + userNumber);
				System.out.println("Thanks, I will call you tomorrow");

			} else {
				System.out.println("Invalid number please check it and try again");
//				If invalid characters be inserted this message will be displayed
				
				}

		}

	}

}
