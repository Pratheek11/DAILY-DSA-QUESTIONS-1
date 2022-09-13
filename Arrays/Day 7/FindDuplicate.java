// T C : O ( n )
// S C : O ( 1 )


class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int idx = 0;
        for (int num : nums) {
            idx = Math.abs(num);
            if (nums[idx] < 0) {
                break;
            }
            nums[idx] = -nums[idx];
        }

        return idx;
    }
}
