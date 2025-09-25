package stringproblems100;

public class vowelsandconst {
    public static void main(String[] args){
        String str ="MyStringisapple";
        str.toLowerCase();
        StringBuilder vowelsStr = new StringBuilder();
        StringBuilder consonantsStr = new StringBuilder();
        int vowels=0, consonants=0;
for(char c : str.toCharArray())  {
    if(c=='a'||c=='e'||c=='i'
    ||c=='o'||c=='u'){
        vowels++;
        vowelsStr.append(c);
    }else{
        consonants++;
        consonantsStr.append(c);
    }

}  
System.out.println(vowelsStr+" vowels count is "+vowels);
System.out.println(consonantsStr+" consonants count is "+consonants);     
        

    }
}
