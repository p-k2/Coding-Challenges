import java.util.*;

//Problem Link: https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

public class BirthdayCandles{

     public static int birthdayCakeCandles(List<Integer> candles) {
     int largest = 0; // The largest candle size
     int maxCount = 0 ; // Count the no. of largest candles
     for (int candle : candles ){
        int currheight = candle ;
        if( currheight> largest ){
            largest = currheight;
            maxCount = 1;
        }else if( currheight == largest){
            maxCount+=1 ;
        }
        
     }
     return maxCount;
    }

    public static void main( String[] args){
        List<Integer> can = new ArrayList<>() ;
        can.add(3) ;
        can.add(2) ;
        can.add(1) ;
        can.add(3) ;
        System.out.println(birthdayCakeCandles(can)) ;


    }
}