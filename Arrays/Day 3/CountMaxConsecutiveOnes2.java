// T C : O ( n )
// S C : O ( 1 )


class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int nums[], int n, int k) {
       
        // First Pointer
        int i = 0;
        // Second Pointer
        int j = 0;
        
        // Loop till Your First Pointer Cross Length of Array
        while( i < nums.length ){
            // If element is zero decrease k
            if( nums[i] == 0 ){
                k--;
            }
            
            
            // Once flip constraint is over move the second pointer to get max width of window
            if( k < 0 ){
                if( nums[j] == 0 ){
                    k++;
                }
                // Adujst the window according to k
                j++;
            }
            
            // Increase length of window
            i++;
        }
        
        return i-j;
    }
