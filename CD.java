
/**
 * This class stores all the details of one of the Library items , a cd
 */
public class CD extends Library
{
	private String CDTitle;
	private String CDDetails;
	private String ReturnDate;
	private String loan;
		
	public CD (String CDTitle , String CDDetails , String loan , String ReturnDate)
	{
		this.CDTitle = CDTitle;
		this.CDDetails = CDDetails;
		this.loan = loan;
		this.ReturnDate = ReturnDate;
	}

	// getter for CD Title
	public String getCDTitle()
	{
		return CDTitle;
	}
	
	// setter for CD Title
	public void setCDTitle (String CDTitle)
	{
		this.CDTitle = CDTitle;
	}
	
	// getter for CD Artist
	public String getCDDetails()
	{
		return CDDetails;
	}
	
	// setter for CD Artist
	public void setCDDetails (String CDDetails)
	{
		this.CDDetails = CDDetails;
	}
	
	// getter for CD Loan
	public String getLoan()
	{
		return loan;
	}
	
	// setter for CD Loan
	public void setLoan(String loan)
	{
		this.loan = loan;
	}
	
	// getter for CD ReturnDate
	public String getReturnDate()
	{
		return ReturnDate;
	}
	
	// setter for CD ReturnDate
	public void setReturnDate (String ReturnDate)
	{
		this.ReturnDate = ReturnDate;
	}	
}
