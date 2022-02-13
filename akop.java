public class akop
{
	public static void arithmetic(float a,float b,String c)
	{
		float n1=a, n2=b, ans=0;
		String S1=5;
		switch(S1)
		{
			case"+":
			ans=n1+n2;
			System.out.println("Sum :"+ans);
			break;
			case"-":
			ans=n1-n2;
			System.out.println("Sub :"+ans);
			default:
			System.out.println("Enter to k-op");
		}
	}
	public static void main(String[]args)
	{
		float a,b;
		String c;
		Scanner sc = new scanner(System.in);
		System.out.println("Enter 2ms +l-op");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		arithmatic(a,b,c);
	}
}
		
		