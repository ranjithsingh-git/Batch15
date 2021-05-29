// calling fun/method from another fun
public class MethodsDemo3 
{

		public static void main(String[] args) 
		{
		
			System.out.println("main method of MethodsDemo3");
			funB();
			System.out.println("Done");
		
		}

		static void funA()
		{
			System.out.println("funA of MethodsDemo3");
		}
		
		static void funB()
		{
			System.out.println("funB of MethodsDemo3");
			funA();
		}
		
}
