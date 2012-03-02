public class ReverseWords {

	public static String reverse(String sentence) {
		StringBuilder reversed = new StringBuilder(sentence.length());
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			reversed.append(words[words.length - 1 -i]);
			if (i + 1 < words.length) {
				reversed.append(' ');
			}
		}
		return reversed.toString();
	}
	
	public static String[] reverse(String[] sentence) {
		String[] reversed = new String[sentence.length];
		for (int i = 0; i < sentence.length; i++) {
			reversed[i] = sentence[sentence.length - 1 - i];
		}
		return reversed;
	}
	
	public static void print(String[] sentence) {
		for (String word : sentence) {
			System.out.print(word + ' ');
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) throws Exception {
		print(args);
		print(reverse(args));
		System.out.println(reverse("The    cat is out of the bag"));
		System.out.println(reverse("Another test string"));
	}
}
