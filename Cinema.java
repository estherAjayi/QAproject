import java.util.Scanner;

public class Cinema
{ 
	public static void main(String[] args)
	{ 
		String userInput ="";
		Scanner scanner= new Scanner(System.in); 
		StandardTicket standard = new StandardTicket();
		StudentTicket student = new StudentTicket();
		OapTicket oap = new OapTicket();
		ChildTicket child = new ChildTicket();
		
		System.out.println("Hi There. Welcome to QA Cinemas");
		
		while (!userInput.equals("no"))
		{
			System.out.println("What kind of ticket would you like to purchase? standard, student, oap or child");
			userInput= scanner.nextLine();
			
			//checks whether the user has typed in a ticket type
			while (!userInput.equals("standard") && !userInput.equals("oap")
				&& !userInput.equals("student") && !userInput.equals("child"))
			{
				System.out.println("Try again");
				userInput = scanner.nextLine ();
			}
			
			int noOfTickets = 0;
			switch (userInput)
			{
				case "standard":
					System.out.println("How many standard tickets would you like to buy?");
					//Stores number of tickets that user has typed in
					noOfTickets = scanner.nextInt();
					scanner.nextLine();
			
					standard.buy(noOfTickets);
					System.out.println("You have bought " + standard.totalBought + " standard tickets ");
					break;
			
			
			case "student":
					System.out.println("How many student tickets would you like to buy?");
					//Stores number of tickets that user has typed in
					noOfTickets = scanner.nextInt();
					scanner.nextLine();
			
					student.buy(noOfTickets);
					System.out.println("You have bought " + student.totalBought + " student tickets ");
					break;
					
			case "oap":
					System.out.println("How many oap tickets would you like to buy?");
					//Stores number of tickets that user has typed in
					noOfTickets = scanner.nextInt();
					scanner.nextLine();
			
					oap.buy(noOfTickets);
					System.out.println("You have bought " + oap.totalBought + " oap tickets ");
					break;
					
			case "child":
					System.out.println("How many child tickets would you like to buy?");
					//Stores number of tickets that user has typed in
					noOfTickets = scanner.nextInt();
					scanner.nextLine();
			
					child.buy(noOfTickets);
					System.out.println("You have bought " + child.totalBought + " child tickets ");
					break;
			
			}
			
		System.out.println("---------------------------------------------------");
		System.out.println("**Receipt**");
		System.out.println("Standard: " + standard.totalBought + " \u00a3" + standard.totalPrice);
		System.out.println("Student: " + student.totalBought + " \u00a3" + student.totalPrice);
		System.out.println("Oap: " + oap.totalBought + " \u00a3" + oap.totalPrice);
		System.out.println("Child: " + child.totalBought + " \u00a3" + child.totalPrice);
		System.out.println("Your total is: \u00a3" + standard.entirePrice);
		System.out.println(" Your WEDNESDAY total is: \u00a3" + standard.entirePriceWed);
		System.out.println("---------------------------------------------------");
		
		System.out.println("Would you like to buy more tickets?");
		userInput = scanner.nextLine();
		
		
		
		}
		
	}
}
	