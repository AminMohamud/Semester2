package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		//opgave 2a
		//runners.forEach(runner -> runner.getName());

		//opgave 2b
		runners.forEach(runner -> {
			if (runner.getLapTime() < 30) {
				System.out.println(runner.getName());
			}
		});

		//opgave 2c
		runners.sort((p1, p2) -> p1.getLapTime() - p2.getLapTime());
		System.out.println(runners);
	}
}