class Printer //use function templates. Direct derivation from C++ 
{
   //Write your code here
 public <T> void printArray(T[] array) //for a template T
 {
    for(T item: array)
    {
        System.out.println(item);
    }
 }
}
