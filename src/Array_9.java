// Found_Arrays2_Two Sum Brute
// Given n length array "arr" and an integer k, Check if there exists a pair(i,j) such that arr[i]+arr[j] == k and i!=j
//Input Format
//
//Each of the test cases have 3 lines.
//The First line contains the size of the array n.
//The second line contains the n elements of the array.
//The third line contains an integer k
//Constraints
//
//2 <= array length <= 10^5
//-10^4 <= array[i] <= 10^4
//Output Format
//
//Print true if there is a valid pair present else print false.
//Sample Input 0
//
//7
//2 -1 0 3 2 5 7
//8
//Sample Output 0
//
//true

import java.util.Scanner;

public class Array_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        boolean ans = Two_sum_Brute(arr,k);
        System.out.println(ans);
    }

    public static boolean Two_sum_Brute(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }

        return false;
    }
}

