package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		boolean check = true;
		String name;
		Player Chris = new ChrisPlayer();
		System.out.println("Welcome to rock paper scissors");
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("alright " + name + ". ");

		while (check) {
			// getting the player you want to play
		Player game = getPlayer(scan, "Who do you want to play?!\nRocko or Champ?? Type R for Rocko or C for Champ");
		Roshambo gameChoice = game.generateRoshambo();

		Roshambo chrisChoice = Chris.generateRoshambo(scan, "Rock(Press 0), Paper(Press 1), or scissors(Press 2)? ");
		System.out.println(game.toString() + ": " + gameChoice);
		System.out.println(name + ": " + chrisChoice);
			// who wins
		System.out.println(whoWin(chrisChoice, gameChoice));
			// adding to your win or loss total
		if (whoWin(chrisChoice, gameChoice).equalsIgnoreCase("you lose!")) {
			lose++;
		} else if (whoWin(chrisChoice, gameChoice).equalsIgnoreCase("you win!")) {
			win++;
		}
			// checking if you want to play
			if (stayOrGo(scan, "play again (y/n)")) {
				check = true;
			} else {
				check = false;
			}
		}
		System.out.println("Wins: " + win + "\n Losses: " + lose);
		System.out.println("Thank you!");



	}

	public static Player getPlayer(Scanner scan, String prompt) {
		String x = "";

		Player p = new Champ();
		boolean check = true;
		while (check) {
			System.out.println(prompt);
			x = scan.next();
			if (x.equalsIgnoreCase("r")) {
				p = new Rocko();
				check = false;
			} else if (x.equalsIgnoreCase("c")) {
				p = new Champ();
				check = false;
			} else {
				System.out.println("please try again");
				check = true;

			}

		}

		return p;
	}

	public static String whoWin(Roshambo chris, Roshambo player) {
		String result = " ";
		if (chris == player) { 
			result = "draw";
		}
		else if (chris == Roshambo.rock && player == Roshambo.paper) {
			result = "you lose!";
		}
		else if (chris == Roshambo.rock && player == Roshambo.scissors) {
			result = "you win!";
		} else if (chris == Roshambo.scissors && player == Roshambo.paper) {
			result = "you win!";
		} else if (chris == Roshambo.scissors && player == Roshambo.rock) {
			result = "you lose!";
		} else if (chris == Roshambo.paper && player == Roshambo.scissors) {
			result = "you lose!";
		} else if (chris == Roshambo.paper && player == Roshambo.rock) {
			result = "you win!";
		}
		
		return result;
	}

	public static boolean stayOrGo(Scanner scan, String prompt) {
		boolean check = true;
		boolean check2 = true;
		String choice = " ";
		while (check) {
			System.out.println(prompt);
			choice = scan.next();
			if (choice.equalsIgnoreCase("y")) {
				check2 = true;
				check = false;

			} else if (choice.equalsIgnoreCase("n")) {
				check2 = false;
				check = false;

			} else {
				System.out.println("try again");
				check = true;
			}

		}
		
		return check2;
	}

}
