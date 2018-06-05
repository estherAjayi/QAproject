public class StandardTicket
{
	//static allows it to only have one variable which is shared across the classes. Entire price is the price of all the 4 types of tickets combined.
	//Different to total price because total Price unique to each class.
	public static int entirePrice= 0;
	public static int entirePriceWed = 0;
	
	// price of standard ticket on regular day and on Wednesday
	public int price = 8;
	public int priceWed = 6;
	
	//amount of tickets bought
	public int totalBought = 0;
	
	//total price of tickets bought
	public int totalPrice = 0;
	public int totalPriceWed = 0;
	
	//Buy a standard ticket
	public void buy(int wantedTickets)
	{
			totalBought = totalBought + wantedTickets;
			
			totalPrice = totalPrice + (price * wantedTickets);
			totalPriceWed = totalPriceWed + (priceWed * wantedTickets);
			
			entirePrice = entirePrice + (price * wantedTickets);
			entirePriceWed = entirePriceWed + (priceWed * wantedTickets);
	}
}