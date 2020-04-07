package assignment2;
import java.util.Scanner;

public class LuxuryCarRental extends CarRental 
{
	int chauffer;
	double chauffer_fees = 0;
	
	public LuxuryCarRental(String renter_Name, String size, int zipcode, int days)
	{
		this.renter_Name = renter_Name;
		this.size = size;
		this.zipcode = zipcode;
		this.days = days;
		
		daily_Fees = 79.99;
		total_Fees = daily_Fees * days;
	}
	
	public void addChauffer()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Do you wish to add Chauffer for $200 per day (0 for No, 1 for Yes): ");
		do
		{
			chauffer = scan.nextInt();
			System.out.print("Wrong option, please select again: ");
		} while(chauffer != 0 && chauffer != 1);
		
		chauffer_fees = 200 * days;
		total_Fees += chauffer_fees;
		scan.close();
	}
	
	public void display()
	{
		System.out.println("Renter's Name: " + renter_Name);
		System.out.println("Size: " + size);
		System.out.println("Zipcode: " + zipcode);
		System.out.println("Days: " + days);
		System.out.println("Daily Fees: " + daily_Fees);
		System.out.println("Total Fees: " + total_Fees);
		System.out.println("Chauffer Fees: " + chauffer_fees);
	}
}
