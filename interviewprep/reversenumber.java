package interviewprep;

public class reversenumber {
    int number=-123;
    int reversenumber=0;
    int lastdigit;
    public void reverse()
    {
        while(number!=0)
        {
            lastdigit=number%10;
            if( (reversenumber > Integer.MAX_VALUE/10) || (reversenumber < Integer.MIN_VALUE/10) ) {
                System.out.println("Reversed Number is out of Integer bounds");
                return;
            }
            if(reversenumber<0 && lastdigit<0 && (reversenumber < (Integer.MIN_VALUE - lastdigit)/10)) {
                System.out.println("Reversed Number is out of Integer bounds");
                return;
            }
            reversenumber=reversenumber*10+lastdigit;
            number=number/10;
        }
        System.out.println("Reversed Number is: "+reversenumber);
    }   
    public static void main(String[] args) {
        reversenumber obj=new reversenumber();
        obj.reverse();
    }

}
