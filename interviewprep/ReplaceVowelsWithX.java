package interviewprep;

public class ReplaceVowelsWithX {
    public static void main(String[] args) {
        String input = "hello world";
        String vowels = "aeiouAEIOU";
        char inputArr[] = input.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();

        for (char c : inputArr) {
            if (vowels.indexOf(c) != -1) {
                resultBuilder.append('x');
            } else {
                resultBuilder.append(c);
            }
        }

        System.out.println(resultBuilder.toString());
    }
}
