class a
{
	void disp()
	{
		System.out.println("Disp from class a");
	}
}
class b extends a
{
	void disp()
	{
		System.out.println("Disp from class b");
	}
}
public class methourr1 extends b
{
	void disp()
	{
		System.out.println("Disp from class methourr1");
	}
	public static void main(String[]args)
	{
		a a1 = new a();
		a1.disp();
		a a2 = new bs();
		a2.disp();
		a a3 = new();
		a3.disp();
	}
}
		