package vid_004_user_input.AcceptVideoInput;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner color_scanner = new Scanner(System.in);

		System.out.println("What is your favorite color, stranger?");

		String color = color_scanner.nextLine();

		System.out.println("Why did you pick " + color + " when Burlywood is way better.");

		System.out.println("What's your favorite miles per hour?");

		int speed = color_scanner.nextInt();

		/* used to clear /n in scanner */
		color_scanner.nextLine();
	

		System.out.println("You should try to run at " + speed + " miles per hour and see how it easy it is.");

		System.out.println("What's your favorite food, stranger?");
		String food = color_scanner.nextLine();

		System.out.println("It seems we don't have " + food + " at the bar.");
		color_scanner.close();
		/*
		if((color.equals("Burlywood")) or (color.equals("burlywood"))) {
			System.out.println("Smart Choice, stranger");d

		}
		else
		{
			System.out.println("Why did you pick " + color + " when Burlywood is way better.");
		}
			*/
	}
}