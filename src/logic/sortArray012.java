import java.util.*;

//leetcode link: https://leetcode.com/problems/sort-colors/submissions/2145563212/
    public class sortArray012{
        
        public static void main(String args[]){

            int[] arr = { 2,0,2,1,1};

            sortColors(arr) ;
            for(int i=0; i<arr.length; i++){
                      System.out.println(arr[i]) ;
            }
          
        }

        public static void sortColors(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;

    // loop runs until mid is less than high
    while (mid <= high) {
        if (nums[mid] == 0) {
            // swap 0 to low pointer
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        } 
        else if (nums[mid] == 1) {
            // 1 is at right in middle
            mid++;
        } 
        else if (nums[mid] == 2) {
            // swap 2 to high pointer
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        
        }
    }
}
       
    }
    