package RPS;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors //works with just runner
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		playChoice = player;
	}

	public void setPlayers(String player)
	{
		playChoice = player;
	}
	
	public String determineWinner()
	{
		int rand = (int)(Math.random() * 3);
		String compChoice = "";
		
		if(rand == 0)
		{
			compChoice = "R";
			
		}
		else if (rand == 1)
		{
			compChoice = "P";
			
		}
		else
		{
			compChoice = "S";
		}

			
		
		if(playChoice.equals(compChoice))
		{
			return "Computer had " + compChoice + "\n" + "!Draw Game!";
		}
		else if ((playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("S") && compChoice.equals("P")) || (playChoice.equals("P") && compChoice.equals("R)")  ))
		{
			return "Computer had " + compChoice + "\n" + "!Player wins";
		}
		else
		{
			return "Computer had " + compChoice + "\n" + "!Computer wins";
		}
		

	}

	public String toString()
	{
		setPlayers(playChoice);
		String output = determineWinner();
	
		
		return output;
	}
}