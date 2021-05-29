
public class ThisDemo4
{
	int i;
	
	ThisDemo4()
	{
		System.out.println("Zero args of ThisDemo4");
		i=10;
	}
	
	ThisDemo4(int a)
	{
		this();
		System.out.println("int args of ThisDemo4");
		i=a;
	}

	public static void main(String[] args) 
	{
		ThisDemo4 t1 = new ThisDemo4(20);
		System.out.println(t1.i);
		
	}

}
