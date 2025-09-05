public class palindromeSentence {
    public static void main(String[] args){
        String str = "A man a plan a canal Panama";

        // Step 1: Normalize (remove spaces and convert to lowercase)
        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Step 2: Reverse using StringBuilder
        String reversedBuilder = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Reverse using StringBuffer
        String reversedBuffer = new StringBuffer(cleaned).reverse().toString();

        // Step 4: Check palindrome
        System.out.println("Using StringBuilder: " + cleaned.equals(reversedBuilder));
        System.out.println("Using StringBuffer: " + cleaned.equals(reversedBuffer));
    
    }
    
}
