package com.grcy.patterns.creational.builder;

public class Object {

	private String name;
	private String par1;
	private int par2;
	private boolean par3;

	private Object(ObjectBuilder builder) {
		this.name = builder.name;
		this.par1 = builder.par1;
		this.par2 = builder.par2;
		this.par3 = builder.par3;
	}

	public String getName() {
		return name;
	}

	public String getPar1() {
		return par1;
	}

	public int getPar2() {
		return par2;
	}

	public boolean isPar3() {
		return par3;
	}

	public static class ObjectBuilder {

		private String name;
		private String par1;
		private int par2;
		private boolean par3;

		public ObjectBuilder(String name, String par1, int par2) {
			this.name = name;
			this.par1 = par1;
			this.par2 = par2;
		}

		public ObjectBuilder setPar3(boolean par3) {
			this.par3 = par3;
			return this;
		}

		public Object build(){
			return new Object(this);
		}
	}
}


