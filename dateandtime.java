import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Solution {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String month = in.next();
        //String day = in.next();
        //String year = in.next();
        Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);

		System.out.println(new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase());

		sc.close();
    }
}
