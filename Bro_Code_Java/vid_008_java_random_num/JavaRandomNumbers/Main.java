package vid_008_java_random_num.JavaRandomNumbers;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random_int = new Random();

		int x = random_int.nextInt(6)+1;

		System.out.println(x);

		double y = random_int.nextDouble();

		System.out.println(y);

		boolean z = random_int.nextBoolean();

		System.out.println(z);
	}
}
