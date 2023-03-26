package control;

public class GUGU {

	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++)
		{
			 System.out.println("단"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
