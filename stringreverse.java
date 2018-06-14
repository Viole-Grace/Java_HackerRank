import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=0,rev=0,len=0;
        len=A.length();
        int flag = 2;
        for(i=0;i<len;i++)
        {
            if(A.charAt(i)==A.charAt(len-i-1))
            flag=0;
            else
                flag=1;
        }
        if(flag==0)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        
    }
}
