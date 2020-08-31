package com.vk.playground;

class Test{
	Test s1;
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize method called");
	}
}
public class Manager7 {
	
	public static void main(String[] args) throws Throwable {
			Test t1 = new Test();
			Test t2 = new Test();
			
			t1.s1 = t2;
			t2.s1 = t1;
			
			System.out.println(t1.s1);
			System.out.println(t2.s1);
			
			t1 = null;
			
			System.out.println(t2.s1);
			System.out.println(t2.s1.s1);
			
			t2 = null;
			
			Test t3 = new Test();
			
			t3 = null;
			
			
			//both objects are reachable
			
			//System.gc();
			
			
	}
	
	

}
