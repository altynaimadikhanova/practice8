//Дан текст. Напечатать все имеющиеся в нем цифры.
import java.util.Scanner;

class Pr9_139{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word2 = word.replace(" ", "");
		char a;
		for(int i = 0; i < word2.length(); i++){
			a = word2.charAt(i);
			if (a==1 || a==2 || a==3 || a==4 || a==5 || a==6 || a==7 || a==8 || a==9 || a==0) {
				System.out.print(a);
			}
		}		
	}
}