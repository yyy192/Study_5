package com.bh.b2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setId("bh0506");
		String id= member.getId();
		System.out.println("ID? "+id);
		member.setAge(30);
		int age = member.getAge();
		System.out.println("나이? "+age);
		member.setMuge(56);
		int muge = member.getMuge();
		System.out.println("몸무게? "+muge);
		member.setKi(156);
		int ki = member.getKi();
		System.out.println("키? "+ki);
//		member.info();


	}

}
