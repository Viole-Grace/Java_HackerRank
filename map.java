import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      HashMap<String, Integer> hm = new HashMap<String, Integer>(); //recall the Part I and Part II of graphing with maps. re-write with hashmaps
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         hm.put(name, phone);         
         in.nextLine();
      }
      while(in.hasNext()) //standard Exception Handling
      {
         String s=in.nextLine();
         try
         {
            int temp = hm.get(s);
            System.out.println(s+"="+temp);
         }
          catch(NullPointerException e)
          {
            System.out.println("Not found");
         }    
      }
   }
}
