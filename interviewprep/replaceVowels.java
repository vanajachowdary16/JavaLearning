package interviewprep;

public class replaceVowels {
    public static void main(String[] args){
        String input ="name";
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for(char currentchar:input.toCharArray()){
            if(currentchar=='a' || currentchar=='e'||currentchar=='i'
            ||currentchar=='o'||currentchar=='u'){
                result.append('x');
            }
            else{
                result.append(currentchar);
            }
        }
        System.out.println(result.toString());
    }
    
}
