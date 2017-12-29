import javax.swing.*;

public class Average {
	public static void main (String args []) {
		String numbersTotalString;
		double sum = 0;
		double average;
		String numberString;
		double numbersTotalDouble;
		double counter = 0;
		double numberDouble;
		
		try {
		numbersTotalString = JOptionPane.showInputDialog("How many numbers do you wish to find the average?");
		numbersTotalDouble = Double.parseDouble(numbersTotalString);
		
		while (counter < numbersTotalDouble) {
			numberString = JOptionPane.showInputDialog("Enter a number");
			numberDouble = Double.parseDouble(numberString);
			sum = sum + numberDouble;
			counter++;
		}
		
		average = sum / numbersTotalDouble;
		
		JOptionPane.showMessageDialog(null, "The Average of the numbers is " + average);
		}
		
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You have exited the program");
		}
	}
}
