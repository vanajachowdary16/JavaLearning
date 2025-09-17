import java.util.HashMap;

public class highestfreqUsingHashMap {
    public static void main(String[] args){
        int[] arr ={1,5,3,7,5,2,6,9};
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            int num=arr[i];
            if(visited.containsKey(num)){
                int prev = visited.get(num);
                visited.put(num, prev+1);
            }
            else{
                visited.put(num, 1);
            }
        }
         for(int i : visited.keySet()){
            System.out.println(i+ " repeated "+visited.get(i)+ " times");
        }
        int maxFreq =0;
        int maxNum=Integer.MIN_VALUE;
        for(int k :visited.keySet()){
            if(visited.get(k)>maxFreq){
                maxFreq=visited.get(k);
                maxNum=k;
            }
        }
                System.out.println("Element with highest frequency: " + maxNum + " repeated " + maxFreq + " times");


    }
    
}
