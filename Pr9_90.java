import java.util.Scanner;

class Pr9_90{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word2 = sc.next();
		word2 = word2.replace('e', 'i');
		System.out.println(word2);
	}
}