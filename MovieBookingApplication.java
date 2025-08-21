package Movie_Tickets;
import java.util.Scanner;
public class MovieBookingApplication
{
	public static void main(String[]args)
	{
		System.out.println("Welcome to Movie Ticket Booking");
		System.out.println("To Book a Movie Ticket");
		System.out.println("1.Signup & Login");
		System.out.println("2.BookTickets");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		LoginPage l = new LoginPage();
		boolean b = false;
		if(a==1)
		{
			System.out.println("1.Welcome to Signup");
			System.out.println();
			System.out.println(l.CreateAccount());
			System.out.println();
			System.out.println(l.login());
		}
		else if(a==2)
		{
			System.out.println("Welcome to Ticket Booking page");
			l.bookingStatus();
		}		
		else
		{
			System.out.println("Please choose correct option");
		}
	}
}
