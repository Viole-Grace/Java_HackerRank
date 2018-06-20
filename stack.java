import java.util.*;
class Solution
{  private static Map<String,String> myMap = createMap();
   private static Map<String,String> createMap() {
       HashMap<String,String> result = new HashMap<String,String>();
       result.put("(",")");
       result.put("[","]");
       result.put("{","}");
       return Collections.unmodifiableMap(result);
   }
   
   public static void main(String []argh)
   {
       Scanner sc = new Scanner(System.in);
      
       while (sc.hasNext())
       {
           String input=sc.nextLine();
           Stack myStack = new Stack();          
           String last;
           String next;          
           for (int i=0 ; i<input.length(); i++)
           {
               next = Character.toString(input.charAt(i));                 
               if (myStack.empty()) 
               {
                   myStack.push(next);
               } else 
               {
                   last = myStack.peek().toString();
                   if (myMap.containsKey(last)) 
                   {
                       if (myMap.get(last).equals(next))
                       {
                           myStack.pop();
                       } else 
                       {
                           myStack.push(next);
                       }
                   } else 
                   {
                       myStack.push(next);
                       break;
                   }
               }                 
           }
           System.out.println(myStack.empty());        
       }
   }
}

