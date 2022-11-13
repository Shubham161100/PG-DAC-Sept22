class Pro10
{
	public static void main(String args[])
	{
		for(int i=0; i<5; i++)
		{
			for(int s=4; s>i; s--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}