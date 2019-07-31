package co.grandcircus;

import java.util.Scanner;

public class ChrisPlayer extends Player {
	Scanner scan = new Scanner(System.in);


	@Override
	public Roshambo generateRoshambo(Scanner scan, String prompt) {
		boolean check = true;
		String s = prompt;
		Roshambo c = null;
		int x = 0;
		while (check) {
			System.out.println(s);
			x = scan.nextInt();
			switch (x) {
			case 0:
				c = Roshambo.rock;
				check = false;
				break;
			case 1:
				c = Roshambo.paper;
				check = false;
				break;
			case 2:
				c = Roshambo.scissors;
				check = false;
				break;
			default:
				System.out.println("try again");
				check = true;
				break;
			}

		}
		return c;
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}


}
