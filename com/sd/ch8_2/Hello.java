package com.sd.ch8_2;

class Hello{
	private String name;
	public Hello(String name){
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello "+name);
	}
	public static void main(String[] args){
		Hello[] h = new Hello[5];
		h[0] = new Hello("KAK");
		h[1] = new Hello("KBK");
		h[2] = new Hello("KCK");
		h[3] = new Hello("KDK");
		h[4] = new Hello("KEK");
		for(Hello e:h){
			e.sayHello();
		}
	}
}