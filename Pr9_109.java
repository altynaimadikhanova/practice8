import java.util.Scanner;

class Pr9_109{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word2 = word.replace(" ", "");
		char a;
		for(int i = 0; i < word2.length(); i++){
			a = word2.charAt(i);
			if (a[i]==3) {
				a = a.replace("");
			}	
		}System.out.print(word2);
	}
}