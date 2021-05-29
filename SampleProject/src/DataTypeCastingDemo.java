
public class DataTypeCastingDemo 
{

	public static void main(String[] args) 
	{
		int a = 10; //no type casting
		float f1 = a; // implicit casting
		System.out.println(f1);
		
		long l = 3000; //no type casting
		float f2 = l; // implicit casting
		System.out.println(f2);
		
		float f3 = (float) 10.23; //explicit typecasting
		System.out.println(f3);
		
		int b = (int) f2; //explicit typecasting
		System.out.println(b);
		
		float f4 = 10.23f; // eplicit typecasting equals to (float)10.23
		System.out.println(f4);

	}

}
