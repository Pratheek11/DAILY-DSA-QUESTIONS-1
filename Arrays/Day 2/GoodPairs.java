package ARRAYS;

public class GoodPairs {
    public static void main(String[] args) {
        int a[] = { 1,2,3,1,1,3};
        int arr[] = new int[6];
        int count = 0;
        for(int b : a){
            count += arr[b]++;
        }
        System.out.println(count);
    }
}
