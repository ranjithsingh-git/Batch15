
public class ConsDemo7A 
{
	int i = 5;
	int j = 10;
	
	ConsDemo7A (int i, int j)
	{
		i = i;
		j = j;
	}
	public static void main(String[] args) 
	{
		ConsDemo7A c1 = new ConsDemo7A(20,30);
		System.out.println(c1.i);
		System.out.println(c1.j);
	}

}

// when local variable is avaialable it checks at local and doesnt check for global. when local variable names are same we have to show the difference between local and global.