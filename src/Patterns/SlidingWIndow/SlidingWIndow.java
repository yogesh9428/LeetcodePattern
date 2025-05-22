package Patterns.SlidingWIndow;

public class SlidingWIndow {
    public static void main(String[] args) {
          HighestSubarraysum(new int[]{2,1,5,1,3,7} , 3);
    }
    static int HighestSubarraysum(int[] arr , int k ){
        int sum = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for (int i=0; i<k ; i++){
            sum += arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            max_sum = Math.max(max_sum , sum);
            sum = sum - arr[i - k] + arr[k];

        }
        return Math.max(max_sum , sum);
    }
}
