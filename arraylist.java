import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d,q,x,y;
        ArrayList[] set = new ArrayList[n]; //create an arraylist
        for(int i=0;i<n;i++)
        {
             d = in.nextInt();
             set[i] = new ArrayList(); //create adjlists sort of function
             for(int j=0;j<d;j++)
            {  
                set[i].add(in.nextInt());       //set values
            }
        }   
        q=in.nextInt();
        for(int i=0;i<q;i++) //implement Exception Handling
        {
            x=in.nextInt();
            y=in.nextInt();
            try //no throwing required, catch all exceptions with a non designed set i/p
            {
                System.out.println(set[x-1].get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}
