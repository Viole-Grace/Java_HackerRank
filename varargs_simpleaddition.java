//Write your code here
class Add
{
    public void add(int...numbers) //indefinite no. of arguments. import java.lang.System.*; to use this or the java.lang.reflect.*;
    {
        int sum=0;
        String operator=""; //empty string
        for(int num:numbers) //iterative addition of all numbers given
        {
            sum+=num; 
            System.out.print(operator+num);//empty string + num = empty string
            operator="+"; //after adding the first digit, it should show '+' operator till the last digit
        }
        //set operator as operator="=";
        System.out.println("="+sum);
    }
}
