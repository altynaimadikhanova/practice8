//Дано предложение из 10 слов. Заполнить ими массив из 10 элементов.
import java.util.Scanner;

public class Pr9_164 {
	public static void main(String[] args) {
 		Scanner sc = new Scanner (System.in);
		String wo = sc.nextLine();
 		String wo1[] = wo.split(" ");

  	for ( int i = 0; i < wo1.length; i++){
  		 System.out.println(wo1[i]);
 	}
 	}
}