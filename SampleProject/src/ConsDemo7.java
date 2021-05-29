
public class ConsDemo7 

{
	int i = 5;
	int j = 10;
	
	ConsDemo7 (int a, int b)
	{
		i = a;
		j = b;
	}
	
	public static void main(String[] args) 
	{
	
		ConsDemo7 c1 = new ConsDemo7(20,30);
		System.out.println(c1.i);
		System.out.println(c1.j);
	}

}
