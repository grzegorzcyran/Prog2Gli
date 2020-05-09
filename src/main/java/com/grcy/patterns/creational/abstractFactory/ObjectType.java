package com.grcy.patterns.creational.abstractFactory;

public abstract class ObjectType {

	public abstract String getName();
	public abstract String getPar1();
	public abstract int getPar2();

	@Override
	public String toString(){
		return "Name="+this.getName()+", Par1="+this.getPar1()+", Par2="+this.getPar2();
	}
}
