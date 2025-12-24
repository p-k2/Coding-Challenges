import java.util.*;

public class MergeSorted {
   public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;       // pointer for last valid element in nums1
    int j = n - 1;       // pointer for last element in nums2
    int k = m + n - 1;   // pointer for last position in nums1

    // Merge from the back
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    // Copy remaining nums2 elements (if any)
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
}

    public static void main(String args[]) {
        int[] arr = {2,4,6};
        int[] brr = {1,3,5,9};

        int[] newArr = merge(arr, 3, brr, 4);

        for(int x : newArr) {
            System.out.print(x + " ");
        }
    }
}