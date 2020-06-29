package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			System.out.println("Yay! You have the day off to relax.");
			break;
		case "Monday":
			System.out.println("First day of the week, how does it feel?");
			break;
		case "Tuesday":
			System.out.println("How's it feeling after yesterday?  You can get through it!");
			break;
		case "Wednesday":
			System.out.println("Humpday!  Keep it going!");
			break;
		case "Thursday":
			System.out.println("Throwback Thursday!  Listen to some oldies.");
			break;	
		case "Friday":
			System.out.println("Almost to the weekend!  Kepp up the hard work!");
			break;
		case "Saturday":
			System.out.println("Woohoo the weekend!");
			break;
		}
			
			
		
	}
}
