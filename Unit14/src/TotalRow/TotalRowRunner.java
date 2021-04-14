package TotalRow;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import MatrixCount1.MatrixCount1;

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow myRows = new TotalRow();
		int[][] myList = {{1,2,3},{5,5,5,5}};
		System.out.println(myRows.getRowTotals(myList));
	}
}



