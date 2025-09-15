package collections.java_collections;

import java.util.HashMap;

public class hashmapLearn {
    public static void main(String[] args){
        HashMap<Integer, Integer> macha = new HashMap<>();
        /*macha.put(2,5);
        macha.put(3, 9);
       /*System.out.println(macha.get(3));
        macha.put(4, 6);
        macha.put(3, 15);
        System.out.println(macha.get(3));
        int prev=macha.get(3);
        macha.put(3, prev+1);
         //System.out.println(macha.get(3));
         /*if(macha.containsKey(3)){
            System.out.println(macha.get(3));
         }
         int n=0;
      
        System.out.println(macha.get(7));
        macha.put(7, n+1);
        //System.out.println(macha.get(7));
       /*  for(int i : macha.keySet()){
            System.out.println(i);
        }*/
        int[] arr ={4,5,8,9,7,4,7,8,4};
        for(int i=0; i<arr.length;i++){
            int num = arr[i];
            if(macha.containsKey(num)){
                int prev2=macha.get(num);
                macha.put(num, prev2+1);
            }
            else{
                macha.put(num, 1);
            }
        }
       for(int i : macha.keySet()){
            System.out.println(i+ " repeated "+macha.get(i)+ " times");
        }
         int maxFreq= 0;
         int maxNum=-1;
         for(int k : macha.keySet()){
            if(macha.get(k)>maxFreq){
                maxFreq=macha.get(k);
                maxNum=k;
            }
         }
        System.out.println("Element with highest frequency: " + maxNum + " repeated " + maxFreq + " times");
    }
    
}
