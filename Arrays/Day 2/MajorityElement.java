// T C : O ( n )
// S C : O ( 1 ) 

class Solution {
    public int majorityElement(int[] nums) {
        // MOORE VOTING ALGORITHM
        
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            // FIND THE CANDIDATE
            if (count == 0) {
                candidate = num;
            }
            
            // VOTES FOR CANDIDATE
            if(num==candidate){
                count += 1; 
            }else{
                count -= 1; 
            }
        }

        // CHECK IF ARRAY MAJORITY DOESNT HAVE N / 2 ELEMNTS
        
        int check = 0;
        
        for(int num : a){
            if(num == candidate){
                check++;
            }
        }
        
        
        return check > size / 2 ? candidate : -1;
    }
}


