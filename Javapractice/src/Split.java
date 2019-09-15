

public class Split  {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Split a= new Split();
		String str = "abcd1234";
		String[] part = str.split("(?<=\\D)(?=\\d)");
		System.out.println();
		System.out.println(part[0]);
		System.out.println(part[1]);

	}
	
	public Split() {
		System.out.println("1) How To Find The Largest Value From The Given Array");
		 int[] arr={28,34,15,9,17,4,23,2};
		 
		 int val= 0;
		 
		 for(int i=0; i<arr.length; i++){
		 if(arr[i] > val){
		 val=arr[i];
		 }
		 }
		 System.out.println("Largest value in the Given Array is "+ val);
		 System.out.println();
	
		 System.out.println("2) Write a program to print the pattern given below");	 
	for (int x = 1; x <= 5; x++) {
		 for (int y = 1; y <= x; y++) {
		 System.out.print("*"+" ");
		 }
		 System.out.println();
		 }
	 System.out.println();	 
	 System.out.println("3) Fibonocci series");
	 
	
	 int a1 = 0, b1= 1, c1, z, count1 = 10;
	 // To print 0 and 1
	 System.out.print(a1 + " " + b1);
	
	 for (z = 2; z < count1; z++) {
	 c1 = a1 + b1;
	 System.out.print(" " + c1);
	 a1 = b1;
	 b1 = c1;
	 
	 }
	 
	 String reverse = "";
	 String str= "my name is Vineeth";

	    for(int i = str. length() - 1; i >= 0; i--)
	    {
	    reverse = reverse + str. charAt(i);
	    }
	    System. out. println("Reversed string is:"+" "+reverse);
	    
	    }
	 
	 
	 
	}


