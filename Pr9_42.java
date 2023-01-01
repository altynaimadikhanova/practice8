import java.util.Scanner;

class Pr9_42{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int length = word.length();
		for(int i = length-1; i >= 0; i--){
			String word = word.replaceAll(word, i);
			System.out.println(word);
		}
	}
}