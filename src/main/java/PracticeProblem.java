import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer: ");
		String testing = scanner.nextLine();

		String added = "5" + testing;

		int convert = Integer.parseInt(added);

		int calculation = convert + 5;

		System.out.println(calculation);
		
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		String stringy = scanner.nextLine();

		String stringyagain = "4" + stringy + "3";

		double doublestringy = Double.parseDouble(stringyagain);

		double add = doublestringy + 3.4;

		System.out.println(add);
		
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a boolean: ");
		String bowl = scanner.nextLine();

		boolean realbool = Boolean.parseBoolean(bowl);

		boolean swap = !realbool;

		System.out.println(swap);
		
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer: ");
		String inta = scanner.nextLine();

		String threeafter = inta + "3";

		int conversation = Integer.parseInt(threeafter);

		int maths = conversation + 2;

		char letter = (char) maths;

		System.out.println(letter);

		
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer: ");
		String sussybaka = scanner.nextLine();

		String combo = sussybaka + "1";

		int bakaboy = Integer.parseInt(combo);

		int mathing = bakaboy / 2;

		double convertatata = (double) mathing;

		System.out.println(convertatata);
		
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		String brotha = scanner.nextLine();

		String oneplus = "1" + brotha;

		double todouble = Double.parseDouble(oneplus);

		int toint = (int) todouble;

		System.out.println(toint);
		
	}

}
