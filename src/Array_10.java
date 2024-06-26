// Found_Arrays2_Max Difference 1_HW
// Given n length array "arr". Find the pair with maximum value of arr[i] - arr[j]. You need to print max value of (arr[i] - arr[j]) possible and not the (i,j) itself.
//
//Note: Doing it by checking all the possible pairs. Works but can you do something smart?
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
//Print the maximum value of arr[i] - arr[j] Possible.
//Sample Input 0
//
//5
//3 9 8 4 1
//Sample Output 0
//
//8


import java.util.Scanner;

public class Array_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans  = Max_difference_1(arr);
        System.out.println(ans);
    }

    public static int Max_difference_1(int [] arr){
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min = arr[i];
            }
        }

        return Max-Min;
    }
}
