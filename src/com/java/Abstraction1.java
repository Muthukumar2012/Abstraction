package com.java;

public  class Abstraction1 extends Abstraction {

	@Override
	public void emi() {
System.out.println("bike");		
	}
	@Override
	public void cod() {
		super.cod();
	}
	public static void main(String[] args) {
		Abstraction1 n = new Abstraction1();
		n.emi();
		n.cod();
	}

}
