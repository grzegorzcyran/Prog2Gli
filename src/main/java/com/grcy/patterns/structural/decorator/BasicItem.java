package com.grcy.patterns.structural.decorator;

public class BasicItem implements Item {

	@Override
	public void assemble() {
		System.out.print("Basic Item.");
	}
}
