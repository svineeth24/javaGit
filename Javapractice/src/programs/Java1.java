package programs;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class Java1 {

	private int t=0;
	String value="test";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d= new Date();
		
		
		System.out.println(d.toString());	
	
	}


	
	
	public int getT() {
		return t;
	}




	public void setT(int t) {
		this.t = t;
	}




	public void ListConcept(){
		
     List obj=new LinkedList();  
     obj.add("vineeth");
     obj.add(10);
     obj.add(true);
     obj.add(1,"Naveen");
     obj.remove(1);
 	Iterator i=obj.iterator();
 	while(i.hasNext()) {
 		System.out.println(i.next());
 	}
   }
	
	public void setConcept() {
		Set obj=new HashSet();
		Set Obj1=new TreeSet();
		
		obj.add("satish");
		obj.add("naveen");
		obj.add("test");
		obj.add("vineeth");
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("");
	}


 public void dataprovider() {
	 
	 
	 
	 
	 
	 
	 
 }	

}
