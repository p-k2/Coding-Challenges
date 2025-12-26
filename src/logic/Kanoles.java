import java.util.* ;

public class Kanoles{
  //  Problem link: https://leetcode.com/problems/maximum-subarray/submissions/1864281970/

public static int  maxSubArray(int[] array ){

 int maxSum= Integer.MIN_VALUE ; 
 int currSum = 0;

 for(int i =0 ; i<array.length ; i++){
  currSum = currSum + array[i];
     if(currSum< 0  ){ //if negative sum calculated 
        currSum = 0 ;
    }
    
     maxSum = Math.max(currSum , maxSum);
    }
    // Exception Case: No subArray sum can be found
    if(maxSum ==0 ){
    maxSum = Integer.MIN_VALUE ;
    for( int i =0 ; i <array.length ; i++){
        
        maxSum = (maxSum<array[i]) ? array[i]: maxSum ; // maxSum will be the largest element 
    }
}
   return maxSum;
}


public static void main(String[] args){

    int[] nums = new int[]{-2 , 0, -9, -8, -6} ;

// printSubarrays(nums);
kanoles(nums) ;

}
}