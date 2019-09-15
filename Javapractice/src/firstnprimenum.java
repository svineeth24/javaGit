
public class firstnprimenum {

	public static boolean isprime(int number)
	{	
		for (int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int num= 10;
		int count= 1;
		int countnum = 1;
		
		while (count<=num)
		{
			countnum++;
			
			if (firstnprimenum.isprime(countnum))
			{
				System.out.println(countnum);
				count++;
			}
			
		
			
		}
	    }
	    }
	

