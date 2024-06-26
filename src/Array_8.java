// Found_Arrays2_Count Greater

// Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.
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
//Print a single Integer representing total no. of elements in the array having atleast 1 element greater than itself.
//Sample Input 0
//
//7
//-4 -3 7 9 3 9 4
//Sample Output 0
//
//5
import java.util.Scanner;

public class Array_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = Greater(arr);
        System.out.println(size-ans);
    }


    public static int Greater(int[] arr){
        int Max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > Max ){
                Max = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(Max == arr[i]){
                count++;
            }
        }

        return count;
    }
}
