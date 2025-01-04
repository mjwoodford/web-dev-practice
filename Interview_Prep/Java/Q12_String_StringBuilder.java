public class Q12_String_StringBuilder {
	public static void main(String[] args) {
		// String (immutable)
		String str = "Part 1";

		//Creates a new String Object
		str = str + " + Part 2";

		// StringBuilder (mutable)
		StringBuilder sb = new StringBuilder("Part 3");

		//Modifies the existing StringBuilder object
		sb.append(" + Part 4");
		System.out.println(str);
		System.out.println(sb);
	}
}
