public class StudentTicket extends StandardTicket
{
	public int price = 6;
	public int priceWed = 4;
	
	
	public int totalBought = 0;
	
	
	public int totalPrice = 0;
	public int totalPriceWed = 0;
	
	//Buy a student ticket
	public void buy(int wantedTickets)
	{
			totalBought = totalBought + wantedTickets;
			
			totalPrice = totalPrice + (price * wantedTickets);
			totalPriceWed = totalPriceWed + (priceWed * wantedTickets);
			
			entirePrice = entirePrice + (price * wantedTickets);
			entirePriceWed = entirePriceWed + (priceWed * wantedTickets);
			
			
	}
}
