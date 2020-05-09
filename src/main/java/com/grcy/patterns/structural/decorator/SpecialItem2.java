package com.grcy.patterns.structural.decorator;

public class SpecialItem2  extends ItemDecorator{

	public SpecialItem2(Item item) {
		super(item);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Special Item2.");
	}

}
