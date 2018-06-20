public static PerformOperation isOdd()
{
    return num ->
    {
         return num%2==0?false:true; //0 is true, 1 is false. Re-standardise.
    } ;
}

public static PerformOperation isPrime()
{
    return num ->
    {
        return java.math.BigInteger.valueOf(num).isProbablePrime(1); //Java BigInteger function. recall BigInteger and BigDecimal
    }; 
}

public static PerformOperation isPalindrome() //can do with a string check as well. Integer.toString(num), for loop for i to n.Check from i to n-1, start i at 0. at i==n-i==mid, string check is complete
{
    return num ->
    {
      int r,sum=0,temp; 
      temp = num;
       while(num>0)
        {
            r = num % 10;
            sum = (sum*10)+r;  
            num = num/10;  
        }
      if(temp == sum)
        return true;
      else
        return false;
    };
   
}
} //the most important bracket. Forget this, forget the working of the code.
