class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        
        // LOGIC WORKS IN O(N) SINCE THE ELEMENTS ARE SORTED 
        
        // index = -1 if all row elements are zero return -1
        int index=-1;
        // first row
        int i = 0;
        // last column
        int j=m-1;
       
        // condition
        while(i<n && j>=0)
        {
            // every element is 1 then go to previous element and update row index
            if(arr[i][j]==1){
                j--;
                index = i;
            }
            else
            {
                // increment to next row if it is not 1
                i++;
            }
        }
        
        // return answer
        return index;
    }
}
