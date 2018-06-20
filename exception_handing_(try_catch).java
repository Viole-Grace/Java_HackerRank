import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
           Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0)
                throw  new ArithmeticException("/ by zero"); //throwing a new exception, which calls its error class - invalid, so write another separate exception catcher for this
            else
                System.out.println(x/y);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName()); //class level Exception Handling. Refer C++ Exception Handling
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
