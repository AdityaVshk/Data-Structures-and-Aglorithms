

import java.util.*;
public class Array_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int m = 2;
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int [] ans = RangeSumQuery(arr,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");

        }

    }

    public static int[] prefixSum(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pf[i] = pf[i-1]+arr[i];
        }
        return pf;
    }


    public static int[] RangeSumQuery(int[][] arr1 ,int[] arr2){
        int[] pf = prefixSum(arr2);
        int[] ans = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            int left = arr1[i][0];
            int right = arr1[i][1];

            if(left>0){
                ans[i] = pf[right]-pf[left-1];
            }else{
                ans[i] = pf[right];
            }
        }
        return ans;
    }
}
