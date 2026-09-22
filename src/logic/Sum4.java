import java.util.* ;


public class Sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruples = new ArrayList<>();
        if (nums == null || nums.length < 4) return quadruples;

       //Sort Array
        Arrays.sort(nums);
        int length = nums.length;

        // i loop ( 1st no.)
        for (int i = 0; i < length - 3; i++) {
            // skip duplicates of i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // j loop ( 2nd no.)
            for (int j = i + 1; j < length - 2; j++) {
                // skip duplicates of j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int low = j + 1;      // third no.
                int high = length - 1; // fourth no.

                // 2-Pointer Approach
                while (low < high) {
                    // order: i , j, low , high
                    long sum = (long) nums[i] + nums[j] + nums[low] + nums[high];

                    if (sum == target) {
                        // same order
                        quadruples.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));

                        // skip duplicates of low
                        while (low < high && nums[low] == nums[low + 1]) low++;
                        //skip duplicates of high
                        while (low < high && nums[high] == nums[high - 1]) high--;

                        low++;
                        high--;
                    } else if (sum < target) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return quadruples;
    }


    public static void main( String[] args){
        int[] nums = {1,0,-1,0,-2,2};
      int   target =0;
        List<List<Integer>> ans = fourSum(nums, target) ;
        System.out.println(ans);
    }
}