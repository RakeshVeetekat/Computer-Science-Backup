/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
  // Fields:
	private int priceOf = 0;
	private int stock = 0;
	private int deposit = 0;
	
	private static double totalSales = 0;
  
  /**
   * Constructs a Vendor
   * @param price the price of a single item in cents (int)
   * @param stock number of items to place in stock (int)
   */
  Vendor(int price,int stockGiven)
  {
    
	  priceOf = price;
	  stock = stockGiven;
	  
  }

  /**
   * Sets the quantity of items in stock.
   * @param qty number of items to place in stock (int)
   */
  void setStock(int quantity)
  {
	  
	  stock = quantity;
	  
  }

  /**
   * Returns the number of items currently in stock.
   * @return number of items currently in stock (int)
   */
  int getStock()
  {
	   
	return stock;
    
  }

  /**
   * Adds a specified amount (in cents) to the
   * deposited amount.
   * @param number of cents to add to the deposit (int)
   */
  void addMoney(int moneyToAdd)
  {
    
	  deposit += moneyToAdd;
	  
  }

  /**
   * Returns the currently deposited amount (in cents).
   * @return number of cents in the current deposit (int)
   */
  int getDeposit()
  {
	  
	return deposit;
    
  }

  /**
   * Implements a sale.  If there are items in stock and
   * the deposited amount is greater than or equal to
   * the single item price, then adjusts the stock
   * and calculates and sets change and returns true;
   * otherwise refunds the whole deposit (moves it into
   * change) and returns false.
   * @return true for a successful sale, false otherwise (boolean)
   */
  boolean makeSale()
  {
	
	if(stock > 0 && deposit >= priceOf)
	{
		
		stock -= 1;
		deposit -= priceOf;
		totalSales = totalSales + ((double)priceOf)/100;
		return true;
		
	}
	else
	{
		
		deposit = 0;
		return false;
		
	}
	  
  }

  /**
   * Returns and zeroes out the amount of change (from
   * the last sale or refund).
   * @return number of cents in the current change (int)
   */
  int getChange()
  {
	    
	return deposit;
    
  }
  
  public static double getTotalSales()
  {
	  
	  double placeholder = totalSales;
	  totalSales = 0;
	  return placeholder;
	  
  }
}
