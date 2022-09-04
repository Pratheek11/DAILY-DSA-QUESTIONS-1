
// MATH FORMULA
// https://leetcode.com/problems/fibonacci-number/discuss/1287817/Binet-Formula-Easy-Java-Solution
// T C : O ( √ n )
// S C : O ( 1 ) 

class Solution {
    public int fib(int n) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(goldenRatio,n)/Math.sqrt(5));
    }
}

// RECURSIVE WAY
// T C : O ( n )
// S C : O ( 1 )
class Solution {
    public int fib(int n) {
        // BASE CONDITION 
        if( n == 0 || n == 1){
            if( n == 0 ){
                return 0;
            }
            
            if( n == 1 ){
                return 1;
            }
        }
        
        // FAITH AND EXPECTATION
        return fib(n-1) + fib(n-2);
    }
}
