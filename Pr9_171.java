//Дано предложение. Найти длину его самого короткого слова.
import java.util.Scanner;

public class Pr9_171{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
 		String soz = sc.nextLine();
 		String sentence[] = soz.split(" ");
  		int esep = sentence[0].length;
  			for ( int i = 1; i < soz1.length; i++){
  				if (esep <=sentence[i].length) {
  		 		System.out.println(esep);
  				}
  			}
  			else{
  			System.out.println();
  		}
  	}
}