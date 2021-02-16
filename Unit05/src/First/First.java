package First;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
	private String firstString;

	
	
	public First() {
		firstString = "";
		
	}
	
	public First(String a) {
		firstString = "";
		
	}
	
	public void setString(String a) {
		firstString  = a;
	
	}
	
	public String getFirstString() {
		return firstString;
	}
	
	
	public static String go( String a )
	{
		
		String firstLetter = a.substring(0,1);
		String restOfWord = a.substring(1, a.length());
		
		if(restOfWord.indexOf(firstLetter) != -1 || a.length() < 0) {
			return "yes";
		}
		else return "no";
	}
	
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/