import java.io.*;
import java.util.*;
import java.text.*;
import java.math.BigInteger;
import java.util.regex.*;

public class Solution 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        BigInteger a,b,c,d;
        a=sc.nextBigInteger();
        b=sc.nextBigInteger();
        c=b.add(a);
        d=a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}
