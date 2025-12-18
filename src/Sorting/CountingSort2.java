import java.util.* ;

public class CountingSort2{


  public static List<Integer> countingSort(List<Integer> arr) {
    int[] freq = new int[100];

    // Count frequencies
    for (int num : arr) {
        freq[num]++;
    }

    List<Integer> sorted = new ArrayList<>();

    // Build sorted list
    for (int i = 0; i < 100; i++) {
        while (freq[i]-- > 0) {
            sorted.add(i);
        }
    }

    // Print sorted list 
    for (int num : sorted) {
        System.out.print(num + " ");
    }

    return sorted;
}

    public static void main( String[] args)
{
    List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);

         countingSort(arr);
       

}}