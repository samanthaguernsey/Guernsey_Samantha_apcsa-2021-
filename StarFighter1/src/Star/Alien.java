package Star;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,30,30,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("images/alien.JPG"));

		}
		catch(Exception e)
		{

		}
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("images/alien.JPG"));

		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return 0;
	}

   public void move(String direction)
	{
	   if (direction.equals("UP")) {
           super.setY(super.getY() + speed);
       }
       if (direction.equals("DOWN")) {
           super.setY(super.getY() - speed);
       }
       if (direction.equals("RIGHT")) {
           super.setX(getX() + speed);
       }
       if (direction.equals("LEFT")) {
           super.setX(getX() - speed);
       }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "Alien " + super.toString() + " Speed " + getSpeed();
	}
}
