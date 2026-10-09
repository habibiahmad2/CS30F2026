package Mastery;

import java.util.Random;

public class GameBooth {

	int points;
	String firstPrize;
	String consolationPrize;

	public GameBooth(int points, String firstPrize, String consolationPrize) {

		this.points = points;
		this.firstPrize = firstPrize;
		this.consolationPrize = consolationPrize;
	}

	public String start() {

		Random random = new Random();

		int count = 0;

		for (int i = 0; i < 3; i++) {

			int number = random.nextInt(2);

			if (number == 1) {
				count++;
			}
		}

		if (count == 3) {
			return firstPrize;
		} else {
			return consolationPrize;
		}
	}
}