package co.grandcircus;

import java.util.Random;

public class Champ extends Player {

	@Override
	public Roshambo generateRoshambo() {
		Random rand = new Random();
		Roshambo choice = null;
		int n = rand.nextInt(3);
		switch (n) {
		case 0:
			choice = Roshambo.rock;
			break;
		case 1:
			choice = Roshambo.paper;
			break;
		case 2:
			choice = Roshambo.scissors;
			break;
		}
		return choice;
	}

	@Override
	public String toString() {
		return "Champ";
	}

}
