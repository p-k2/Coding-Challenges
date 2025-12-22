

 //Problem Link: https://www.hackerrank.com/challenges/sherlock-and-array/problem


import java.util.*;

public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        //Total Sum calculation
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int rightSum = totalSum - leftSum - arr.get(i); // Calculating right Sum 
            if (leftSum == rightSum) {
                return "YES";
            }
            leftSum += arr.get(i); 
        }

        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(1);
        myList.add(4);
        myList.add(1);
        myList.add(1);

        String ans = balancedSums(myList);
        System.out.println(ans);  // Expected output: YES
    }
}