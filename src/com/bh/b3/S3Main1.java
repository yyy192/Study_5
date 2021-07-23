package com.bh.b3;

public class S3Main1 {

	public static void main(String[] args) {
		
		StaticTest.num = 2;
		
		//System.out도 클래스변수명
		//StaticTest.num = 클래스변수
		System.out.println("NUM : "+StaticTest.num); //

		//클래스메서드
		StaticTest.staticMethod();
		
//		StaticTest st = new StaticTest();
//		System.out.println(st.num2);
//		System.out.println(st.num);
//		
//		st.num = 4000;
//		System.out.println(st.num); 
//		
//		System.out.println(StaticTest.num);
//		Test2 test2 = new Test2();
//		test2.t1(); //2
//		
//		Test2 test3 = new Test2();
	}

}
