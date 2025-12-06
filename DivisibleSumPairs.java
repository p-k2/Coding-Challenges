import java.util.* ;

public class DivisibleSumPairs{

      public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int[] freq = new int[k];  // remainder frequency array
    int count = 0;

    for (int value : ar) {
        int rem = value % k;

        // Complement remainder
        int complement = (k - rem) % k;

        // Add how many previous numbers had the complement remainder
        count += freq[complement];

        // Mark current remainder
        freq[rem]++;
    }

    return count;

    }


    public static void main(String[] args){



        List<Integer> ar = new ArrayList<Integer>() ;
        ar.add(1) ;
        ar.add(3) ;
        ar.add(2) ;
        ar.add(6) ;
        ar.add(1) ;
        ar.add(2) ;
        int k = 3 ;
        int n = ar.size() ;
        int pairs = divisibleSumPairs(n , k, ar) ;
        System.out.println(" Sum of pairs divisible by" + k + "=" + pairs) ;

    }
}