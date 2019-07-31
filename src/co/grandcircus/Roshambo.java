package co.grandcircus;

public enum Roshambo {
	rock, paper, scissors;

	public String toString() {
		String s = null;
		switch (this) {
		case rock:
			s = "rock";
			return s;

		case paper:
			s = "paper";
			return s;

		case scissors:
			s = "scissors";
			return s;

		}
		return s;

	}
}
