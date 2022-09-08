class Solution {
    // O ( 3 N ) ===> Time Complexity
    // O ( N ) ==> Space Complexity
    public int longestConsecutive(int[] arr) {        
       HashSet<Integer> hashSet = new HashSet<>();
	   
	   for(int i : arr){
	       hashSet.add(i);
	   }
	    
	   int longestStreak = 0;
	   
	   for( int num : arr ){
           
	       if( !hashSet.contains(num-1)){
	           
	            int currentNum = num;
	            int currentStreak = 1;
	       
	            while( hashSet.contains(currentNum+1)){
	                currentNum += 1;
	                currentStreak += 1;
	            }
	       
	            longestStreak = Math.max(longestStreak,currentStreak);
	       }
	   }
	   
	   return longestStreak;

    }
}
