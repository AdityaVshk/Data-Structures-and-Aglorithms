// 238. Product of Array Except Self
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
//Example 2:
//
//Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]

import java.util.*;
public class Array_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int [] ans = Product_of_Array_Except_Self(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

//        public static int[] prefixSum(int[] arr){
//        int[] pf = new int[arr.length];
//
//        pf[0] = arr[0];
//        for(int i=1;i<arr.length;i++){
//            pf[i] = pf[i-1]*arr[i];
//        }
//
//        return pf;
//    }


//    TC:o(N);
//    SC:o(N);
//    public static int[] Product_of_Array_Except_Self(int[] arr){
//        int [] pf = prefixSum(arr);
//        int[] ans = new int[arr.length];
//
//        int suffix = 1;
//        for(int i=arr.length-1;i>=1;i--){
//            ans[i] = pf[i-1]*suffix;
//            suffix = suffix*arr[i];
//        }
//        ans[0] = suffix;
//
//        return ans;
//
//    }



//    TC:o(N);
//    SC:o(1);

    public static int[] Product_of_Array_Except_Self(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pf[i] = pf[i-1]*arr[i];
        }

        int suffix = 1;
        for(int i=arr.length-1;i>=1;i--){
            pf[i] = pf[i-1]*suffix;
            suffix = suffix*arr[i];
        }
        pf[0] = suffix;
        return pf;

    }
}
