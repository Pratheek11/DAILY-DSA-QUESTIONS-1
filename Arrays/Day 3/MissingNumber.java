// Math LOGIC
// T C : O ( n )
// S C : O ( 1 )

class Solution {
    public int missingNumber(int[] nums) {
    int sum = 0;
        
    for(int i : nums){
        sum = sum + i;
    }
        
    int totalSum = (nums.length * (nums.length + 1))/2;
        
    return totalSum-sum;
    }
}

// HASHING
// T C : O ( n )
// S C : O ( n )

class Solution {
    public int missingNumber(int[] nums) {
        int[] arr = new int[N + 1];
      
        for (int i = 0; i < N; i++) {
            arr[nums[i]] = 1;
        }
      
        for (int i = 0; i <= N; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }
        return N + 1;
    }
}
