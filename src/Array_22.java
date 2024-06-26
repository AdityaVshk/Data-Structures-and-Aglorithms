// Count Odd Numbers in an Interval Range
//Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
// Example 1:
//
//Input: low = 3, high = 7
//Output: 3
//Explanation: The odd numbers between 3 and 7 are [3,5,7].
//Example 2:
//
//Input: low = 8, high = 10
//Output: 1
//Explanation: The odd numbers between 8 and 10 are [9].


import java.util.*;
public class Array_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        if(left%2!=0 || right%2!=0){
            System.out.println((right-left)/2+1);
        }else{
            System.out.println((right-left)/2);
        }
    }
}
