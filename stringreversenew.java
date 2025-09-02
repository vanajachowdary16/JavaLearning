public class stringreversenew {
    public static void main(String[] args) {
        String sentence = "welcome to java programming";
        String[] words = sentence.split(" ");
        int n = words.length;
        for(int i=0; i<n/2; i++){
            String temp = words[i];
            words[i] = words[n-i-1];
            words[n-i-1] = temp;
        }
        for(int i=0; i<words.length; i++){
            words[i] = new StringBuffer(words[i]).reverse().toString();
        }
        String reversedWords = String.join(" ", words);
        System.out.println(reversedWords);
    }      
}
