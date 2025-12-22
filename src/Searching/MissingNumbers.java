import java.util.* ;

//Problem Link: https://www.hackerrank.com/challenges/missing-numbers/problem

public class MissingNumbers{

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        Map<Integer , Integer> freqA = new HashMap<>() ;
        Map<Integer , Integer> freqB = new HashMap<>() ;

        for(int num: arr){
            freqA.put(num , freqA.getOrDefault(num , 0) +1) ;
        }
        for(int num: brr){
            freqB.put(num , freqB.getOrDefault(num , 0) +1) ;
        }

        ArrayList<Integer> missing = new ArrayList<>() ;

         for (int num : freqB.keySet()) {
            int countB = freqB.get(num);
            int countA = freqA.getOrDefault(num, 0);

            if (countA < countB) {
                missing.add(num);
            }
        }

        Collections.sort(missing); // sorted output
        return missing;
    }


    

    public static void main( String[] args){
          List<Integer> arrA = new ArrayList<>() ;
          arrA.addAll( Arrays.asList(7, 2, 5, 3));
          List<Integer> arrB = new ArrayList<>() ;
           arrB.addAll(Arrays.asList(7, 2, 5, 3,5,3)) ;
       

        List<Integer> result = missingNumbers(arrA, arrB);
        System.out.println("Missing numbers: " + result);
        // Output: Missing numbers: [3, 5]

        
    }
}