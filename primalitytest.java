import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Write your code here.
       if(n.isProbablePrime(100))
           System.out.println("prime");
       else
        System.out.println("not prime");//since number can be a decimal digit , with a 100 digit capacity, running complexity time
       
       //returns max certainty of a number being prime. anything !=0 is certainty. If returns 0, is definitely composite;
       
   }
}
