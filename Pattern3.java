class Pattern
{
  public static void main(String a[])
  {
	 
    for(int i=1;i<=5;i++)
	{
		 int num=1;
	     char ch='a';
		for(int j=1;j<=5;j++)
		{
			if(i>=j)
			{
				if(i%2==1)
				{
					System.out.print((num++)+" ");
				}
				else
				{
					System.out.print((ch++)+" ");
				}
			}
		}
		System.out.println();
	}
  }
}