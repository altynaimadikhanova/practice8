class Pr9_16{
	//Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.

	public static void main(String[] args) {
		String word = "Hlrlu";
		char c0 = word.charAt(1);
		char c1 = word.charAt(3);

		if (c0==c1) {
			System.out.println("Yes");
		}
		if (c0!=c1) {
			System.out.println("No");
		}
	}
}