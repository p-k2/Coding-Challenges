import java.util.* ;

public class LeftRotation{
    //Problem Link: https://www.hackerrank.com/challenges/array-left-rotation/problem

     public static  List<Integer>  rotateLeft(int d, List<Integer> arr) {
       
        for(int i=0; i<d;i++){
            int removed =  arr.remove(0); // rempve first element
            arr.add(removed); // add at last
            
        }
    return arr ;
    }

    public static void main( String[] args){
        List<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);



        System.out.println(rotateLeft(4, r));


    }
    
}