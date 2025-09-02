public class reverseString{

    public static void main(String[] args){
        String sentence = "welcome to java programming";
        String reversed = reverseStringspaces(sentence);
        System.out.println(reversed);
        
}

public static String reverseStringspaces(String str){
    char[] inputArray = str.toCharArray();
    char[] outputArray = new char[inputArray.length];
    for(int i=0; i<inputArray.length; i++){
        if(inputArray[i] ==' '){
            outputArray[i]= ' ';
        }
    }
    int j=inputArray.length-1;
    for(int i=0; i<inputArray.length; i++){
        if(inputArray[i] != ' '){
            while(j>=0 && outputArray[j] ==' '){
                j--;
            }
            outputArray[j] = inputArray[i];
            j--;
        }
    }
    return new String(outputArray);
}
}