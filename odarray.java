public class odarray
{
	public static void main(String[]args)
	{
		int n=0;
		int()[]jaggedarray = new int [2][];
		jaggedarray[0]=new int[2];
		jaggedarray[1]=new int[4];
		
		for(int i=0;i<jaggedarray.length;j++)
		{
			for(int j=0; j<jaggedarray[i].length;j++)
			{
				jaggedarray[i][j]=n++;
			}
		}
		for(int i=0;i<jaggedarray.length;i++)
		{
			for(int i=0;j<jaggedarray.length;j++)
			{
				System.out.println(jaggedarray(i)(j));
			}
			System.out.println();
		}
	}
}