import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		double x;
		double y;
		double z;

		double a;
		double b;
		double c;

		Scanner numScanner = new Scanner(System.in);

		System.out.println("Enter side x: ");
		x = numScanner.nextDouble();
		System.out.println("Enter side y: ");
		y = numScanner.nextDouble();
		
		double r = Math.max(x,y);
		System.out.println(r);
		r = Math.min(x,y);
		System.out.println(r);
		r = Math.abs(y);
		System.out.println(r);
		r = Math.round(x);
		System.out.println(r);
		r = Math.sqrt(x);
		System.out.println(r);
		r = Math.ceil(x);
		System.out.println(r);
		r = Math.floor(x);
		System.out.println(r);


		z = Math.sqrt((x*x) + (y*y));
		System.out.println("The first hypotenuse is: "+z +"\n");

		System.out.println("Enter side a: ");
		a = numScanner.nextDouble();
		System.out.println("Enter side b: ");
		b = numScanner.nextDouble();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("The second hypotenuse is: "+c +"\n");

		int diff = (int) (z/c * 100);
		


		System.out.println("The first hypotenuse is roughly "+diff +"% of the size of the second hypotenuse");

		numScanner.close();
	}
}