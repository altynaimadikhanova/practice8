class Pr9_17{
	public static void main(String[] args) {
		String word = "HlrlH";
		char c0 = word.charAt(0);
		char c1 = word.charAt(word.length()-1);

		if (c0==c1) {
			System.out.println("Yes");
		}
		if (c0!=c1) {
			System.out.println("No");
		}
	}
}