
class MyCalculator
{
    public static int power(int n, int p) throws Exception //regular exception. Can throw IOException as well
    {
        if(n<0 || p<0 ) //takes care of all -ve base,exp cases
        {
            throw new Exception ("n or p should not be negative.");
        } 
        else if(n<=0&&p<=0) //takes care of 0^0 cases
        {
            throw new Exception ("n and p should not be zero.");
        }
        else 
        {
            return ((int)Math.pow(n,p)); //pow is a double / float function. Hence,typecast.
        }
    }
}
