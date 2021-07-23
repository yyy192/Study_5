package com.bh.b4;

public class S4Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.num);
		System.out.println(t.num2);
		
		t.num = 5;
//		t.num2 = 6;  final이 붙었기때문에 값을 바꿀 수 없음
		
		System.out.println(t.num);
		System.out.println(t.num2);
	}

}
