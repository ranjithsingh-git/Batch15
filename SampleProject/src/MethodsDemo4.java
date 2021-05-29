// infinte loop/run time errors while execution due to lack of ram stackoverflow exception java.lang.StackOverflowError
// diff error when we call funb from main method
public class MethodsDemo4 
{

		public static void main(String[] args) 
		{
		
			System.out.println("main method of MethodsDemo4");
			funC();
			System.out.println("Done");
		
		}

		static void funA()
		{
			System.out.println("funA of MethodsDemo4");
			funC();
		}
		
		static void funB()
		{
			System.out.println("funB of MethodsDemo4");
			funA();
		}

		static void funC()
		{
			System.out.println("funC of MethodsDemo4");
			funB();
		}
}
