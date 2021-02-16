package MoreAPlus;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
   public static String go( String a )
	{
	   String aplus = "aplus";
	   int firstAplus = a.indexOf(aplus);
	   if(firstAplus != -1 && a.indexOf(aplus, firstAplus + 1) != -1 ) 
	   {
		   return "yes";
	   }
	   else return "no";
	  
	}
   public static String soc(String a) {
	  
	   if(a.indexOf("-", 3) != -1 && a.indexOf("-", 6) != -1)
		{
		   return a.substring( a.length() - 4, a.length() );
		}

		else { return "bad"; }
				   
	   
   }
   
}
