import java.util.*;

//Problem Link: https://www.hackerrank.com/challenges/migratory-birds/problem

public class MigratoryBirds{

    public static int migratoryBirds(List<Integer> arr) {
        int[] freq = new int[6]; //bird IDs are 1 to 5

        //Count frequencies
        for(int num : arr){
            freq[num]++;
        }

        int maxFreq =0;
        int result = 0;

        //Find bird with max frequency (smallest id if tie)
        for( int i=1 ; i<=5 ; i++){
          int currLargest = freq[i] ;
          if(currLargest> maxFreq){
            maxFreq= currLargest;
            result =i ;
          }
        }
        return result;
    
    }

    public static void main(String[] args ){
      int[] arr = {1,2,3,4,5,4,3,2,1,3,4};
         List<Integer> ar = new ArrayList<>() ;
        ar.addAll(Arrays.asList(arr)) ;
        // ar.add(2) ;
        // ar.add(3) ;
        // ar.add(4) ;
        // ar.add(5) ;
        // ar.add(4) ;
        // ar.add(3) ;
        // ar.add(2) ;
        // ar.add(1) ;
        // ar.add(3) ;
        // ar.add(4) ;
        System.out.println(migratoryBirds(ar));

    }
}