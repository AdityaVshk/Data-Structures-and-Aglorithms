// Found_Arrays1_Swap Indexes

// Given n length Array and 2 indexes, You have to swap the elements of 2 indexes and print the array.
//Input Format
//
//Each of the test cases have 3 lines.
//The First line contains the size of the array n.
//The second line contains the n elements of the array.
//The third line contains two index.
//Constraints
//
//2 <= array length <= 10^5
//-10^4 <= array[i] <= 10^4
//0 <= indexs < array length
//Output Format
//
//Print all the array element in a line separated by space after swapping
//Sample Input 0
//
//5
//31 4 -7 1 -29
//1 4
//Sample Output 0
//
//31 -29 -7 1 4



import java.util.Scanner;
public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        SwapIndexes(arr,index1,index2);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }

    public static void SwapIndexes(int[] arr,int ind1,int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
