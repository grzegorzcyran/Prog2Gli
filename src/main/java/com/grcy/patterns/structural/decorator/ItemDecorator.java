package com.grcy.patterns.structural.decorator;

public abstract class ItemDecorator implements Item {

	protected Item item;

	public ItemDecorator(Item item){
		this.item=item;
	}

	@Override
	public void assemble() {
		this.item.assemble();
	}
}
