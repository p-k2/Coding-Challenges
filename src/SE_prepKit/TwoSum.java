import java.util.*;

//Problem Link: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/time-slot-task-pairing/problem?isFullScreen=true

public class TwoSum {


    public static List<Integer> findTaskPairForSlot(List<Integer> taskDurations, int slotLength) {
    // Write your code here
       HashMap<Integer, Integer> map = new HashMap<>();
       List<Integer> Sol = new ArrayList<>();

    for (int i = 0; i < taskDurations.size(); i++) {
        int complement = slotLength - taskDurations.get(i);
        
// if compliment exists, get the index of compliment 
        if (map.containsKey(complement)) {
            Sol.add( map.get(complement));
            Sol.add( i) ;
            return Sol ;
        }
 // if compliment doesnt exist, store the cuurrent integer and its index
 // integer value is the key 
 // index is the value to the key
        map.put(taskDurations.get(i), i); 
    }
        Sol.add(-1);
        Sol.add(-1);
        
    return Sol; // will never reach if one solution exists

    }

    public static void main(String[] args){

         List<Integer> taskDurations = new ArrayList<>();
        taskDurations.add(2);
        taskDurations.add(7);
        taskDurations.add(11);
        taskDurations.add(15);
        System.out.println(findTaskPairForSlot(taskDurations, 9));
    }
}