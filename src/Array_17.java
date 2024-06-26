// 1480. Running Sum of 1d Array

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]
//
//
//Constraints:
//
//1 <= nums.length <= 1000
//-10^6 <= nums[i] <= 10^6

import java.util.*;
public class Array_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = RunningSum1DArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
     }

     public static int[] RunningSum1DArray(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            pf[i] = pf[i-1]+arr[i];
        }

        return pf;
     }
}
