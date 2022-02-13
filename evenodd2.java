//num of even or odd

import java.util.*;

class evenodd2
{
	public static void main(String[]args)
	{
		Scanner Scan = new Scanner (System.in);
		System.out.println(Enter number);
		int a=scan.nextInt();
		  int n=0;
		  int e=0;
		  int o=0;
		  
		  while(n<=a)
		  {
			  if(n%2 == 0)
			  {
				  e++;
				  
			  }
			  else
			  {
			  o++;
			  }
		      n++;
		  }
		  
		  System.out.println("Count of even num is" +e);
		  System.out.println("Count of even num is" +o);
	}
}
		  