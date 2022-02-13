// table

import java.util.*;
class table
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter n values of table");
		int n = Scan.nextInt();
		
		for(int i=1 i<=n; i++;)
		{
			for (int j=1; j<=10; j++)
			{
				System.out.println(i+"*+j+"="+i*j);
			}
			System.out.println();
		}
	}
}