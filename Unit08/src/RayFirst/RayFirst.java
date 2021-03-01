package RayFirst;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		int count = 0;
		int newNum = 0;
        for (int number : ray) {
            if (number == newNum) {
                count++;
            }
        }

        if (count > 1) {
            return true;
        }

        return false;
    }
	}
//set, call, then return