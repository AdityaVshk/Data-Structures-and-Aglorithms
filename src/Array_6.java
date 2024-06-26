// Found_Arrays2_Rotate Array

// Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.
//
//Leetcode Link: https://leetcode.com/problems/rotate-array/
//Input Format
//
//The first line contains an integer n denoting size of the array.
//Next line contains the elements of array.
//Next line contains the integer k.
//Constraints
//
//1<=N<=10^6
//1<=k<=10^6
//-10^5<=arr[i]<=10^5
//Output Format
//
//Output the updated array.
//Sample Input 0
//
//7
//1 2 3 4 5 6 7
//3
//Sample Output 0
//
//5 6 7 1 2 3 4





import java.util.Scanner;

public class Array_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        k=k%size;

        ReverseArray(arr,0,size-1);
        ReverseArray(arr,0,k-1);
        ReverseArray(arr,k,size-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void ReverseArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
