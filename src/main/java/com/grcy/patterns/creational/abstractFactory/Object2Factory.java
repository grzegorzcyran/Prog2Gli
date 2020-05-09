package com.grcy.patterns.creational.abstractFactory;

public class Object2Factory implements ObjectAbstractFactory {
	private String name;
	private String par1;
	private int par2;

	public Object2Factory(String name, String par1, int par2) {
		this.name = name;
		this.par1 = par1;
		this.par2 = par2;
	}

	@Override
	public ObjectType createObject() {
		return new Object1(name, par1, par2);
	}

}
