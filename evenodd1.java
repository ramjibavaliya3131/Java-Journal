//IF(ladder if) condition

import java.util.scanner;
class evenodd1
{
	public ststic void main(String args[])
	{
		int  marks;
		Scanner Scan = new scanner(System.in);
		System.out.println("Enter score");
		Marks = Scan.nextInt();
		If(Marks>=70)
		{
			System.out.println("Grad A");
		}
		else if(Marks>=60)
		{
			System.out.println("Grad B");
		}
		else if(Marks>=50)
		{
			System.out.println("Grad C");
		}
		else if(Marks>=40)
		{
			System.out.println("Grad D");
		}
		else
		{
			System.out.println("Fail!!!");
		}
	}
}