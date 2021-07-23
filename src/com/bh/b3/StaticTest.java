package com.bh.b3;

public class StaticTest {
	
	//접근지정자 [그외지정자] 데이터타입 변수명;
	public static int num = 10; //객체 만들지 않고 사용 가능
	public int num2 = 20;
	
	
	//접근지정자 [그외지정자] 리턴타입 메서드명([메서드명]) {}
	public static void staticMethod () {
		System.out.println("Statix Method");
		System.out.println(StaticTest.num);
//		System.out.println(this.num2);
//		this.instanceMethod;
// 		클래스메서드내에서 멤버변수,멤버메서드 선언 불가능
//		클래스 메서드내에서 멤버변수,멤버메서드는 아직 만들어지지 않았기땜에
		
	}
	
	//멤버메서드
	public void instanceMethod() {
		System.out.println("Instance Method");
		System.out.println(StaticTest.num);
		System.out.println(this.num2);
		
		//this() - 생성자 호출
		//참조변수명.메서드명(); - 멤버메서드 호출
		//클래스명.메서드명(); - 클래스메서드 호출
		//어디에서 쓰든 기본 문법 변하지않음
		
		StaticTest.staticMethod();
	}
}
