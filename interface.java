//Write your code here
class MyCalculator implements AdvancedArithmetic {
    int j = 0;
   public int divisor_sum(int n) {
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                j = j + i; 
            }
        }
        return j;
    }
   
}
