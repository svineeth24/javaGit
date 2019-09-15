
public class datatype {

	
	
	public void add(int a, int b){
		int c=a+b;
		System.out.println(c);
	}
	
	
	public void add(int a, int b, int d){
		int c=a+b+d;
		System.out.println(c);
	}
	
	public void add(int a, double b){
		double c=a+b;
		System.out.println(c);
	}
	
	
	
	public static void add(double a, double b){
		double c=a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		datatype obj=new datatype();
		obj.add(1, 2, 5);
		
		
		datatype.add(15.63, 23.56);
		
	
		
		
	}

}
