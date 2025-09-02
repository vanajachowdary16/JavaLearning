public class reverseStringwithspaces {
    public static void main(String[] args){
        String name ="My name is vanaja";
        String output = reverseWords(name);
        System.out.println(output);

    }
    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuffer reversedSentence = new StringBuffer();
        for(int i=words.length-1; i>=0; i--){
           reversedSentence.append(words[i]).append(" "); 
        }
        return reversedSentence.toString().trim();
    }
    
}
