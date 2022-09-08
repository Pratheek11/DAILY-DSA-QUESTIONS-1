// T C : O ( n ) 
// S C : O ( n )

// You can make space complexity as O ( 1 ) by reversing Array List it Takes extra O ( n ) T C using Collections.reverse() or Swap Logic 

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> answer = new ArrayList<>();
    
        int[] leaders = new int[n];
        
        int leader=arr[n-1];
        
        int j = 0;
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                leaders[j] = arr[i];
                j = j + 1;
            }
        }
        
        // INSTEAD OF REVERSE THE COLLECTION USED A ARRAY FOR SAME
        for(int i = n - 1 ; i >= 0 ; i--){
            if( leaders[i] != 0 ){
                answer.add(leaders[i]);
            }
        }
        
        return answer;
    }
}
