import java.util.* ;
        //Problem Link : https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
     public class MinMaxSum{

        public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
            long minVal = Integer.MAX_VALUE ; // variable to store minimum value in arr
            long maxVal = Integer.MIN_VALUE;    //variable to store maximi=um value in arr
            
            long sum = 0; 
            //calculating 
            //1. sum of the arr elemnts
            //2. finding minimum and maximum value element
           for (int val : arr) {
             sum += val;
            if (val < minVal) minVal = val;
            if (val > maxVal) maxVal = val;
    }
        System.out.println((sum - maxVal) + " "+ (sum - minVal) ) // subtracting mimium and maximum values from sum;
            }
        


        public static void main(String args[]){

            List<Integer> list = new ArrayList<>() ;
            list.add(2);
            list.add(3); 
            list.add(4); 
            list.add(5); 
            list.add(1); 
            miniMaxSum(list) ;
        }
     }