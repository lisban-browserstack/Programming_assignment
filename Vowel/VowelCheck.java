public class VowelCheck {
    public static void main(String[] args) {
        String input = "Hll Wrld";
        boolean hasVowel = containsVowel(input);
        if (hasVowel) {
            System.out.println("The string contains a vowel.");
        } else {
            System.out.println("The string does not contain any vowels.");
        }
    }

    public static boolean containsVowel(String str) {
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
        }
        return false;
    }
}
