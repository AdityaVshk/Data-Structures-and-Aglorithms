// Found_Arrays2_Reverse Array
// Given n length Array, You have to Reverse the entire array and print it.
//Input Format
//
//Each of the test cases have 2 lines.
//The First line contains the size of the array n.
//The second line contains the n elements of the array.
//Constraints
//
//2 <= array length <= 10^5
//-10^4 <= array[i] <= 10^4
//Output Format
//
//Print all the array element in a line separated by space after reversing it
//
//Leetcode Link: https://leetcode.com/problems/rotate-array/
//Sample Input 0
//
//5
//10 20 30 40 50
//Sample Output 0
//
//50 40 30 20 10


import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        ReverseArray(arr);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }

    public static void ReverseArray(int[] arr){
        int start = 0;
        int end  = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
