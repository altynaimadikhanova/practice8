//Дано слово. Получить его часть, образованную второй, третьей и четвертой 
//буквами.
class Pr9_21{
	public static void main(String[] args) {
		String word = "HlrlH";
		char c0 = word.charAt(1);
		char c1 = word.charAt(2);
		char c2 = word.charAt(3);

		System.out.print(c0);
		System.out.print(c1);
		System.out.print(c2);
	}
}