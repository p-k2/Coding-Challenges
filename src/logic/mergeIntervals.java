import java.util.* ;

//leetcode link: https://leetcode.com/problems/merge-intervals/description/

public class mergeIntervals{


public static int[][] merge(int[][] intervals) {
    int m = intervals.length;
    if (m <= 1) {
        return intervals;
    }

    // 1. Highly Optimized Sort: O(N log N) using a lambda comparator
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    // 2. Pre-allocate the result array to avoid ArrayList overhead
    int[][] ans = new int[m][2];
    
    // Initialize with the first interval
    ans[0][0] = intervals[0][0];
    ans[0][1] = intervals[0][1];
    int ind = 0; // Tracks the last merged interval index in 'ans'

    // 3. Single Pass Linear Scan: O(N) runtime
    for (int i = 1; i < m; i++) {
        // If the current interval overlaps with the previous one
        if (intervals[i][0] <= ans[ind][1]) {
            // Merge by updating the end time (inplace maximum)
            ans[ind][1] = Math.max(ans[ind][1], intervals[i][1]);
        } else {
            // No overlap, move to the next slot in 'ans'
            ind++;
            ans[ind][0] = intervals[i][0];
            ans[ind][1] = intervals[i][1];
        }
    }

    // 4. Trim the array to the exact number of merged elements
    return Arrays.copyOf(ans, ind + 1);
}


    public static void main(String[] args){

        int[][] intervals = { {4,7},{1,4}} ;
        int[][] newIntervals = merge(intervals) ;
        for (int i=0; i<newIntervals.length ; i++)
        {
            for(int j=0; j<2;j++){
                     System.out.println(  "["+ i + "]" + "["+ j + "]= " +newIntervals[i][j] + ", ") ;
            }
        }
       
       
    }
}