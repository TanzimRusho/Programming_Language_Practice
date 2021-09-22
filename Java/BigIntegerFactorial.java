import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class BigIntegerFactorial
{
	static BigInteger getFactorial(int N)
	{
	    BigInteger f = new BigInteger("1");
	    
	    for(int i=2; i <= N; ++i)
	        f = f.multiply(BigInteger.valueOf(i));
	        
	    return f;
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N = 20;
		System.out.println(getFactorial(N));
	}
}
