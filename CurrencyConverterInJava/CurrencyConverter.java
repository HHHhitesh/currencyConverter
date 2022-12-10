import java.util.Scanner;
class CurrencyConverter
{
	double rupeesTodollars(double n)
	{
		double rupees;
		rupees=n;
		double dollar=rupees/79.82;
		return dollar;
	}
	double rupeesToYen(double n)
	{
		double rupees;
		rupees=n;
		double Yen=rupees/1.7153;
		return Yen;
	}
	double rupeesToEuro(double n)
	{
		double rupees;
		rupees=n;
		double Euro=rupees/0.0125;
		return Euro;
	}

	public static void main(String[]args)
	{
		CurrencyConverter cc=new CurrencyConverter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Rupees to :"+"\n"+"Enter Any number");
		System.out.println("1. Dollar 2. Yen 3.Euro ");
		String s;
		do
			{
			int a=sc.nextInt();
			System.out.println("Enter Amount: ");
			Double b=sc.nextDouble();
		
			switch(a)
				{
				case 1:
					{
						System.out.println(cc.rupeesTodollars(b));
						break;
					}
				case 2:
					{
						System.out.println(cc.rupeesToYen(b));
						break;

					}
				case 3:
					{
						System.out.println(cc.rupeesToEuro(b));
						break;

					}
				default:
					{
						System.out.println("Please enter the number 1 or 2 or 3 only");
					}
				}
				System.out.println("press Y for Convert More: else press N");
				s=sc.next();
			}	
			while(s.equals("Y")||s.equals("y"));
	}
}