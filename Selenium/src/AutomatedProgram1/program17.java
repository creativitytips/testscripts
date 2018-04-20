package AutomatedProgram1;

public class program17 {
	
		private int amount; // declaring the element using private access modifier
public program17 (int amount)
{
	this.amount=amount;
}

public int getter()
{
	return amount;
}

public static void main(String[] args)
{
	program17 sneha = new program17(200000);// declaring in constructor
	System.out.println(sneha.getter());
	
	program17 shraddha = new program17(100000);
	System.out.println(shraddha.getter());
}
}