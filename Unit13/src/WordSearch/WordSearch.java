package WordSearch;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int i = 0;
    	for(int r = 0; r < size; r++)
    	{
    		for(int c = 0; c < size; c++)
    			
    		{
    			m[r][c] = str.substring(i++,i); //adding letter, auto incrementing i, incrementing i and going to next (i and i + 1)
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	boolean found = false;
    	int len = m.length;
    	for(int r = 0; !found && r < len; r++)
    	{
    		for(int c = 0; !found && c < len; c++)
    		{
    			if(word.substring(0,1).equals(m[r][c]))
    			{
    				found = checkRight(word, r, c, len) || 
    						checkLeft(word, r, c, len)  ||
    						checkUp(word, r, c, len)  ||
    						checkDown(word, r, c, len)  ||
    						checkDiagUpRight(word, r, c)  ||
    						checkLeft(word, r, c, len)  ||
    						checkDiagDownLeft(word, r, c)  ||
    						checkDiagDownRight(word, r, c);
    			}
    		}
    	}
    	return found;
    }

	public boolean checkRight(String w, int r, int c, int len)
   {
		int i = 0;
		while(i < w.length())
		{
			if(c + i < 0 || c + i >= len)
			{
				return false;
			}
			if(!w.substring(i,i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c, int len)
	{
		int i = 0;
		while(i < w.length())
		{
			if(c-i <0 || c-i>= len)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c, int len)
	{
		int i = 0;
		while(i < w.length())
		{
			if(r-i <0 || r-i>= len)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c, int len)
   {
		int i = 0;
		while(i < w.length())
		{
			if(c - i < 0 || c + i >= len)
			{
				return false;
			}
			if(!w.substring(i,i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{

		int i = 0;
		while(i < w.length())
		{
			if(r+i <0 || r+i>= c)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{

		int i = 0;
		while(i < w.length())
		{
			if(r+i <0 || r+i>= c)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {

		int i = 0;
		while(i < w.length())
		{
			if(c - i < 0 || c + i >= c && c-i <0 || c-i>= c)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{

		int i = 0;
		while(i < w.length())
		{
			if(c + i < 0 || c + i >= c && c+i <0 || c-i>= c)
			{
				return false;
			}
			if(!w.substring(i, i+1).equals(m[r][c]))
			{
				return false;
			}
			i++;
		}
		return true;
	}

    public String toString()
    {
 		return "checked";
    }
}
