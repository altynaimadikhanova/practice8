//9.112. Дано предложение. Удалить из него все символы с n1-го по n2-й (n1 n2).
import java.util.Scanner;

class Pr9_112{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String word2 = word.replace(" ", "");
		char a;
		for(int i = n1; i < n2; i++){
			word = word2.replace(i,"");
		}System.out.print(word);		
	}
}