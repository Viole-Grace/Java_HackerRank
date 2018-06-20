import static java.lang.System.*; 
class Prime 
{
void checkPrime(int... n) //indefinite no. of arguments. Replaces with (*args)  in python
{
    for( int num: n) //iteratre from int num to n, each iteration is num+1.Alternately, write a while loop
    {
        if(BigInteger.valueOf(num).isProbablePrime(10)) //parameter probability can be 5-8 too. 10 is a sure way of setting it correctly
            System.out.print(num+" ");//print number if its a prime. If not, empty lining - wont print anything
    }
    System.out.println(); //goes to next line
}
}
