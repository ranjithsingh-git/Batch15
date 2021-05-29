
public class ConsDemo6 
{

	int i = 10;
	ConsDemo6(int a)
	{
		System.out.println("cons of ConsDemo6");
		i = a;
		
		
	}
	
	
	public static void main(String[] args) 
	{
	
		ConsDemo6 c1 = new ConsDemo6(20);
		System.out.println(c1.i);

		ConsDemo6 c2 = new ConsDemo6(30);
		System.out.println(c2.i);
		
	}

}
