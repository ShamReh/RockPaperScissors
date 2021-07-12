package enums.tester;

import java.util.Random;

public class RPS {

	private Random rand = new Random();

	public void call(Move call) {

		int rng = rand.nextInt(101);

		Move result = null;
		if (rng < 33) {
			result = Move.ROCK;
		} else if (rng < 66) {
			result = Move.PAPER;
		} else {
			result = Move.SCISSORS;
		}

		System.out.println("You Chose: " + call + " Other Player Called: " + result);

		if (call == Move.ROCK && result == Move.PAPER) {
			System.out.println("Loser! Got you wrapped up!");
		} else if (call == Move.ROCK && result == Move.SCISSORS) {
			System.out.println("Win! You're getting crushed!");
		} else if (call == Move.ROCK && result == Move.ROCK) {
			System.out.println("Draw! We think alike");
		} else if (call == Move.PAPER && result == Move.SCISSORS) {
			System.out.println("Lose! Ima cut you up!");
		} else if (call == Move.PAPER && result == Move.ROCK) {
			System.out.println("Win! Got you wrapped up!");
		} else if (call == Move.PAPER && result == Move.PAPER) {
			System.out.println("Draw! What a dead result, we need to go again");
		} else if (call == Move.SCISSORS && result == Move.SCISSORS) {
			System.out.println("Draw! Try again!");
		} else if (call == Move.SCISSORS && result == Move.ROCK) {
			System.out.println("Lose! You're getting crushed!");
		} else if (call == Move.SCISSORS && result == Move.PAPER) {
			System.out.println("Win! Ripped to shreds!");
		}

		return;

	}

}
