
public class BudzDemo1 
{

	public static void main(String[] args) 
	{
	int grossSal = 10000;
	// int netSal = grossSal - totalCharges;
	
	BudzDemo1 bd1 = new BudzDemo1();
	// int netsal = grossSal - bd1.houseCharges2();
	// System.out.println(netsal);
	// int taxCal = 30 * bd1.houseCharges2();
	// System.out.println(taxCal);	
	
	int charges = bd1.houseCharges2();
	int netSal = grossSal - charges;
	System.out.println(netSal);
	int taxCal = 30 * charges; 
	System.out.println(taxCal);
	
	}

	void houseCharges()
	{
		int rent = 2000;
		int childFee = 1000;
		int totalCharges = rent + childFee;
		System.out.println(totalCharges);
	}
	
	int houseCharges2() 
	{
		int rent = 2000;
		int childFee = 1000;
		int totalCharges = rent + childFee;
		System.out.println(totalCharges);
		return totalCharges;
	}
	
	
}
