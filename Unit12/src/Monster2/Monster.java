package Monster2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster()
	{
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		myWeight = 0;
		this.myHeight = ht;
		myAge = 0;
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt)
	{
		this.myWeight = wt;
		this.myHeight = ht;
		this.myAge = 0;
		
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age)
	{
		this.myWeight = wt;
		this.myHeight = ht;
		this.myAge = age;
		
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht)
	{
		this.myHeight = ht;
	}
	public void setWeight(int wt)
	{
		this.myWeight = wt;
	}
	public void setAge(int age)
	{
		this.myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight()
	{
		return this.myHeight;
	}
	public int getWeight()
	{
		return this.myWeight;
	}
	public int getAge()
	{
		return this.myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		
		if( this.compareTo(obj) == 0 )
		{
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if( this.myHeight == rhs.getHeight())
		{
			if( this.myWeight == rhs.getWeight())
			{
				if(this.myAge == rhs.getAge())
				{
					return 0;
				}
				else if( this.myAge > rhs.getAge())
				{
					return 1;
				}
				else return -1;
			}
			else if ( this.myWeight > rhs.getWeight())
			{
				return 1;
			}
			else return -1;
		}
		else if( this.myHeight > rhs.getHeight())
		{
			return 1;
		}
		else return -1;



		
	}

	public String toString()
	{
		
		return String.format("%d %d %d", myHeight, myWeight, myAge);
			
		
	}
	
	
}