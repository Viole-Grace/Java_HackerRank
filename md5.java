import java.io.*;
import java.security.MessageDigest; //import this to call MD5 library. OR write an analytical MD5 working as a crypto-cracking code.
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try 
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            // return bytesToHex(md.digest
            byte[] digest = md.digest();
            for (byte b : digest) 
            {
                System.out.printf("%02x", b);
            }
        }
        catch (Exception ex) 
        {
            throw new RuntimeException(ex);
        }
    }
}
