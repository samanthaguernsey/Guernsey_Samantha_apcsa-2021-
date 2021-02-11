package FirstLastVowel;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String firstLetter = a.substring(0,1);
	   String lastLetter = a.substring(a.length()-1);
	   
	   String vowels = "AEIOUaeiou";
	   if(vowels.indexOf(firstLetter) != -1 || vowels.indexOf(lastLetter)!= -1) 
	   {
		   return "yes";
	   }
	   else return "no";   
	 
	   
	   
	   
	
   
	
}
}