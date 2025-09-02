public class stringreversenew {
    public static void main(String[] args) {
        String sentence = "im learning java programming";

        // Split into words
        String[] words = sentence.split(" ");

        // Reverse words array
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }

        // Reverse characters of each word
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        // Convert array back to String
        String reversedSentence = String.join(" ", words);

        System.out.println(reversedSentence);
    }
}
