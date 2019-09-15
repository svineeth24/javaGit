package programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Strings {

	public static void main(String[] args) {
		Strings s24= new Strings();
		
		String s1="my name is Vineeth";
		String[] s2= s1.split(" ");

		
		System.out.println(s2.length);
		for (int i=0;i<=s2.length-1;i++) {
			
		
		System.out.println(s2[i]);
	}
		LinkedList<String> str = new LinkedList<String>();
		str.add("Vineeth");
		str.add("Somireddy");
		str.add("Vineeth");
		LinkedHashSet<String> lhs= new LinkedHashSet<String>();
		lhs.add("Vineeth");
		lhs.add("Vineeth");
		lhs.add("Somireddy");
		System.out.println(lhs);
		
		
	    
		//System.out.println(lhs.isEmpty());
		System.out.println(str);

	}
	
	public Strings() {
		
		System.out.println("Hi Everyone");
	}
}
