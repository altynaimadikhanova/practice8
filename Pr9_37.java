import java.util.Scanner;

class Pr9_37{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*String word = sc.nextLine(); 
  		int length = word.length(); 
 		String subWord = word.substring(0,length/2); 
  		String subWord2 = word.substring(length/2,length); 
  		System.out.print(subWord2); 
  		System.out.print(subWord);
*/
        String word = sc.nextLine(); 
  		String w1 = ""; 
  		String w2 = ""; 
  		int half = word.length()/2; 
  		for(int i = 0; i < word.length()/2; i++){ 
   			w1 = w1 + word.charAt(i); 
  			w2 = w2 + word.charAt(half+i); 
  		} 
  		System.out.println(w2+w1);
  		}
}