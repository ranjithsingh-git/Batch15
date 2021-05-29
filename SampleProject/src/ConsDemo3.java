
public class ConsDemo3 
{
	int i = 5;
	ConsDemo3()
	{
		System.out.println("cons of ConsDemo3");
		i=10;
	}

	public static void main(String[] args) 
	
	{
		ConsDemo3 c1 = new ConsDemo3();
		System.out.println(c1.i);
	}

}
