public class ChildTicket extends StandardTicket
{
	public int price = 4;
	public int priceWed = 2;
	
	
	public int totalBought = 0;
	
	
	public int totalPrice = 0;
	public int totalPriceWed = 0;
	
	//Buy a Child ticket
	public void buy(int wantedTickets)
	{
			totalBought = totalBought + wantedTickets;
			
			totalPrice = totalPrice + (price * wantedTickets);
			totalPriceWed = totalPriceWed + (priceWed * wantedTickets);
			
			entirePrice = entirePrice + (price * wantedTickets);
			entirePriceWed = entirePriceWed + (priceWed * wantedTickets);
			
			
	}
}