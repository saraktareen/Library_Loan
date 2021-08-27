
/**
 * This class stores all the details of one of the Library items , a book
 */
// Use of inheritance where book is a child class
public class Book extends Library
{
	// Attributes of book class
	private String BookTitle; // Stores the title of the book
	private String BookDetails; // Stores the Author of the book
	private String loan; // Flag for if the book item is on loan

	private String ReturnDate; // Stores the Return Date of the book if on loan
		
	// Constructor of the attributes
	public Book (String BookTitle , String BookDetails , String loan , String ReturnDate )
	{
		this.BookTitle = BookTitle;
		this.BookDetails = BookDetails;
		this.loan = loan;
		this.ReturnDate = ReturnDate;
	}
	
	// getter for Book Title
	public String getBookTitle()
	{
		return BookTitle;
	}
	// setter for Book Title
	public void setBookTitle (String BookTitle)
	{
		this.BookTitle = BookTitle;
	}
	// getter for Book Author
	public String getBookDetails()
	{
		return BookDetails;
	}
	
	// setter for Book Author
	public void setBookDetails (String BookDetails)
	{
		this.BookDetails = BookDetails;
	}
	
	// getter for Book Loan
	public String getLoan()
	{
		return loan;
	}
	
	// setter for Book Loan
	public void setLoan(String loan)
	{
		this.loan = loan;
	}
	
	// getter for Book Return Date
	public String getReturnDate()
	{
		return ReturnDate;
	}
	
	// setter for Book Return Date
	public void setReturnDate (String ReturnDate)
	{
		this.ReturnDate = ReturnDate;
	}	
}

