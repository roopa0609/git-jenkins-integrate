package ex.inhertiance;

import java.sql.Timestamp;

public class A {
	
	int x=10;
	A(){
		System.out.println("Inside A Constructor x = "+x);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println("Inside A Constructor Time = "+timestamp);
	}
	
	public void m1() {
		
	}

}