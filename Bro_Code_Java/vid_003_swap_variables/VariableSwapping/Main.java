package vid_003_swap_variables.VariableSwapping;

public class Main {
	public static void main(String[] args) {
		String x = "Water";
		String y = "Gatorade";

		System.out.println("\nCup 1 is: "+x);
		System.out.println("Cup 2 is: "+y);

		System.out.println("\nSwapping Cups with a third cup 3");

		System.out.println("\nCup 1 is: "+x);
		System.out.println("Cup 2 is: "+y);
		System.out.println("Cup 3 is: empty");

		System.out.println("\nSwapping");
		String z = x;
		System.out.println("Pouring Cup 1 into Cup 3");
		
		System.out.println("\nCup 1 is: empty");
		System.out.println("Cup 2 is: "+y);
		System.out.println("Cup 3 is: "+z);
		x = y;

		System.out.println("Pouring Cup 2 into Cup 1");
		System.out.println("\nCup 1 is: "+x);
		System.out.println("Cup 2 is: empty");
		System.out.println("Cup 3 is: "+z);

		y = z;
		
		System.out.println("Pouring Cup 3 into Cup 2");
		System.out.println("\nCup 1 is: "+x);
		System.out.println("Cup 2 is: "+y);
		System.out.println("Cup 3 is: empty");

		System.out.println("Cups 1 and 2 have been swapped via a temporary Cup 3");

	} 
}
