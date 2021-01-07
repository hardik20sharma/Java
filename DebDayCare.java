package assignment1;

public class DebDayCare 
{
	int id;
	String name;
	int employee_code;
	int no_of_children;
	int no_of_hours;
	int wage;
	
	DebDayCare()
	{
		id = employee_code = no_of_children = no_of_hours = wage = 0;
		name = null;
	}
	
	public void set_Details(int id, String name, int employee_code, int no_of_children, int no_of_hours, int wage)
	{
		this.id = id;
		this.name = name;
		this.employee_code = employee_code;
		this.no_of_children = no_of_children;
		this.no_of_hours = no_of_hours;
		this.wage = wage;
	}
	
	public void display_Details()
	{
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("Employee Code:" + employee_code);
		System.out.println("No. of children:" + no_of_children);
		System.out.println("No. of hours:" + no_of_hours);
		System.out.println("Wage:" + wage);
	}
}
