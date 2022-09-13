// T C : O ( n )
// S C : O ( 1 )

public int jump(int[] nums) {
        int n = nums.length;
        int jump = 0;
        int maxReach = 0;
        int currEnd = 0;
        
        if( nums.length == 1 ){
            return 0;
        }
        
        for( int i = 0 ; i < n ; i++){
            maxReach = Math.max(maxReach, i + nums[i] );
            
            // Condition reached come out of loop
            if( maxReach >= n-1 ){
                return 1 + jump;
            }
            
            // Condition Failed so return -1
            if( i == maxReach ){
                return -1;
            }
            
            // Current Jump and record the jump
            if( i == currEnd ){
                jump++;
                currEnd = maxReach;
            }
            
        }
        
        return -1;
    }
