package vid_009_java_if_statements.JavaIfStatements;

public class Main {
	public static void main(String[] args) {
		// if statements is true, performs a block of code

		int age = 51;

		if((age >= 18) && (age < 50)) {
			System.out.println(age + " is greater than 17.");
		}
		else if(age >= 50) {
			System.out.println("you old");
		}
		else {
			System.out.println("you are tiny babey man.");
		}
	}
}
