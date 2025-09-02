public class reverseString2 {
    public static void main(String[] args){
      String sentence = "welcome to java programming";

        char[] input = sentence.toCharArray();
        char[] output = new char[input.length];

        // put spaces in place
        for (int i = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                output[i] = ' ';
            }
        }

        // reverse-fill letters
        int j = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ') {
                while (j >= 0 && output[j] == ' ') {
                    j--;
                }
                output[j] = input[i];
                j--;
            }
        }

        System.out.println(new String(output));
    }
}
 
