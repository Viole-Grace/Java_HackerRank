import java.util.Scanner;
import java.util.LinkedList;

public class Solution 
{
    public static void main(String[] args) 
    {
        // Create and fill Linked List of Integers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //N no. of integers, as in Problem Statement
        LinkedList<Integer> list = new LinkedList<>(); //LL is a class in Java. Use the library function to create a LL
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        
        // Operation list, like STL for C++
        int p= sc.nextInt(); //Q no. of queries
        for (int i = 0; i < p; i++) 
        {
            String action = sc.next();
            if (action.equals("Insert")) 
            {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } 
            else 
            { // "Delete"
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        sc.close();
        
        //Print our updated Linked List
        //Can use iterator if list is used directly
        for (Integer num : list) 
        {
            System.out.print(num + " ");
        }
    }
}
