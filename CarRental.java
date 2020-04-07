package assignment2;

public class CarRental
{
	String renter_Name, size;
	int zipcode, days;
	double daily_Fees, total_Fees;
	
	CarRental() { }
	CarRental(String renter_Name, String size, int zipcode, int days)
	{
		this.renter_Name = renter_Name;
		this.size = size;
		this.zipcode = zipcode;
		this.days = days;
		
		if(size == "economy")
			daily_Fees = 29.99;
		else if(size == "midsize")
			daily_Fees = 38.99;
		else if(size == "fullsize")
			daily_Fees = 43.50;
		
		total_Fees = daily_Fees * days;
	}
	
	public void display()
	{
		System.out.println("Renter's Name: " + renter_Name);
		System.out.println("Size: " + size);
		System.out.println("Zipcode: " + zipcode);
		System.out.println("Days: " + days);
		System.out.println("Daily Fees: " + daily_Fees);
		System.out.println("Total Fees: " + total_Fees);
	}
}