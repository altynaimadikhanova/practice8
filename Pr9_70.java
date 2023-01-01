import java.util.Scanner;

class Pr9_70{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String word2 = word.replace(" ", "");
		String word3 = word.toLowerCase();
		int sum = 0;
		char a;
		for(int i = 0; i < word3.length(); i++){
			a = word3.charAt(i);
			if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y'){
    		sum++;
   			}	
		}System.out.print(sum);
	}
}