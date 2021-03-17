package ToyStore;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		for(String name : toys.split(" "))
		{
			Toy myToy = getThatToy(name);
			if(myToy == null)
			{
				toyList.add(new Toy(name));
			}
			else
			{
				myToy.setCount(myToy.getCount() + 1);
			}
			
			
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		int size = toyList.size();
  		
  		for(int i = 0; i < size; i++)
  		{
  			if(toyList.get(i).getName().equals(nm))
  			{
  				return toyList.get(i);
  			}
  			
  			
  		}
  		
  		
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int maxToy = toyList.get(0).getCount();
  		String toyName = toyList.get(0).getName();
  		int size = toyList.size();
  		for(int i = 0; i < size; i++)
  		{
  			if(toyList.get(i).getCount() > maxToy)
  			{
  				maxToy = toyList.get(i).getCount();
  				toyName = toyList.get(i).getName();
  			}
  			
  		}
  		
  		
  		return toyName;
  	}  
  
  	public void sortToysByCount()
  	{
  		
  		ArrayList<Toy> myToy = new ArrayList<Toy>();
  		int count = 0;
  		int size = toyList.size();
  		
  		for(int i = size; i > 0; i--)
  		{
  			
  			myToy.add(new Toy(getMostFrequentToy()));
  			myToy.get(count).setCount(getThatToy(getMostFrequentToy()).getCount());
			toyList.remove(getThatToy(getMostFrequentToy()));
			count++;
  			
  		}
  		
  		toyList = myToy;
 
  		
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}