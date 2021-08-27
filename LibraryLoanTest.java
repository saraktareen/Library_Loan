
/**
 * Tester class that prints out all the report as well as writes it into a file
 */
// Imports used for File Handling method
import java.io.FileWriter;
import java.io.IOException;

// Used to format the current date
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LibraryLoanTest 
{
        static String Date = "000000"; // Stores the return date of items on loan
	public static void main (String[] args)
	{	
		// Creating arrays Book
		Library[] books = new Book[5];
		books[0] = new Book ("Never Never" , "Colleen Hoover" , "no" , "000000" );
		books[1] = new Book ("Little Women" , "Louisa May Alcott" , "yes" , "000000");
		books[2] = new Book ("The Scarlet Letter" , "Nathaniel Hawthorne" , "yes" , "000000");
		books[3] = new Book ("The Great Gatsby" , "F. Scott Fitzgerald" , "no" , "000000" );
		books[4] = new Book ("Gullivers Travels" , "Jonathan Swift" , "yes" , "000000"  );
					
		// Creating arrays DVD
		Library[] dvd = new DVD[5];
		dvd[0] = new DVD ("The Godfather" , "G.P Putnam's Sons" , "yes" , "000000");
		dvd[1] = new DVD ("Pulp Fiction" , "Disney" , "yes" , "000000");
		dvd[2] = new DVD ("Young Guns" , "Austin Moorhead" , "no" , "000000");
		dvd[3] = new DVD ("Scarface" , "A.L.Burt.Co" , "yes" , "000000");
		dvd[4] = new DVD ("Se7en" , "Zenescope Entertainment" , "no" , "000000");

		// Creating arrays CD
		Library[] cd = new CD[5];
		cd[0] = new CD ("Hybrid Theory" , "Linkin Park" , "no" , "000000");
		cd[1] = new CD ("The Wall" , "Pink Floyd" , "yes" , "000000");
		cd[2] = new CD ("Black In Black" , "AC/DC" , "yes" , "000000");
		cd[3] = new CD ("Eagles" , "Hotel California" , "no" , "000000");
		cd[4] = new CD ("Thriller" , "Micheal Jackson" , "no" , "000000");

		// Creating arrays Magazine
		Library[] magazine = new Magazine[5];
		magazine[0] = new Magazine ("National Geographic" , "The National Graphic Society" , "yes" , "000000");
		magazine[1] = new Magazine ("Cosmopolitan" , "Hearst Communications" , "yes" , "000000");
		magazine[2] = new Magazine ("AllRecipes" , "Karla Dartilla" , "yes" , "000000");
		magazine[3] = new Magazine ("Good House Keeping" , "Hearst Communications" , "no" , "000000");
		magazine[4] = new Magazine ("The New Yorker" , "Conde Nast" , "yes" , "000000");

		// Methods
		PrintHeadings(); // Method to print heading
		PrintItems(books , dvd , cd , magazine); // Method to print out the items
		FileHandling(books , dvd , cd , magazine); // Method to write the report into a file
	}
	
	// Prints the top-most part of the report
	public static String PrintHeadings() 
	{ 
		// Shows the current date
		LocalDate now = LocalDate.now();
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("yy/MM/dd");
		System.out.print("-------------------------- REPORT -------------------------- \n");
		System.out.print("\t\t\t\t     Date: " + datetimeformat.format(now) + " (YYMMDD)\n");
		System.out.print("\nItem# | Type | Title | Loan | Date |" );
		System.out.print("\n");
		return null;
	}
	
	// Method to print the items
	public static String PrintItems(Library[] books , Library[] dvd , Library[] cd , Library[] magazine)
	{
	       // Creating objects of classes
	       Library library = new Library(); // Creating an object for the Library class
	       LoanItem loanitem = new LoanItem(); // Creating an object for the LoanItem class
	       Date currentDate = new Date();

	       final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // Days of each month

	       DateFormat yearFormat = new SimpleDateFormat("yy");
	       DateFormat monthFormat = new SimpleDateFormat("MM");
	       DateFormat dayFormat = new SimpleDateFormat("dd");
		
		
	       String ItemName = null; // To store the name of the item
	       String Title = null; // Store the title and author/publisher of the item
	       String Loan = null; // Store the value of loan
	       int ItemsCount = 0; // Counts the number of items
	       int day , month , year; // Stores the current day , month & year
	       int LoanDuration = 14; // Loan duration for all the items
	    
	       int item = 1; // Item depicts the 4 items in the library 
					
	    // Item 1 is equal to book
	    while ( item == 1)
	    {	
	        // Loop to run through all the values of the books array
	        for (int ItemCounter = 0; ItemCounter <= 4; ItemCounter++)
	        {
	            ItemName = "Book";
	            Title = (((Book)books[ItemCounter]).getBookTitle()); //value of details is stored
	            Loan = (((Book)books[ItemCounter]).getLoan()); // value of loan is stored
	            
	            if (Loan == "yes")
	            {
	                loanitem.getOnLoanCounter(); 	// The counter is incremented when the item is on loan
	                day = Integer.parseInt(dayFormat.format(currentDate)); // Converts the day value to an integer
	                month = Integer.parseInt(monthFormat.format(currentDate)); // Converts the month value to an integer
	                year = Integer.parseInt(yearFormat.format(currentDate)); // Converts the year value to an integer
	                
	                day = (day + LoanDuration); // Adds the loan duration to current days
	                
	                // Month changes if the days + loan duration is more than days in the current month
	                if (day > daysPerMonth[month]) 
	                {
	                    day = (day - daysPerMonth[month]);
	                    month++;
	                }
						
	               /*
	                   *  Month assigned one when month value greater than 12
	                   *  Year increased by one
	                */
	               if (month > 12)
	               {
	                   month = 1;
	                   year++;
	               }
	               
	               // Formatting of the date to ensure it is only 6 digits 
	               if (day < 10)
	               {
	                   Date = String.valueOf(year) +  String.valueOf(month) + "0" + String.valueOf(day);
	               }
	               else if (month < 10)
	               {
	                   Date = String.valueOf(year) + "0" + String.valueOf(month) + String.valueOf(day);
	               }
	               else if (day < 10 && month < 10)
	               {
	                   Date = String.valueOf(year) + "0" + String.valueOf(month) + "0" + String.valueOf(day);
	               }
	               else Date = String.valueOf(year) + String.valueOf(month) + "0" + String.valueOf(day);
	           }
	               else Date = (((Book)books[ItemCounter]).getReturnDate()); // value of return date is stored
	           			
	           // Printing statement for each individual Book
	           System.out.print(library.DisplayItemNumber() + " , " 
                                     + ItemName + " , " 
                                     + Title + " , " 
                                     + Loan + " , " 
                                     + Date + "\n");
                     ItemsCount++; // Increments counter to calculate the total number of items
		}
					item++; // Increments item by 1 after all the Books are printed out
	     }
		
             // Item 2 is equal to DVD	
             while ( item == 2)
             {	
        	// Loop to run through all the values of the DVD array
        	for (int ItemCounter = 0; ItemCounter <= 4; ItemCounter++)
        	{
        	    ItemName = "DVD";
        	    Title = (((DVD) dvd[ItemCounter]).getDVDTitle()); //value of details is stored
        	    Loan = (((DVD)dvd[ItemCounter]).getLoan()); // value of loan is stored
        									
            	   // The counter is incremented when the item is on loan
            	   if (Loan == "yes")
            	   {
        		loanitem.getOnLoanCounter();
        							
        		day = Integer.parseInt(dayFormat.format(currentDate)); // Converts the day value to an integer
        		month = Integer.parseInt(monthFormat.format(currentDate)); // Converts the month value to an integer
        		year = Integer.parseInt(yearFormat.format(currentDate)); // Converts the year value to an integer
        												
        		day = (day + LoanDuration); // Adds the loan duration to current days
        						
        		// Month changes if the days + loan duration is more than days in the current month
        		if (day > daysPerMonth[month])
        		{
        		    day = (day - daysPerMonth[month]);
        		    month++;
        		}
        						
        		/*
        		*  Month assigned one when month value greater than 12
        		*  Year increased by one
        		*/
        		if (month > 12)
        		{
        		    month = 1;
        		    year++;
        		}
        						
        		// Formatting of the date to ensure it is only 6 digits
        		if (day < 10)
        		{
        		    Date = String.valueOf(year) +  String.valueOf(month) + "0" + String.valueOf(day);
        		}
        		else if (month < 10)
        		{
        		    Date = String.valueOf(year) + "0" + String.valueOf(month) + String.valueOf(day);
        		}
        		else if (day < 10 && month < 10)
        		{
        		    Date = String.valueOf(year) + "0" + String.valueOf(month) + "0" + String.valueOf(day);
        		}
        		else Date = String.valueOf(year) + String.valueOf(month) + "0" + String.valueOf(day);
        	   }
        		else Date = (((DVD)dvd[ItemCounter]).getReturnDate()); // value of return date is stored
        						
        	// Printing statement for each individual DVD
        	System.out.print(library.DisplayItemNumber() + " , " 
                                  + ItemName + " , " 
                                  + Title + " , " 
                                  + Loan + " , " 
                                  + Date + "\n");
        	ItemsCount++; // Increments counter to calculate the total number of items							
        	}
        	item++; // Increments item by 1 after all the DVD are printed out
    	     }
									
    	// Item 3 is equal to CD
    	while ( item == 3)
    	{	
    	     // Loop to run through all the values of the CD array
    	    for (int ItemCounter = 0; ItemCounter <= 4; ItemCounter++)
    	    {
    	        ItemName = "CD";
    	        Title = (((CD) cd[ItemCounter]).getCDTitle()); //value of details is stored
    	        Loan = (((CD)cd[ItemCounter]).getLoan()); // value of loan is stored
    											
    	        // The counter is incremented when the item is on loan
    	        if (Loan == "yes")
    	        {
    	            loanitem.getOnLoanCounter();
    	            day = Integer.parseInt(dayFormat.format(currentDate)); // Converts the day value to an integer
    	            month = Integer.parseInt(monthFormat.format(currentDate)); // Converts the month value to an integer
    	            year = Integer.parseInt(yearFormat.format(currentDate)); // Converts the year value to an integer
    								
    	            day = (day + LoanDuration); // Adds the loan duration to current days
    					
    	            // Month changes if the days + loan duration is more than days in the current month
    	            if (day > daysPerMonth[month])
    	            {
    	                day = (day - daysPerMonth[month]);
    	                month++;
    	            }
    					
    	            /*
    	            *  Month assigned one when month value greater than 12
    	            *  Year increased by one
    	            */
    	           if (month > 12)
    	           {
    	               month = 1;
    	               year++;
    	           }
    					
    	           // Formatting of the date to ensure it is only 6 digits
    	           if (day < 10)
    	           {
    	               Date = String.valueOf(year) +  String.valueOf(month) + "0" + String.valueOf(day);
    	           }
    	           else if (month < 10)
    	           {
    	               Date = String.valueOf(year) + "0" + String.valueOf(month) + String.valueOf(day);
    	           }
    	           else if (day < 10 && month < 10)
    	           {
    	               Date = String.valueOf(year) + "0" + String.valueOf(month) + "0" + String.valueOf(day);
    	           }
    	           else Date = String.valueOf(year) + String.valueOf(month) + "0" + String.valueOf(day);
    	        }
    	           else Date = (((CD)cd[ItemCounter]).getReturnDate()); // value of return date is stored
    				
    	           // Printing statement for each individual CD
    	           System.out.print(library.DisplayItemNumber() + " , " 
                                        + ItemName + " , " 
                                        + Title + " , " 
                                        + Loan + " , " 
                                        + Date + "\n");
                       ItemsCount++; // Increments counter to calculate the total number of items
                 }
    			item++;	// Increments item by 1 after all the CD are printed out
    	}
    				
    						
    	// Item 4 is equal to Magazine
    	while ( item == 4)
    	{	
    	    // Loop to run through all the values of the magazine array
    	    for (int ItemCounter = 0; ItemCounter <= 4; ItemCounter++)
    	    {
    	        ItemName = "Magazine";
    	        Title = (((Magazine) magazine[ItemCounter]).getMagazineTitle()); //value of details is stored
    	        Loan = (((Magazine)magazine[ItemCounter]).getLoan()); // value of loan is stored
    	        Date = (((Magazine)magazine[ItemCounter]).getReturnDate()); // value of return date is stored
    							
    	        // The counter is incremented when the item is on loan
    	        if (Loan == "yes")
    	        {
    	            loanitem.getOnLoanCounter();
    						
    	            day = Integer.parseInt(dayFormat.format(currentDate)); // Converts the day value to an integer
    	            month = Integer.parseInt(monthFormat.format(currentDate)); // Converts the month value to an integer
    	            year = Integer.parseInt(yearFormat.format(currentDate)); // Converts the year value to an integer
    								
    	            day = (day + LoanDuration); // Adds the loan duration to current days
    						
    	            // Month changes if the days + loan duration is more than days in the current month
    	            if (day > daysPerMonth[month])
    	            {
    	                day = (day - daysPerMonth[month]);
    	                month++;
    	            }
    						
    	            /*
    		     *  Month assigned one when month value greater than 12
    		     *  Year increased by one
    		     */
    		    if (month > 12)
    		    {
    			month = 1;
    			year++;
    		    }
    						
    		    // Formatting of the date to ensure it is only 6 digits
    		    if (day < 10)
    		    {
    		        Date = String.valueOf(year) +  String.valueOf(month) + "0" + String.valueOf(day);
    		    }
    		    else if (month < 10)
    		    {
    		        Date = String.valueOf(year) + "0" + String.valueOf(month) + String.valueOf(day);
    		    }
    		    else if (day < 10 && month < 10)
    		    {
    		        Date = String.valueOf(year) + "0" + String.valueOf(month) + "0" + String.valueOf(day);
    		    }
    			else Date = String.valueOf(year) + String.valueOf(month) + "0" + String.valueOf(day);
    		}
    		        else Date = (((Magazine)magazine[ItemCounter]).getReturnDate()); // value of return date is stored
    					
    	     // Printing statement for each individual Magazine
    	     System.out.print(library.DisplayItemNumber() + " , " 
                               + ItemName + " , " 
                               + Title + " , " 
                               + Loan + " , " 
                               + Date + "\n");
             ItemsCount++; // Increments counter to calculate the total number of items
    	     }
    			item++; // Increments item by 1 after all the Magazine are printed out		
    	}
	
		System.out.print("\n ----------------------------------------------------------");
		System.out.print("\n TOTAL:   " + ItemsCount + loanitem.DisplayOnLoanCounter());
		return null;
       }
	
       public static void FileHandling(Library[] books , Library[] dvd , Library[] cd , Library[] magazine )
       {
           Library library = new Library(); // Creating an object for the library class
           LoanItem loanitem = new LoanItem(); // Creating an object for the LoanItem class
		
           try
           {
		FileWriter myWriter = new FileWriter("CourseworkLibraryLoanSystem.txt"); // Name of the text file to write the data in
		LocalDate now = LocalDate.now(); // Shows the current date
		DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("yy/MM/dd"); // Data format
		myWriter.write("-------------------------- REPORT -------------------------- \n");
		myWriter.write("\t\t\t\t     Date: " + datetimeformat.format(now) + " (YYMMDD)\n"); // Displays the current date
		myWriter.write("\nItem# | Type | Title | Loan | Date |" );
		
		// Loops through all the indexes of the array books
		for (int i = 0; i <= 4; i++)
		{
			myWriter.write("\n" + library.DisplayItemNumber() + " , " 
					+ "Book" + " , " 
					+ ((Book)books[i]).getBookTitle() + " , " 
					+ ((Book)books[i]).getLoan());
				
			if (((Book)books[i]).getLoan() == "yes")
			{
                           myWriter.write(" , " + Date); // Writes the calculated Return Date only if the loan is a yes
                           loanitem.getOnLoanCounter(); // When the item is on loan the value is incremented
			}
			else myWriter.write((" , " + ((Book)books[i]).getReturnDate())); // Otherwise write the standard return date
			}
			
	       // Loops through all the indexes of the array dvd
		for (int i = 0; i <= 4; i++)
		{
			myWriter.write("\n" + library.DisplayItemNumber() + " , " 
					+ "DVD" + " , " 
					+ ((DVD)dvd[i]).getDVDTitle() + " , " 
					+ ((DVD)dvd[i]).getLoan());
			
			if (((DVD)dvd[i]).getLoan() == "yes")
			{
			    myWriter.write(" , " + Date); // Writes the calculated Return Date only if the loan is a yes
			    loanitem.getOnLoanCounter(); // When the item is on loan the value is incremented
			}
			else myWriter.write((" , " + ((DVD)dvd[i]).getReturnDate())); // Otherwise write the standard return date
                }
			
		// Loops through all the indexes of the array cd
		for (int i = 0; i <= 4; i++)
		{
			myWriter.write("\n" + library.DisplayItemNumber() + " , " 
			                    + "CD" + " , " 
					    + ((CD)cd[i]).getCDTitle() + " , " 
			         	    + ((CD)cd[i]).getLoan());
				
			if (((CD)cd[i]).getLoan() == "yes")
			{
                            myWriter.write(" , " + Date); // Writes the calculated Return Date only if the loan is a yes
     			    loanitem.getOnLoanCounter(); // When the item is on loan the value is incremented
			}
			else myWriter.write((" , " + ((CD)cd[i]).getReturnDate())); // Otherwise write the standard return date
		}
			
		// Loops through all the indexes of the array magazine
		for (int i = 0; i <= 4; i++)
		{
			myWriter.write("\n" + library.DisplayItemNumber() + " , " 
   					    + "Magazine" + " , " 
					    + ((Magazine)magazine[i]).getMagazineTitle() + " , " 
					    + ((Magazine)magazine[i]).getLoan());
				
			if (((Magazine)magazine[i]).getLoan() == "yes")
			{
				myWriter.write(" , " + Date);// Writes the calculated Return Date only if the loan is a yes
				loanitem.getOnLoanCounter();// When the item is on loan the value is incremented
			}
				else myWriter.write((" , " + ((Magazine)magazine[i]).getReturnDate())); // Otherwise write the standard return date
		}
			myWriter.write("\n ----------------------------------------------------------");
			myWriter.write("\n TOTAL:   " + (library.getLibraryID() - 1) + " items with " + (loanitem.getOnLoanCounter()) + " on loan \n"); // Prints the summary of the report
			myWriter.close(); // Closes the file
			System.out.println("\n Successfully written to the file"); // When the file is updated this statement is printed out
            }
		
	     catch (IOException e) // Catches an exception
	     {
		System.out.println("An error occurred"); // Prints this statement our if an exception occurs
		e.printStackTrace();
             }
	}
}