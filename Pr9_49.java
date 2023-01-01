//Дано слово. Добавить к нему в начале и конце столько звездочек, сколько 
//букв в этом слове
import java.util.Scanner;

class Pr9_49{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		for(int i = 0; i< word.length(); i++){
			System.out.print("*");
		}
	}
}