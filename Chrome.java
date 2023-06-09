package Facebook;
import java.util.Scanner;
public class Chrome 
{
	static Scanner s=new Scanner(System.in);
	static Facebook fb=new Facebook();
	public static void main(String[] args) { 
	boolean b1=true;
	do{
		System.out.println("\t\t welcome to FaceBook");
		System.out.println("select the input");
		System.out.println("1.Signup\n2.Login\n3.Forgotten credentials\n4.Exit\n");
		int input=s.nextInt();
		switch (input)
		{
		case 1:{
			//signup
			fb.signup();
			break;}
		case 2:{
			fb.login();
			break;}
		case 3:{
			//forgotten credentials
			forgottencredentials();
			break;}
		case 4:{
			b1=false;
			break;}

			default: {
				System.err.println("\t\t Input mismatch");
			}
		
		}
		
	}while(b1);
}

public static void forgottencredentials(){

	boolean b2=true;

	do
	{
		System.out.println("\t\t Select the credentials");
		System.out.println("1.Email\n2.password\n3.contact\n4.Exit");
		int input=s.nextInt();

		if (input==1)
		{//Email
			boolean b3=true;
			do
			{
				System.out.println("1.Get Email\n2.Set Email\n3.Exit");
				int inp2=s.nextInt();
				if (inp2==1)
				{
					//get email
					System.out.println("Your Email is :"+fb.getdb_email());
				}
				else if (inp2==2)
				{
					System.out.println("Enter a New Email");
					fb.setdb_email(s.nextInt());
				}
				else{
					b3=false;
				}
			}
			while (b3);

		}else if (input==2)
		{//get or set password
			boolean b3=true;
			do
			{
				System.out.println("1.Get Password\n2.Set password\n3.Exit");
				int inp2=s.nextInt();
				if (inp2==1)
				{
					
					System.out.println("Your Password is :"+fb.getdb_pwd());
				}
				else if (inp2==2)
				{
					System.out.println("Enter a New password");
					fb.setdb_pwd(s.nextInt());
				}
				else{
					b3=false;
				}
			}
			while (b3);

		}
		else if (input==3)
		{//get or set contact
			boolean b3=true;
			do
			{
				System.out.println("1.Get contact\n2.Set contact\n3.Exit");
				int inp2=s.nextInt();
				if (inp2==1)
				{
					
					System.out.println("Your contact  is :"+fb.getdb_contact());
				}
				else if (inp2==2)
				{
					System.out.println("Enter a New contact");
					fb.setdb_contact(s.nextLong());
				}
				else{
					b3=false;
				}
			}
			while (b3);

		}else if (input==4)
		{
			//exit
			b2=false;
		}
		else{
			System.err.println("Input Mis Match");
		}
	}
	while (b2);
	
}
}

