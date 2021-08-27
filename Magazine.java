
/**
 * This class stores all the details of one of the Library items , a dvd *
 */
// Use of inheritance where the magazine is the child class
public class Magazine extends Library
{
	// Attributes of magazine class
	private String MagazineTitle; // Stores the title of the magazine
	private String MagazineDetails; // Stores the Publisher name of the magazine
	private String loan; // Stores whether the magazine is on loan
	private String ReturnDate; // Stores the Return Date of the magazine
		
	// Constructor of the attributes
	public Magazine (String MagazineTitle , String MagazineDetails , String loan , String ReturnDate)
	{
		this.MagazineTitle = MagazineTitle;
		this.MagazineDetails = MagazineDetails;
		this.loan = loan;
		this.ReturnDate = ReturnDate;
	}
	
	// getter for Magazine Title
	public String getMagazineTitle()
	{
		return MagazineTitle;
	}
	
	// getter for Magazine Title
	public void setMagazineTitle (String MagazineTitle)
	{
		this.MagazineTitle = MagazineTitle;
	}
	
	// getter for Magazine Publisher
	public String getMagazineDetails()
	{
		return MagazineDetails;
	}
	
	// getter for Magazine Publisher
	public void setMagazineDetails (String MagazineDetails)
	{
		this.MagazineDetails = MagazineDetails;
	}
	
	// getter for Magazine Title
	public String getLoan()
	{
		return loan;
	}
	
	// getter for Magazine Loan
	public void setLoan(String loan)
	{
		this.loan = loan;
	}
	
	// getter for Magazine Return Date
	public String getReturnDate()
	{
		return ReturnDate;
	}
	
	// getter for Magazine Return Date
	public void setReturnDate (String ReturnDate)
	{
		this.ReturnDate = ReturnDate;
	}
	
}
