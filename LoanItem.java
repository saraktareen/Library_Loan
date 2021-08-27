
/**
 * This class is for those items that are on loan , getting a count of all the items on loan.
 */
// Use of inheritance where the LoanItem is the child class
public class LoanItem extends Library 
{
	private int OnLoanCounter; // Counts the items that are on loan
	
	public LoanItem()
	{
		OnLoanCounter = -1; // Starts with -1 because we call the method an extra time
	}
	
	// Constructor
	public void setOnLoanCounter(int OnLoanCounter)
	{
		this.OnLoanCounter = OnLoanCounter;
	}
	
	// Getter for OnLoanCounter
	public int getOnLoanCounter()
	{
		OnLoanCounter++; // Each time the method is called the value of OnLoanCounter is incremented
		return OnLoanCounter;
	}
	
	// String method to display the result in the summary of the report
	public String DisplayOnLoanCounter()
	{
		return ( " items with " + getOnLoanCounter() + " on loan \n");
	}
}