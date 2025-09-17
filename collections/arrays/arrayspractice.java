package collections.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class arrayspractice {
     public static void main(String[] args){

    /*int a[] = new int[3];
    int[] b = {1, 2, 4, 4}; // ✅ Values assigned directly
    a[0]=2;
    a[1]=3;
    a[2]=3;
    int sum=0;
    System.out.print("int array a is : ");
    for(int i=0; i<a.length;i++){
        System.out.println(a[i]);
    }   
     System.out.print("int array b is : ");
     for(int i=0; i<b.length;i++){
        System.out.println(b[i]);
        sum += b[i];
     }
     System.out.println(sum);*/


ArrayList<String> students = new ArrayList<>();
 students.add("harry");
 students.add("will");
 students.add("lilly");
 students.add("emma");
 students.add("rovan");
 System.out.println(students);

    
    List<Integer> listone= new ArrayList<>();

    listone.add(1);
    listone.add(2);
    listone.add(3);
    listone.add(4);
    System.out.println(listone);
    List<Integer> listtwo = new ArrayList<>();
    listtwo.addAll(listone);
    listtwo.add(5);
    System.out.println(listtwo);
    listtwo.set(2, 7);
   System.out.println("After replacing index 2: " + listtwo);
   listtwo.remove(3);
    System.out.println(listtwo);
     System.out.println(listtwo.size());
     for(int i=0; i<listtwo.size(); i++){
        System.out.println("list two elements are : "+ listtwo.get(i));
     }
     for(Integer element : listtwo){
         System.out.println("list two elements are : "+ element);
     }

Stack<String> animals = new Stack<>();
animals.push("dog");
animals.push("cat");
animals.push("rabbit");
animals.push("pig");
animals.push("rat");
System.out.println(animals);
animals.pop();
System.out.println("after pop" + animals);
System.out.println(animals.peek());

     }
    
}
