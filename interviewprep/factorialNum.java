package interviewprep;

import java.math.BigInteger;

public class factorialNum {
    int number=50;
    BigInteger result = BigInteger.ONE;
    public void factorial()
    {
        for(int i=1;i<=number;i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of "+number+" is: "+result);
    }   
    public static void main(String[] args) {
        factorialNum obj=new factorialNum();
        obj.factorial();
    }
    
}
