package com.grcy.patterns.structural.adapter;

public class Main {

	public static void main(String[] args) {
		Volvo volvo = new Volvo("S40", 240);

		Jeep jeep = new Jeep("Renegade", 110);


		System.out.println(jeep.getName() + " max speed: " + jeep.getSpeed());
		System.out.println(jeep.getName() + " max speed for Europe: " + jeep.getSpeedKMH());
	}
}
