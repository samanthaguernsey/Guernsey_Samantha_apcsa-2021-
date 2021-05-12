package Pong3;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		setxSpeed(3);
		ySpeed = 1;
	}

	//add the other Ball constructors
	
	public Ball(int x, int y)
	{
		super(x, y);
		setxSpeed(3);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int wid, int ht)
	{
		super(x, y, wid, ht);
		setxSpeed(3);
		setxSpeed(1);
	}
	
	public Ball(int x, int y, int wid, int ht, Color col)
	{
		super(x, y, wid, ht, col);
		setxSpeed(3);
		setxSpeed(1);
	}
	
	public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd)
	{
		super(x, y, wid, ht);
		setxSpeed(xSpd);
		setxSpeed(ySpd);
	}
	
	public Ball(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
	{
		super(x, y, wid, ht, col);
		setxSpeed(xSpd);
		setxSpeed(ySpd);
	}
	
	public void setXSpeed(int xSpd)
	{
		setxSpeed(xSpd);
	}
	
	public void setYSpeed(int ySpd)
	{
		ySpeed = ySpd;
	}
	
	
	


   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.white);

      setX(getX()+getxSpeed());
		//setY
      setY(getY()+ySpeed);
		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball)obj;
		if(super.equals(other) && getXSpeed() 
				== other.getXSpeed() 
				&& getYSpeed() == other.getYSpeed())
		{
			return true;
		}



		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return getxSpeed();
	}
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	
   //add a toString() method
	public String toString()
	{
		return super.toString() + "xSpeed: " + getxSpeed() + "ySpeed: " + ySpeed;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
}
