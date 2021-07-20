package q2;

import java.util.Scanner;

public class Egg {

	public void calculate() {
		System.out.println("Enter no.of eggs");
		Scanner sc = new Scanner(System.in);
		int eggs = sc.nextInt();
		int gross = eggs / 144;
		int dozen = (eggs % 144) / 12;
		int remaining = ((eggs % 144) % 12);
		System.out.println("Your number of eggs are " + gross + " Gross, " + dozen + " dozen, and " + remaining);
		sc.close();
	}

	public static void main(String[] args) {
		Egg out = new Egg();
		out.calculate();
	}
}
