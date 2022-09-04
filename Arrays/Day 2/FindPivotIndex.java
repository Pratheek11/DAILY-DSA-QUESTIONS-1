// T C : O ( n )
// S C : O ( 1 )


class Solution {
    public int pivotIndex(int[] nums) {
        
        // BASE CASE
        if(nums.length<1) return -1;
        
        int rightSum=0, leftSum=0;
           
        // GET TOTAL SUM
        for(int i : nums) rightSum+=i;
        
        for(int i=0;i<nums.length;i++){
            // DECREMENT TO GET RIGHT SUM 
            rightSum-=nums[i];
        
            if(leftSum==rightSum) return i;
            
            // INCREMENT TO GET LEFT SUM
            leftSum+=nums[i];
        }
        
        return -1;
    }
}
