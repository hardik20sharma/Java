package assignment2;
import java.util.Scanner;

public class UseCarRental
{
	public static void main(String[] args)
	{
		String renter_Name, size;
		int zipcode, days;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your name: ");
		renter_Name = scan.next();
		System.out.print("Enter zipcode: ");
		zipcode = scan.nextInt();
		System.out.print("Enter number of days: ");
		days = scan.nextInt();
		System.out.print("Enter car type (luxury/economy/midsize/fullsize):");
		size = scan.next();
		
		if(size == "luxury")
		{
			LuxuryCarRental car = new LuxuryCarRental(renter_Name, size, zipcode, days);
			car.addChauffer();
			car.display();
		}
		else
		{
			CarRental car = new CarRental(renter_Name, size, zipcode, days);
			car.display();
		}
		scan.close();
	}
}
