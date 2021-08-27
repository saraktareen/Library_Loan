
/**
  * This class stores all the details of one of the Library items , a dvd
 */
public class DVD extends Library
{
	private String DVDTitle;
	private String DVDDetails;
	private String ReturnDate;
	private String loan;
		
	public DVD (String DVDTitle , String DVDDetails , String loan , String ReturnDate)
	{
		this.DVDTitle = DVDTitle;
		this.DVDDetails = DVDDetails;
		this.loan = loan;
		this.ReturnDate = ReturnDate;
	}
	
	// getter for DVD Title
	public String getDVDTitle()
	{
		return DVDTitle;
	}
	
	// setter for DVD Title
	public void setDVDTitle (String DVDTitle)
	{
		this.DVDTitle = DVDTitle;
	}
	
	// getter for DVD Publisher
	public String getDVDDetails()
	{
		return DVDDetails;
	}
	
	// setter for Magazine Publisher
	public void setDVDDetails (String DVDDetails)
	{
		this.DVDDetails = DVDDetails;
	}
	
	// getter for DVD Loan
	public String getLoan()
	{
		return loan;
	}
	
	// setter for DVD Loan
	public void setLoan(String loan)
	{
		this.loan = loan;
	}
	
	// getter for DVD Return Date
	public String getReturnDate()
	{
		return ReturnDate;
	}
	
	// setter for DVD Return Date
	public void setReturnDate (String ReturnDate)
	{
		this.ReturnDate = ReturnDate;
	}	
}
