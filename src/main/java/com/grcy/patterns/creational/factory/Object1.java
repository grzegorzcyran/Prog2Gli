package com.grcy.patterns.creational.factory;

public class Object1 extends ObjectType {

	private String name;
	private String par1;
	private int par2;

	public Object1(String name, String par1, int par2) {
		this.name = name;
		this.par1 = par1;
		this.par2 = par2;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPar1() {
		return par1;
	}

	@Override
	public int getPar2() {
		return par2;
	}
}
