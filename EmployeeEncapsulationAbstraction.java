package prac;

public class EmployeeEncapsulationAbstraction
{
	private int empNum;
	
	public int getEmpNum()
	{
		return empNum;
	}
	
	public void setEmpNum(int emp)
	{
		empNum = emp;
	}
	
	public static void main (String[] args)
	{
		EmployeeEncapsulationAbstraction e = new EmployeeEncapsulationAbstraction();
		e.setEmpNum(3);
		System.out.print(e.getEmpNum());
	}
}