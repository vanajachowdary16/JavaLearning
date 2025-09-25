package interviewprep;

public class SeparareNumandAlphabets {
    public static void main(String[] args){
        String input ="ra123j";
        StringBuilder numbers= new StringBuilder();
        StringBuilder alphabets= new StringBuilder();
        for(char currentchar : input.toCharArray()){
            if(Character.isDigit(currentchar)){
                numbers.append(currentchar);
            }else{
                alphabets.append(currentchar);
            }
        }
        System.out.println(numbers.toString());
        System.out.println(alphabets.toString());
    }
    
}
