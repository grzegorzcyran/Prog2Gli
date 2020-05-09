package com.grcy.patterns.structural.decorator;

public class SpecialItem1 extends ItemDecorator{
	boolean special1;
	boolean setAdd1;

	public SpecialItem1(Item item, boolean setAdd1) {
		super(item);
		special1 = false;
		setAdd1 = setAdd1;
	}

	private void addSpecial1(){
		System.out.println("Adding special1" + setAdd1);
		this.special1 = true;
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Special Item1." + setAdd1);
		addSpecial1();
	}
}
