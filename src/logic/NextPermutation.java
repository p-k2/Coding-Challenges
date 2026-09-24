import java.util.* ;

//Leetcode: https://leetcode.com/problems/next-permutation/description/

public class NextPermutation{


      public static void nextPermutation(int[] nums) {

        int pivot=-1;
        int n= nums.length ;

        //find pivot
        for(int i=(n-2) ; i>=0 ; i--){
          
                if(nums[i]<nums[i+1]){
                pivot =i;
                break;
                }       
               
        }

        //no pivot : Reverse the 
        if(pivot ==-1){
             for (int i = 0; i < nums.length / 2; i++) {
            int t = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = t;
        }
            return;
        }

        //next larger element
        for(int i=n-1 ; i >pivot;i--){
            if(nums[i]> nums[pivot]){
                int temp = nums[pivot] ;
                nums[pivot]= nums[i] ;
                nums[i] = temp;
                break;
            }
        }

        //reverse elemets from pivot+1
        int i= pivot+1;
        int j= n-1;
        while( i<=j && i<n && j>0){
             int temp = nums[i] ;
                nums[i]= nums[j] ;
                nums[j] = temp;
                i++;
                j--;
        }
        return ;
    }

    public static void main(String args[]){
        int[] arr = {2,3,1};

      nextPermutation(arr) ;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ ", ");
        }
    }
}