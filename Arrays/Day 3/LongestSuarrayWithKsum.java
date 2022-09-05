// T C : O ( n ) 
// S C : O ( n )


class Solution{
    
    public static int lenOfLongSubarr (int A[], int N, int K) {

        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        int max=0;
          for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum==K)
             max=Math.max(i+1,max);
             else if(map.containsKey(sum-K)){
                 max=Math.max(i-(map.get(sum-K)),max);
             }
             if(!(map.containsKey(sum))){
                 map.put(sum,i);
             }
        }
        
        return max;
    }
    
    
}
