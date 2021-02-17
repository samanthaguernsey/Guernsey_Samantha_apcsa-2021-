package CountPairs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;


import Perfect.Perfect; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("test_cases") );

		
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("ddogccatppig"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("dogcatpig"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("xxyyzz"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("a"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("abc"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("aabb"));
		System.out.println("Amount of pairs: " + CountPairs.pairCounter("dogcatpigaabbcc"));
	}
}