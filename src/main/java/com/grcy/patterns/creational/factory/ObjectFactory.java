package com.grcy.patterns.creational.factory;

public class ObjectFactory {

	public static ObjectType getObject(String type, String name, String value1, int value2){
		if("type1".equalsIgnoreCase(type))
			return new Object1(name, value1, value2);
		else if("type2".equalsIgnoreCase(type))
			return new Object2(name, value1, value2);

		return null;
	}
}

