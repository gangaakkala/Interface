package com.inter;

public class Developer {
	private Computer computer;
	public Developer(Computer computer) {
		this.computer=computer;
	}
	public void startCoding() {
		computer.code();
	}
}
