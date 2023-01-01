//Дано предложение. Составить программу, которая выводит все вхождения 
//в предложение двух заданных символов.
import java.util.Scanner;

class Pr9_55{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String d = sc.next();
		char c1 = d.charAt(0);
		String d2 = sc.next();
		char c2 = d2.charAt(0);
		for (int i = 0; i < sent.length(); i++) {
			char c = sent.charAt(i);
			if (c == c1 || c == c2) {
				System.out.println(i);
			}
		}
	}
}			
			