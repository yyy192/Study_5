package com.bh.b1.ex2;

public class Member {

	public String id;
	
	//default는 생략해줌
	int age;
	
	private String name;
	
	private Member() {
		
		this.id = "BAEKHYUN";
		this.age = 30;
		this.name = "변백현";
		
	}
	
	public Member test() {
		return new Member();
	}
	
	
}
