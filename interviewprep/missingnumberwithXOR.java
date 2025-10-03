package interviewprep;

public class missingnumberwithXOR {
    public static void main(String[] args) {
        
    int[] numbers={1,2,4,5,6};
    int missingNum=0;
    for(int n : numbers){
        missingNum = missingNum ^ n;
    }
    for(int i=1;i<=numbers.length+1;i++){
        missingNum = missingNum ^ i;
    }
    System.out.println("Missing number is: "+missingNum);
}
}