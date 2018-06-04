import java.util.Scanner;

public class HelloWorld {
	static Scanner user_input = new Scanner(System.in);

	public static void main(String[] args) {

		String weiter;

		do {

			System.out.println("Bitte geben Sie eine Zahl ein: ");

			String zahl = user_input.next();
			int zahl1 = Integer.parseInt(zahl);
			int mod = (zahl1 % 2);
			if (mod == 0) {
				System.out.println("Die Zahl " + zahl1 + " ist eine gerade Zahl");
			} else {
				System.out.println("Die Zahl " + zahl1 + " ist eine ungerade Zahl");
			}
			System.out.println("Möchten Sie eine weitere Zahl eingeben? (j/n)");
			weiter = user_input.next();

		} while (weiter.contains("j") || weiter.contains("J"));

	}
}
