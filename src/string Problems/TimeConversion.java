import java.util.* ;

    //Problem Link: https://www.hackerrank.com/domains/algorithms?filters%5Bstatus%5D%5B%5D=unsolved&badge_type=problem-solving

public class TimeConversion{

     public static String timeConversion(String s) {

     int hour = Integer.parseInt(s.substring(0, 2));
    
    // Extract minutes and seconds
    String rest = s.substring(2, 8);
    
    // Extract AM/PM
    String period = s.substring(8);

    if (period.equals("AM")) {
        if (hour == 12) {
            hour = 0; // midnight case
        }
    } else { // PM
        if (hour != 12) {
            hour += 12;
        }
    }

    // Format hour to 2 digits and return result
    return String.format("%02d%s", hour, rest);
}
    

    public static void main(String args[] ){

        System.out.println(timeConversion("12:34:33AM"));
    }
}
