// Found_Arrays1_Largest Number At Least Twice_HW

// You need to find whether the largest element in the array is at least twice as much as every other number in the array.
//Input Format
//
//Each of the test cases have 2 lines.
//First Line contains the size of the array, while the second contains the elements of the array.
//Constraints
//
//2 <= array length <= 10^5
//0 <= array[i] <= 100
//Largest Number will always be unique in the array.
//Output Format
//
//Output the index(0-based) of the largest element if the condition holds true or -1 otherwise.
//Sample Input 0
//
//4
//1 2 3 4
//Sample Output 0
//
//-1
import java.util.Scanner;

public class Array_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int ans = Largest_number_atleast_Twice(arr);
        System.out.println(ans);
    }

    public static int Largest_number_atleast_Twice(int [] arr){
        int Largest_number = Integer.MIN_VALUE;
        int Second_Largest_number = -1;
        int Index = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > Largest_number){
                Second_Largest_number = Largest_number;
                Largest_number = arr[i];
                Index = i;
            }else if(arr[i]>Second_Largest_number){
                Second_Largest_number = arr[i];
            }
        }

        if(Largest_number>=Second_Largest_number*2){
            return Index;
        }else {
            return -1;
        }
    }
}
