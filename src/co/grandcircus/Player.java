package co.grandcircus;

import java.util.Scanner;

public abstract class Player {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

	public Roshambo generateRoshambo(Scanner scan, String prompt) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return name;
	}

}
