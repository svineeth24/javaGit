package programs;

public class AbstractTest {
	static Java1 obj=new Java1();
	
	public static void main(String[] args) {
		AbstractTest oj=new AbstractTest();
		obj=new Java1();
		
		oj.test();
	}
	
	public void test() {
		System.out.println("test1");
		System.out.println(obj.getT());
		obj.setT(7);
		System.out.println(obj.getT());
	}

	public void test2() {
		System.out.println("test2");
	}
	
}
