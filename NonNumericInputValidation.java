package week5;
import java.util.Scanner;
public class NonNumericInputValidation {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		boolean valid = false;
		do {
			System.out.print("Do you like to code in Java?: ");
			String userInput = in.nextLine();
			boolean answer = true;
			do {

				if(userInput.equalsIgnoreCase("Y")) {
					System.out.print("That's great! I do too!");
					answer = true;
				}else if (userInput.equalsIgnoreCase("N")) {
					System.out.print("That's ok. There are many other wonderful things in life to learn.");
					answer = true;
				}
				else {
					System.out.print("Invalid Response! Please answer with a 'Y' or 'N'.");
					valid = false;
				}
			}while (!answer);
		}while (!valid);
		in.close();
	}

}
