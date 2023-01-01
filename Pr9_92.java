//Дано предложение. Все его символы, стоящие на четных местах, заменить 
//буквой ы.
import java.util.Scanner;

class Pr9_92{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word2 = word.replace(" ","");
		char arr[] = new char [word2.length()];
		boolean res = true;
		for (int i = 0; i < word2.length(); i++) {
			arr[i] = word2.charAt(i);

			if(i%2 == 0){
				arr[i] = 'y';
			}
			else{
				arr[i] = arr[i];
			}
			
		}
		System.out.print(arr);
	}
}