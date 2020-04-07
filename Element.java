package assignment3_Metal;

abstract class Element
{
	String symbol;
	int atomic_number;
	double atomic_weight;
	
	Element(String symbol, int atomic_number, double atomic_weight)
	{
		this.symbol = symbol;
		this.atomic_number = atomic_number;
		this.atomic_weight = atomic_weight;
	}
	
//	public void setSymbol(String symbol, int atomic_number, double atomic_weight)
//	{ 
//		this.symbol = symbol;
//		this.atomic_number = atomic_number;
//		this.atomic_weight = atomic_weight;
//	}
	
	public String get_Symbol()			{ return symbol; 		}
	public int get_Atomic_Number()		{ return atomic_number; }
	public double get_Atomic_weight()	{ return atomic_weight; }
	
	abstract void describeElement();
}