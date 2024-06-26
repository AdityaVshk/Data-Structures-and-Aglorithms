// Found_Arrays2_Reverse Part of Array


// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
//Input Format
//
//Each of the test cases have 3 lines.
//The First line contains the size of the array n.
//The second line contains the n elements of the array.
//The third line contains two index s and e
//Constraints
//
//2 <= array length <= 10^5
//-10^4 <= array[i] <= 10^4
//Output Format
//
//Print all the array element in a line separated by space after reversing part of array [s,e]
//Sample Input 0
//
//10
//-3 4 2 8 3 9 6 2 8 10
//3 7
//Sample Output 0
//
//-3 4 2 2 6 9 3 8 8 10
import java.util.Scanner;

public class Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();


        ReversePartofArray(arr,start,end);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void ReversePartofArray(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
