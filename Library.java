
/**
 * This is the super class that links all the items together.
 * Storing the item number of each item
 */
// Super class Library
public class Library
{
	protected int LibraryID;
		
	// Constructor
	public Library ()
	{
		LibraryID = 0;
	}
	
	// set library id
	public void setLibraryID(int LibraryID)
	{
		this.LibraryID = LibraryID;
	} // end method setLibraryID
	
	// get library id
	public int getLibraryID()
	{
		LibraryID++; // increments the Library ID for each item
		return LibraryID;
	} // end method getLibraryID
	
	public String DisplayItemNumber()
	{
		return ("Item - " + getLibraryID());
	}
}