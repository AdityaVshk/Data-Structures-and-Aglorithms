// Found_2D Array_Print col wise
// Given a 2D array, Print col wise integers.
//Input Format
//
//The first line contains two integers n and m representing row and column of 2D array.
//Each of next n rows contains m numbers of 2D array.
//Constraints
//
//2 <= n,m <= 1000
//0 <= elements of array <= 10^4
//Output Format
//
//Print integers of each col of array in a line separated by space.
//Sample Input 0
//
//2 3
//1 2 3
//4 5 6
//Sample Output 0
//
//1 4
//2 5
//3 6




import java.util.Scanner;

public class Array_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }
}
