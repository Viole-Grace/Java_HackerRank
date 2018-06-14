import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int x;
        int sum=0,sum1=0;
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(x=0;x<n;x++)
            {
              sum+= (int)(Math.pow(2,x))*b;
                System.out.print(a+sum+" ");
            }
            sum=0;
            System.out.println();
        }
        
        in.close();
    }
}
