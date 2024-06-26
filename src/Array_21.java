// // 42. Trapping Rain Water
//
//// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
////Output: 6
////Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
////Example 2:
////
////Input: height = [4,2,0,3,2,5]
////Output: 9
////
////
////Constraints:
////
////n == height.length
////1 <= n <= 2 * 104
////0 <= height[i] <= 105

import java.util.*;
public class Array_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = TrappingRainWater(arr);
        System.out.println(ans);
    }


    public static int[] PrefixMax(int[] arr){
        int[] pfm = new int[arr.length];

        pfm[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pfm[i] = Math.max(pfm[i-1],arr[i]);
        }

        return pfm;
    }

    public static int[] SuffixMax(int[] arr){
        int[] sfm = new int[arr.length];
        sfm[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            sfm[i] = Math.max(sfm[i+1],arr[i]);
        }
        return sfm;
    }

    public static int TrappingRainWater(int[] height){
        int[] pfm = PrefixMax(height);
        int[] sfm = SuffixMax(height);
        int amount = 0;
        for(int i=1;i<height.length-1;i++){
            int yb = Math.min(pfm[i-1],sfm[i+1]);
            if(yb-height[i]>0){
                amount+=yb-height[i];
            }
        }
        return amount;
    }
}
