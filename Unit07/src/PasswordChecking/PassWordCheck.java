package PasswordChecking;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		password  = "Password123";
	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		while (true)
        {
            String enterPass;
            System.out.println("Enter the password :: ");
            enterPass = keyboard.nextLine();
            if (!password.equals(enterPass)) {
                System.out.println("INVALID");
                continue;
            }
            break;
        } 
        System.out.println("VALID");
	}




}
