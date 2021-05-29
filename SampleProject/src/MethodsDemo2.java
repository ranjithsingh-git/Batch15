// static function or methods can be called directly in main method, 
//non static can be called through new object (all non static members of a class will loaded on instantiation)
public class MethodsDemo2 
{

		public static void main(String[] args) 
		{
		
			System.out.println("main method of MethodsDemo2");
			funC();
			
			MethodsDemo2 m1 = new MethodsDemo2();
			m1.funA();
			m1.funB();
			
		}

		void funA()
		{
			System.out.println("funA of MethodsDemo2");
		}
		
		void funB()
		{
			System.out.println("funB of MethodsDemo2");
		}
		
		static void funC()
		{
			System.out.println("funC of MethodsDemo2");
		}
		
	

}
