
public class ConsDemo4 
{
	int i = 5;
	ConsDemo4()
	{
		System.out.println("cons of ConsDemo4");
		int i=10;
	}

	public static void main(String[] args) 
	
	{
		ConsDemo4 c1 = new ConsDemo4();
		System.out.println(c1.i);
	}

}