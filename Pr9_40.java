import java.util.Scanner;

class Pr9_40{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String wo = sc.next();
		int k = sc.nextInt();
		String wo1 = wo.substring(0,k);
 		String wo2 = wo.substring(k,wo.length());

 		System.out.print(wo2);
 		System.out.print(wo1);

 		// char a;
 		// char c;
 		// for ( int i = k; i < wo.length(); i++ ) {
 		// 	  a = wo.charAt(i);
 		// 	  System.out.print(a);
 		// }
 		// for ( int i = 0; i < k; i++) {
   // 			c = wo.charAt(i);
   // 			System.out.print(c);
  	// 	}
	}
}