import java.util.ArrayList;
import java.util.List;
public class FindDuplicates {
    public static void main(String[] args){
    int[] numbers= {2, 3, 4, 51, 2, 34, 6, 6, 5, 2, 3, 7, 8, 9, 10};
   List<Integer> duplicated = new ArrayList<>();
    for(int i=0; i<numbers.length; i++){
         if (duplicated.contains(numbers[i])) {
                continue; // skip already counted duplicates
            }
             int count = 1;
        for(int j=i+1;j<numbers.length;j++){
            if(numbers[i]==numbers[j]){
                 count++;
               
                }
            }
              if (count > 1) {
                duplicated.add(numbers[i]);
                System.out.println(numbers[i] + " appears " + count + " times");
            }
}
    }
}



