// RECURSION WAY
// T C : O ( n )
// S C : O ( 1 )
class Solution
{
        /*
        LEFT ROTATION 
        Reversal algorithm For ArrayRotation
        1. Reverse the first part : 0 to number of rotation - 1
        2. Reverse last part : number of rotation to array size 
        3. Reverse the whole array.
        */
     
     
         /*
        RIGHT ROTATION 
        Reversal algorithm For ArrayRotation
        1. Reverse the first part : 0 to array size - number of rotation
        2. Reverse last part : array size - number of rotation to array size
        3. Reverse the whole array.
        */
        
    void leftRotate(long arr[], int d, int n)
    {
        // Base Condition
        if (d == 0)
            return;
  
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
        
    }
    
        /*Function to reverse arr[] from index start to end*/
    void reverseArray(long arr[], int start, int end)
    {
        long temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
