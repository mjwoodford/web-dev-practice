
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Greetings, "+ name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Wow, you are "+ age + " years old.");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Wow, you are "+ height + " height tall.");
	}
}	
