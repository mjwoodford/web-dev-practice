package vid_005_arithmetic_expressions.ArithmeticExpressions;


public class Main {

	public static void main(String[] args) {
		// expression = operands & operators
		// operands include values, variables, numbers, quantity
		// operators inlcude = + - * / %
		
		//int pals = 15;
		double pals = 15;
		System.out.println("pals: " +pals);
		
		pals = pals - 3;
		System.out.println("pals after losing 3: " +pals);
		
		pals = pals + 4;
		System.out.println("pals after making 4 friends: " +pals);
		
		pals = pals * 3;
		System.out.println("pals after peace: " +pals);
		
		pals = pals/2;
		System.out.println("pals after war: " +pals);
		
		pals = pals % 17;
		pals++;
		pals--;
		System.out.println("pals with no dads: " +pals);

		pals = (double) pals / 2;
		System.out.println("pals with no moms: " +pals);




		
		
	}
}