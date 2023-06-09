package Facebook;
import java.util.Scanner;
public class Facebook {

	
		static Scanner s=new Scanner(System.in);

		static boolean did_sign_up_done=false;
		//states
		public String db_user_name="ram",db_dob="01-04-2005";
		private int db_email,db_pwd;
		private long db_contact;

		//constructors

		public Facebook(){
			//LI
			
		}
		public Facebook(int E,int P,long C){
			db_email=E;
			db_pwd=P;
			db_contact=C;
		}

		public int getdb_email(){
			return db_email;
		}

		public void setdb_email(int email){
			if (verification())
			{
				db_email=email;
				System.out.println("sucessfully updated");
			}
			else{
				System.out.println("Verification Failed");
			}
		}

		public int getdb_pwd(){
			return db_pwd;
		}

		public void setdb_pwd(int password){
			if (verification())
			{
				db_pwd=password;
				System.out.println("sucessfully updated");

			}
			else{
				System.out.println("Verification Failed");
			}
		}

		public long getdb_contact(){
			return db_contact;
		}

		public void setdb_contact(long contact){
			if (verification())
			{
				db_contact=contact;
				System.out.println("sucessfully updated");

			}
			else{
				System.out.println("Verification Failed");
			}
		}


	

	public boolean verification(){
		
		System.out.println("Enter the contact");
		
		Long user_enterted_contact=s.nextLong();

		if (user_enterted_contact==db_contact)
		{
			//contact is correct
			double otp=Math.random()*9999+9999;
			int sys_otp=(int)otp;
			System.out.println(sys_otp);
			int user_enterted_otp=s.nextInt();
			if (sys_otp==user_enterted_otp)
			{
				return true;
			}
			else{
				System.err.println("Wrong otp");

				return false;
			}


		}
		return false;
	}

		//signup
		public void signup(){
			System.out.println("Enter the Email");
			this.db_email=s.nextInt();
			System.out.println("Create a Strong password");
			this.db_pwd=s.nextInt();
			System.out.println("Enter the contact");
			this.db_contact=s.nextLong();
			did_sign_up_done=true;
		}

		//login
	public void login(){
		if(did_sign_up_done){
			System.out.println("Enter the Email");
			int user_enterted_email=s.nextInt();
			System.out.println("Enter the Password");
			int user_enterted_pwd=s.nextInt();
			if (user_enterted_pwd==db_pwd&&user_enterted_email==db_email)
			{
				//Login Created
			}
			else{
				System.out.println("Login Failed");
			}
		}
		else{
			System.out.println(" First Signup Plz....");
		}
	}
	}

