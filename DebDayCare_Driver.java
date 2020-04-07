package assignment1;
import java.util.Scanner;

public class DebDayCare_Driver {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DebDayCare d = new DebDayCare();
		int year, task_id, emp_code, no_of_children, no_of_hours, id, wage;
		String name;
		
		System.out.print("Enter the Name: "); name = scan.nextLine();
		System.out.print("Enter the Employee code: "); emp_code = scan.nextInt();
		System.out.print("Enter the Employee wage: "); wage = scan.nextInt();

		// Year
		System.out.print("Enter the Year: ");
		do 
		{
			year = scan.nextInt();
			if(year < 2019 || year > 2030)
				System.out.print("Invalid Year, Enter again: ");
		} while(year < 2019 || year > 2030);

		// Task ID
		System.out.print("Enter Task ID: ");
		do
		{ 
			task_id = scan.nextInt();
		if (task_id < 1 || task_id > 9999)
			System.out.print("Invalid ID, Enter again: ");
		} while(task_id < 1 || task_id > 9999);

		// Number of children
		System.out.print("Enter the number of children: ");
		do
		{
			no_of_children = scan.nextInt();
			if (no_of_children < 1 || no_of_children > 7)
				System.out.print("Invalid amount, Enter again: ");
		} while(no_of_children < 1 || no_of_children > 7);

		// Hours
		System.out.print("Enter the number of hours: ");
		do
		{
			no_of_hours = scan.nextInt();
			if (no_of_hours < 1 || no_of_hours > 12)
				System.out.print("Invalid amount, Enter again: ");
		} while(no_of_hours < 1 || no_of_hours > 12);
	
		id = (year % 100)*10000 + task_id;
		d.set_Details(id, name, emp_code, no_of_children, no_of_hours, wage);
		d.display_Details();
		scan.close();
	}
}