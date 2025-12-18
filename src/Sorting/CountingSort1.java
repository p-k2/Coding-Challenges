
 import java.util.*;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] freq = new int[100]; //create the frequency counter

        for (int num : arr) { // count the frequency 
            freq[num]++;
        }

        List<Integer> list = new ArrayList<>(100);
        for (int f : freq) { // convert frequency counter to list
            list.add(f); 
        }

        return list; 
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(3);
        arr.add(2);

        List<Integer> freq = countingSort(arr);
        System.out.print(freq);
    }
}
    