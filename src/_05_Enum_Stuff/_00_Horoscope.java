package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void intakeZodiac(Zodiac z) {
		switch (z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You’re not the type to enjoy upholding stuffy traditions; you are an innovator");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You have a good sense of what things you stand for.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "You are in a much more stable financial position than you think.");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Let your emotions guide you. If the thought of breaking free fills you with relief, then it’s time to part ways.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "People will be there for you, and want to see you succeed.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Feel free to back out of some obligations today.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Getting a change of scenery will help expand your mind and your excitement for the future.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Filling the gaps in your knowledge has become crucial.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "By taking responsibility for your feelings, you can finally break away from a toxic situation today.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Containing your feelings may no longer be an option.  Follow your heart.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Be the one to make your own decisions.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Put all of your energy toward relationships that make you feel uplifted and supported today. ");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac[] options = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, 
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, 
				Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};
		int object = JOptionPane.showOptionDialog(null, "Choose your zodiac sign:", "Custom Buttons", 0, -1, null, options, 0);
		
		Zodiac zodiac = options[object];
		intakeZodiac(zodiac);
	}
}
