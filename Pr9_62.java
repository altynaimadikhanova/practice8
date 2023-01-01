//Дано предложение. Определить долю (в %) букв а в нем.
import java.util.Scanner;

class Pr9_62{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String word1 = word.toLowerCase();
		String word2 = word1.replace(" ", "");
		double sum = 0;
		char a;
		for(int i = 0; i < word2.length(); i++){
			a = word2.charAt(i);
			if (a == 'a') {
				sum++;
			}
		}
		double t = word2.length();
		double res = (sum*100)/t;
		System.out.println(res+"%");	}
}