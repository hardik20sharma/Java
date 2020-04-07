package assignment3_Metal;

class MetalElement extends Element 
{
	MetalElement(String symbol, int atomic_number, double atomic_weight)
	{
		super(symbol, atomic_number, atomic_weight);
	}
	
	public void describeElement() 
	{
		System.out.print("Symbol: " + symbol);
		System.out.print("Atomic Number: " + atomic_number);
		System.out.print("Atomic Weight: " + atomic_weight);
		System.out.print("Description: " + "Metals are good conductors of electricity");
	}
}