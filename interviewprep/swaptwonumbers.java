package interviewprep;

public class swaptwonumbers {
    public static void main(String[] args) {
        int a =11;
        int b=20;
    a=a^b; //30
    b=a^b; //10
    a=a^b; //20
    System.out.println("After swapping a= "+a+" b= "+b);
    /*int a =10;
    int b=20;

    a=a+b; //30
    b=a-b; //10
    a=a-b; //20
    System.out.println("After swapping a= "+a+" b= "+b);
    /*public void swap()
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a= "+a+" b= "+b);
    }*/


    }


}
