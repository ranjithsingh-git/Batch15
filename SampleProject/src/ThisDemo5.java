
public class ThisDemo5 
{
	int i = 5;
	
	ThisDemo5()
	{
		this(30);
		System.out.println("zero args of ThisDemo5");
		i = 5;
	}
	
	ThisDemo5(int a)
	{ 
		System.out.println("int args of ThisDemo5");
		i = a;
	}

	public static void main(String[] args)
	{
		ThisDemo5 t1 = new ThisDemo5();
		System.out.println(t1.i);	
		
	}

}
