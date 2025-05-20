import java.util.Arrays;

public class Arraysiteration {
       public static void main(String[] args){
        String[] cousins = {"vanu", "kavi", "teju", "chitti", "haari", "vinni"};
        for( int i=0; i<cousins.length; i++){
            System.out.println(cousins[i]);
        }

        int[] numbers = new int[5];
        numbers[0]=3;
        numbers[1]=1;
        numbers[2]=4;
        numbers[3]=9;
        numbers[4]=10;

         System.out.println(Arrays.toString(numbers));
         for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
         }
//backward iteration
         for(int i=numbers.length-1; i>=0;i--){
            System.out.println(numbers[i]);
         }

         for(int i=cousins.length-1; i>=0; i--){
            System.out.println(cousins[i]);
         }

         //for each or enhanced for loop

         for(int i : numbers){
            System.out.println(i);
         }
    }
}

