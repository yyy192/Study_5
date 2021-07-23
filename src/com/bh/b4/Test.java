package com.bh.b4;

public class Test {

	//멤버변수
	int num = 10;
	final int num2;
	
	//기본 생성자
	public Test() {
		
		num2 = 10;
		
	}
	
	//오버로딩
	public Test(int num2) {
		
		this.num2 = num2;
		
	}
	
	public final void test() {
		
		int n= 0;
		final int n2 = 10;
		
	}
	
}
