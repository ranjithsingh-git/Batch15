
public class StaticDemo4 
{

	public static void main(String[] args) 
	{
	
		StaticDemo3 s1 = new StaticDemo3();
		System.out.println(s1.i);
		System.out.println(s1);
		
		StaticDemo3 s2 = new StaticDemo3();
		System.out.println(s2);
		
	    //System.out.println(s1.i);  //not a good practise though we get output
		//System.out.println(s1.a1);
		//System.out.println(s1.a1.i);
		//s1.a1.funA();
		
		System.out.println(StaticDemo3.j);
		System.out.println(StaticDemo3.a1);
		System.out.println(StaticDemo3.a1.j);
		StaticDemo3.a1.funA();
		
	}

}
