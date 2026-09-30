import java.util.*;

// Leetcode link: https://leetcode.com/problems/3sum/submissions/2145903758/

public class Sum3{
        public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        
        // 1. Sort the array to utilize the two-pointer technique
        Arrays.sort(nums);
        int length = nums.length;
        
        // 2. Iterate through the array, fixing the first element of the triplet
        for (int i = 0; i < length - 2; i++) {
            // Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Initialize pointers: low starts after i, high starts at the end
            int low = i + 1;
            int high = length - 1;
            
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum == 0) {
                    // Found a valid triplet
                    triplets.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    
                    // Move both pointers inward
                    low++;
                    high--;
                    
                    // Skip duplicates for the second element
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    // Skip duplicates for the third element
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum < 0) {
                    // Sum is too small, move the left pointer to increase the sum
                    low++;
                } else {
                    // Sum is too big, move the right pointer to decrease the sum
                    high--;
                }
            }
        }
        return triplets;
    }

    
    public static void main(String ags[]){

        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }
}