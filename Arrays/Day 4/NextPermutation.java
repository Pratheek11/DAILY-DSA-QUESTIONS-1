// T C : O ( n ) 
// S C : O ( n )

class Solution {
    public void nextPermutation(int[] nums) {
          // BASE CHECK
          if(nums==null || nums.length<=1) return;
        
          int i = nums.length-2;
        
          // BREAK POINT
          while(i>=0 && nums[i]>=nums[i+1]) i--;
        
          // FIND NEXT SMALLEST NUMBER 
          if(i>=0){
                int j = nums.length - 1;
                while(nums[j]<=nums[i]) j--;
                swap(nums,i,j); 
          }
            
          reverse(nums, i+1, nums.length - 1);   
    }
    
    // Swap Function
    public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    
    // Revrse Function
    public void reverse(int[] nums, int start, int end){
        while( start <= end ){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
