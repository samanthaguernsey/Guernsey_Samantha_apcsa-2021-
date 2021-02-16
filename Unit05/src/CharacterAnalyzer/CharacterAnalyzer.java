package CharacterAnalyzer;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = 0;
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(theChar >= 65) {
			if(theChar<=90) {
				return true;
			}
		}
		return false;
	}

	public boolean isLower( )
	{
		if(theChar >= 97) {
			if(theChar <= 122) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isNumber( )
	{
		if(theChar>=48) {
			if(theChar <= 57) {
				return true;
			}
		}
		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if(isNumber()) {
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		if(isUpper()) {
			return getChar() + "is an uppercase char. ASCII == " + getASCII() + "\n";
		}
		return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
	}
}