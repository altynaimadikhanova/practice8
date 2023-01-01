import java.util.Scanner;

class Pr9_76{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char a;
		/*for(int i = 0; i < word.length(); i++){
			a = word.charAt(i);
			if (a=='e') {
				System.out.print(i);
				break;			}
		}
	}*/

	    for(int i = word.length()-1; i > 0; i--){
			a = word.charAt(i);
			if (a=='e') {
				System.out.print(i);
				break;			
			}
		}
	}
}