
public class ConsDemo7B 
{

	int i = 5;
	int j = 10;
	
	ConsDemo7B (int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public static void main(String[] args) 
	{
		ConsDemo7B c1 = new ConsDemo7B(20,30);
		System.out.println(c1.i);
		System.out.println(c1.j);
	}

}

//this performs like a object reference variable
//this keyword pointing to current object
//this keyword we are using to show the difference between local and global variables when both names are same
//this keyword can only be used in non static methods (It cant be used in Main method)