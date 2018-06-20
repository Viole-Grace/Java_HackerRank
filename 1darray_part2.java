import java.util.Scanner; //can use both BFS and DFS to solve this question. However, for unbalanced graphs like this problem, DFS is better suited
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) 
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int [] array = new int[n];
            for (int i = 0; i < n; i++) 
            {
                array[i] = scan.nextInt();
            }
            System.out.println(isSolvable(array, m, 0) ? "YES" : "NO");
        }
        scan.close();
    }
    
    //Basically a depth-first search (DFS). 
    // Marks each array value as 1 when visiting
    // Also refer DS LQ 13 and 14 to understand visited[i] and graph[i]. Represented by nodepointer and graph variables in Q13,14
    private static boolean isSolvable(int[] array, int m, int i) 
    {
        /* Base Cases */
        if (i < 0 || array[i] == 1) 
        {
            return false;
        } 
        else if (i + 1 >= array.length || i + m >= array.length) 
        {
            return true;
        }        
        array[i] = 1;
        //Recursive Cases (Tries +m first to try to finish game quickly) 
        return isSolvable(array, m, i + m) || isSolvable(array, m, i + 1) || isSolvable(array, m, i - 1); //refer copying of trees for multiple returns
    }
}
