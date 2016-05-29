package control;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zahlenraten
{
	static int randomnumber;
	static int playernumber;
	static JTextField textField;
	static JTextArea textArea;
	static int counter;
	static int i;
	
	public static void createRandomNumber()
	{
		randomnumber = (int) (Math.random()*1000);
		System.out.println(randomnumber);
	}
	
	public static void checkNumber()
	{
		textArea.setText("joooooooo des funzt");
		playernumber = Integer.parseInt(textField.getText());
		
		while(playernumber != randomnumber)
		{
			counter++;
			
			if(playernumber < randomnumber)
			{
				textArea.setText("Zahl zu klein");
				calculate();
				textArea.setText("Du brauchst mindestens noch " + i + " Versuche!");
			}
			
			if(playernumber > randomnumber)
			{
				textArea.setText("Zahl zu groﬂ");
				calculate();
				textArea.setText("Du brauchst mindestens noch " + i + " Versuche!");
			}
			
			if(playernumber == randomnumber)
			{
				textArea.setText("Hurra, du hast " + counter + " Versuche gebraucht");
			}
		}
	}
	
	public static void calculate()
	{
		while(i <= 1)
		{
			i = randomnumber/2;
			randomnumber = i;
		}
	}
}
