public class book
{
	int bookprc;
	String booknm;
	Book()
	{
		System.out.println("no data available");
	}
	Book(int a)
	{
		this.bookprc = a;
		this.bookprc = s;
		System.out.println("booknm"+"costs"+"bookprc");
	}
	public static void main(String[]args)
	{
		Book b1 =new Book(10);
		Book b2 =new Book(10,"Samvad");
	}
}