// T C : O ( log n )
// S C : O ( 1 )


class Solution{
    static int searchInSorted(int arr[], int N, int Key)
    {
        
        // Your code here
        int low = 0;
        int high = N - 1;
        
        while( low <= high ){
            
            // REDUCE THE MEMORY OVER FLOW
            int mid = low + ( ( high - low ) / 2 );
            
            if( Key == arr[mid] ){
                return 1;
            }else if( Key > arr[mid] ){
                low = mid + 1;
            }else{
                high = mid -1;
            }
            
        }

        return -1;
        
    }
}
