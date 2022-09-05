// T C : O ( n ) + log n 
// S C : O ( n )


class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : a){
            set.add(i);
        }
        
        for(int j : b){
            set.add(j);
        }
        
        return set.size();
    }
}
