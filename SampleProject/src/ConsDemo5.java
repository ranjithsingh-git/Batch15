
public class ConsDemo5 
{

	int i = 10;
	ConsDemo5(int a)
	{
		System.out.println("cons of ConsDemo5");
		System.out.println(a);
		
		
	}
	
	
	public static void main(String[] args) 
	{
	
		//ConsDemo5 c1 = new ConsDemo5();
		//System.out.println(c1.i);

		ConsDemo5 c1 = new ConsDemo5(5);
		System.out.println(c1.i);
		
	}

}
