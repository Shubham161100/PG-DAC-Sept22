class Pyramid5{
	public static void main(String args[])
	{
		for(int i=9;i>=1; i--)
		{
			for(int s=i; s>=1; s--)
			{
				System.out.print("  ");
			}
			for(int j=i; j<=9;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=8; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}