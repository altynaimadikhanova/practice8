//Дан текст. Определить, сколько в нем предложений.
import java.util.Scanner;

class Pr9_69{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int sum = 0;
		char a;
		for(int i = 0; i < word.length(); i++){
			a = word.charAt(i);
			if (a=='.') {
				sum++;
			}
			
		}System.out.print(sum);
	}
}