// Found_Arrays1_Sum of Array
//Given n length Array, You have to return sum of all the elements.
//Input Format
//
//Each of the test cases have 2 lines.
//First Line contains the size of the array n, while the second contains the n elements of the array.
//Constraints
//
//2 <= array length <= 10^5
//-10^4 <= array[i] <= 10^4
//Output Format
//
//Return an integer which is sum of all the array elements.
//Sample Input 0
//
//5
//10 2 31 6 1
//Sample Output 0
//
//50


import java.util.*;
public class Array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = Sum_of_Array(arr);
        System.out.println(ans);
    }

    public static int Sum_of_Array(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        return count;
    }
}
