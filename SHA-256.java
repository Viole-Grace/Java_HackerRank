import java.io.*;
import java.security.MessageDigest; //NOTE::: Direct implementation of MD5. Just change Instance to SHA-256. No fricking use -_-
import java.util.*;

public class Solution 
{

    public static void main(String[] args) //copy entire code from MD5 program. Words completely in the same way
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256"); //direct copy of MD5 code except instance. Change to SHA-256 here
            md.update(str.getBytes());
            // return bytesToHex(md.digest
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
