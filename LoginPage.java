package Movie_Tickets;
import java.util.*;
class LoginPage implements Login_validation,Signup,Booking
{
	String s1 = ""; 
	String s2 = "";
	boolean p = true;
	public String CreateAccount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username:");
		String username = sc.nextLine();
		s1 = username;
		System.out.print("Enter the password:");
		String password = sc.nextLine();
		if(password.length()>=8 && password.length()<=14)
		{
			s2 = password;
			System.out.print("Enter the mobile number:");
			long z = sc.nextLong();
			return "Account created sucessfully";
		}
		else
		{
			p = false;
			return "Create a password that contains Minimum of 8 to Maximum of 14 Characters";
		}
	}
	public String login()
	{
		if(p==true)
		{
			System.out.println("Welcome to Login Page");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter username:");
			String user = sc.nextLine();
			System.out.print("Enter the password:");
			String pass = sc.nextLine();
			if(s1.equals(user) && s2.equals(pass))
			{
				return "Login Sucesssful";
			}
			return "Invalid Username/Password";
		}
		return "Create a valid Password to Login";
	}
	public void bookingStatus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select theater type");
		System.out.println("1.Multiplex");
		System.out.println("2.Single screen");
		int a = sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Available Multiplex Theaters");
			System.out.println("1.VPC");
			System.out.println("2.AMB");
			System.out.println("3.PVR");
			int s1 = sc.nextInt();
			int sum = 0;
			if(s1==1 ||s1==2 || s1==3)
			{
				if(s1==1)
				{
					System.out.println("Select No of Seats:");
					int z = sc.nextInt();
					if(z<=6)
					{
						System.out.println("Ticket Details");
						System.out.println("VPC Theater");
						System.out.println("Film name : OG");
						System.out.println("Your Seats Are");
						for(int i=1;i<=z;i++)
						{
							System.out.print("A"+i+" ");
							sum = sum+250;
						}
						System.out.println();
						System.out.println("Show timings: "+"6:30PM TO 9:30PM");
						System.out.println("Total Fair:"+sum);
					}
					else
					{
						System.out.println("You can only book 6 seats at a time");
					}
				}
				else if(s1==2)
				{
					System.out.println("Select No of Seats:");
					int z = sc.nextInt();
					if(z<=6)
					{
						System.out.println("Ticket Details");
						System.out.println("AMB Theater");
						System.out.println("Film name : OG");
						System.out.println("Your Seats Are");
						for(int i=1;i<=z;i++)
						{
							System.out.print("A"+i+" ");
							sum = sum+250;
						}
						System.out.println();
						System.out.println("Show timings: "+"6:30PM TO 9:30PM");
						System.out.println("Total Fair:"+sum);
					}
					else
					{
						System.out.println("You can only book 6 seats at a time");
					}
				}
				else if(s1==3)
				{
					System.out.println("Select No of Seats:");
					int z = sc.nextInt();
					if(z<=6)
					{
						System.out.println("Ticket Details");
						System.out.println("PVR Theater");
						System.out.println("Film name : OG");
						System.out.println("Your Seats Are");
						for(int i=1;i<=z;i++)
						{
							System.out.println("A"+i+" ");
							sum = sum+250;
						}
						System.out.println();
						System.out.println("Show timings: "+"6:30PM TO 9:30PM");
						System.out.println("Total Fair:"+sum);
					}
					else
					{
						System.out.println("You can only book 6 seats at a time");
					}
				}
			}
			else
			{
				System.out.println("Enter a valid option");
			}
			break;
		case 2 :
			System.out.println("Available Single Screen Theaters");
			System.out.println("1.Anusri cinemas");
			System.out.println("2.Venakata Ramana");
			int s2 = sc.nextInt();
			int sum1 = 0;
			if(s2==1 ||s2==2)
			{
				if(s2==1)
				{
					System.out.println("Select No of Seats:");
					int z = sc.nextInt();
					if(z<=6)
					{
						System.out.println("Ticket Details");
						System.out.println("Anusri cinemas");
						System.out.println("Film name : OG");
						System.out.println("Your Seats Are");
						for(int i=1;i<=z;i++)
						{
							System.out.print("A"+i+" ");
							sum1 = sum1+150;
						}
						System.out.println();
						System.out.println("Show timings: "+"6:30PM TO 9:30PM");
						System.out.println("Total Fair:"+sum1);
					}
					else
					{
						System.out.println("You can only book 6 seats at a time");
					}
				}
				else if(s2==2)
				{
					System.out.println("Select No of Seats:");
					int z = sc.nextInt();
					if(z<=6)
					{
						System.out.println("Ticket Details");
						System.out.println("venkatarama Theater");
						System.out.println("Film name : OG");
						System.out.println("Your Seats Are");
						for(int i=1;i<=z;i++)
						{
							System.out.print("A"+i+" ");
							sum1 = sum1+150;
						}
						System.out.println();
						System.out.println("Show timings: "+"6:30PM TO 9:30PM");
						System.out.println("Total Fair:"+sum1);
					}
					else
					{
						System.out.println("You can only book 6 seats at a time");
					}
				}
			}
			else
			{
				System.out.println("You can only book 6 seats at a time");
			}
			break;
		default:
			System.out.println("Choose the correct option");
		}		
	}
}
