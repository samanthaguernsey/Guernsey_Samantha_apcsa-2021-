package RPS;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		
		out.println("\n" + "Rock-Paper-Scissors - pick your weapon[R,P,S] ");
		String playChoice = keyboard.nextLine();
		
		RockPaperScissors newGame = new RockPaperScissors(playChoice);
		
		out.println(newGame.toString());
		
		
		out.print("Hit enter to continue");
		String ans = keyboard.nextLine();
		
		
		while (ans == "") {
				
					out.println("\n" + "Rock-Paper-Scissors - pick your weapon[R,P,S] ");
					String playChoice2 = keyboard.nextLine();
					
					RockPaperScissors newGame2 = new RockPaperScissors(playChoice2);
					
					out.println(newGame2.toString());
					out.print("Hit enter to continue");
					ans = keyboard.nextLine();
					
				
				
				
				
			
		}
		
				
			
			
			
				
	}
}



