import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		int m;
		
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		m= obj.nextInt();
		
		for (int i=2;i<=m;i++)
		{
			for (int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
					
				}
			}
		}

	}

}
