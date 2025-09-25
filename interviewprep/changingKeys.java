package interviewprep;

public class changingKeys {
    public static void main(String[] args){
        String input="abBcdaaa";
        int count=0;
        char lastKey=input.toCharArray()[0];
        lastKey=Character.toLowerCase(lastKey);
        //System.out.println(lastKey);
        for(int i=1; i<input.length()-1;i++){
            char currentKey=input.toCharArray()[i];
            currentKey=Character.toLowerCase(currentKey);
            if(currentKey!=lastKey){
                count++;
            }

        }
        System.out.println("The total number of keys changed is: "+count);
    }
    
}
