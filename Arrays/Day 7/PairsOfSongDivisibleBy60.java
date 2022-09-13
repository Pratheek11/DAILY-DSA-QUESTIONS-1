// T C : O ( n )
// S C : O ( 60 )

public int numPairsDivisibleBy60(int[] time) {

        int count =0;
        
        int[] arr = new int[60];
        
        Arrays.fill(arr,0);
        
        for(int i=0;i<time.length;i++){
            
            int r = time[i]%60;
            
            if(r==0){
                arr[0]++;
                count += arr[0] -1;
            }else if(arr[60-r] > 0){ // 1+59
                count += arr[60-r];
                arr[r]++;
            }else{
                arr[r]++;
            }
            
        }
        
        return count;
        
    }


// T C : O ( n ) + HashMap Operational Time
// S C : O ( n / 2 )


    public int numPairsDivisibleBy60(int[] time) {

         int count=0;
        
         HashMap<Integer,Integer> map =new HashMap<>();
        
         for(int i=0;i<time.length;i++)
         {
             int div = time[i] % 60;
             
             if(map.containsKey(60-div))
             {
                 count+=map.get(60-div);
             }
             
             if(div==0){
                 map.put(60, map.getOrDefault(60,0)+1);
             }else{
                 map.put(div, map.getOrDefault(div,0)+1);
             }
         }
        
         return count;
        
    }
