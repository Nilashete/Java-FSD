package checkemailid;

import java.util.Scanner;

public class EmailVerfication {
	public static void main(String[] args)  {
		Boolean flag=false;
		String emails[]=new String[5];
		emails[0]="nilashete234@gmail.com";
		emails[1]="satyamshete@gmail.com";
		emails[2]="shivamshete@gmail.com";
		emails[3]="satyamshete1234@gmail.com";
		emails[4]="satya@gmail.com";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email id= ");
		String userEmail=sc.next();
		
		for(String email:emails)
		{
			if(userEmail.matches(email))
			{
				System.out.println("your account is verified "+userEmail+" ");
				flag=true;
				break;
				
			}
		}
		if(flag==false)
			{
				System.out.println("Invalid Email id...\n check once");	
			}
	}
}	
