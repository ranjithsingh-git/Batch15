
public class StaticDemo2 
{
	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) 
	{
	
		//System.out.println(i);
		StaticDemo2 s1 = new StaticDemo2();
		
		//System.out.println(i);
		int i = 30;
		System.out.println(s1.i);
		System.out.println(j);
		
		int j = 40;
		System.out.println(j);
		System.out.println(StaticDemo2.j);
	}

}
