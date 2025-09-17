public class findmax {

    public static void main(String[] args){
        int[] a ={2,4,7,12,8,3,1,6,12,9,3,4};
        int n= a.length;
        int max=a[0];
        
        for(int i : a){
            if(i>max){
                max=i;
            }
            
        }
        int count=0;
        for(int i :a){
            if(i==max){
                count++;
            }
        }
        System.out.println(max + " is repeated " +count+ "times");
    }

    
}
