import java.io.*;
import java.util.Scanner;
public class Solution 
{
    public static void main(String [] args) 
    {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int row = 0; row < 6; row++) 
        {
            for (int col = 0; col < 6; col++) 
            {
                arr[row][col] = scan.nextInt();
            }
        }
        scan.close();
        System.out.println(maxHourglass(arr));
    }    
    public static int maxHourglass(int [][] arr) 
    {
        int max = Integer.MIN_VALUE;
        for (int row=0;row<4;row++) //you can only go till '3', since the only higher values are 4,5. Note that 6x6 is 0-5.
        {
            for (int col=0;col<4;col++)//max till '3' again for the same given reason.
            {
                int sum = findSum(arr, row, col);
                max = Math.max(max,sum);//keep resizing max as and till you get the highest value for the hourglass.
            }
        }
        return max;
    }    
    //NOTE:: You can implement a selection sort type MAX macro to keep track of the highest available sum.
    //The hourglass pattern ,for any element x at row i and column j:
    // a[i][j]+a[i][j+1]+a[i][j+2] - first three elements summed
    //a[i+1][j+1] - the middle hourglass element. Note that both i and j are incremented from orig; as its the 2nd (r+c) combination
    //a[i+2][j]+a[i+2][j+1]+a[i+2][j+2] -summation of last three elements
    //add first three,middle and last three to get a summation of the hourglass. Check this with all possible combinations inside the viable parameters <0,3> in a looping construct
    private static int findSum(int [][] arr, int r, int c) 
    {
        int sum = (arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2] + arr[r+1][c+1] + arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2]);
        return sum;
    }
}
