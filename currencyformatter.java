import java.util.*;
import java.text.*;
import java.text.NumberFormat;
public class Solution {
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //double payment = scanner.nextDouble();
        //scanner.close();
        //double cents=0.0;
        //double us=0.0,india=0.0,china=0.0,france=0.0;
        //us=payment;
        //india=payment;
        //china=payment;
        Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();

		System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
		System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
		System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
		System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
        
        // Write your code here.
        
        //System.out.println("US: $" + us);
        //System.out.println("India: Rs." + india);
        //System.out.println("China: ¥" + china);
        
    }
}
