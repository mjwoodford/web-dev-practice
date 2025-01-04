public class Q11_Conditionals {
	public static void main(String[] args) {
		//if-else conditions
		int age = 25;
		int height = 6;

		if (age < 18 && height < 5) {
			System.out.println("Minor & Short");
		} else if (age >= 18 && height > 6) {
			System.out.println("Adult and Tall");
		} else {
			System.out.println("Average");
		}

		// ternary operator
		boolean isUser = true;
		int user = isUser ? 0 : 1;
		System.out.println(user);

		// using switch statements
		int day = 2;
		String dayString;

		switch(day) {
			case 1:
				dayString = "Monday";
				break;
			case 2:
				dayString = "Tuesday";
				break;
			default:
				dayString = "No Day Selected";
				break;
		}
		System.out.println(dayString);
	}

	
}
