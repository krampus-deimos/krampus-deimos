package kenhowell;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Time;

public class TimeRecord {

    String startingTime;
    String endingTime;
    String breakDeduction;
    Double bonusminutes;


    public TimeRecord (String start, String end, String breaktime){
        String[] splitStartTime = start.split(":");
        String[] splitEndTime = end.split(":");
        this.startingTime = splitStartTime[0];
        this.endingTime = splitEndTime[0];
        this.breakDeduction = breaktime;
        this.bonusminutes = Double.parseDouble(splitStartTime[1]) + Double.parseDouble(splitEndTime[1]) ;
    }

    double calculateHours(){
        double clockIn = Double.parseDouble(this.startingTime);
        double clockOut = Double.parseDouble(this.endingTime);
        double remainderMin = this.bonusminutes;
        double totalBreak = Double.parseDouble(this.breakDeduction);
        clockOut += 12;
        totalBreak /= 60;
        remainderMin /= 60;

//        System.out.println("clockIn = " + clockIn);
//        System.out.println("clockOut = " + clockOut);
//        System.out.println("remainderMin = " + remainderMin);
//        System.out.println("totalBreak = " + totalBreak);

        return (((clockOut - clockIn) + remainderMin) - totalBreak);
    };

    public static void main(String[] args) {
        TimeRecord Monday = new TimeRecord("9:15","5:45","30");
        TimeRecord Tuesday = new TimeRecord("9:15","5:15","40");
        TimeRecord Wednesday = new TimeRecord("8:15","3:45","60");
        TimeRecord Thursday = new TimeRecord("7:15","3:45","30");
        TimeRecord Friday = new TimeRecord("9:15","5:45","30");
//
        System.out.println("Monday.calculateHours() = " + Monday.calculateHours());
        System.out.println("Tuesday.calculateHours() = " + Tuesday.calculateHours());
        System.out.println("Wednesday.calculateHours() = " + Wednesday.calculateHours());
        System.out.println("Thursday.calculateHours() = " + Thursday.calculateHours());
        System.out.println("Friday.calculateHours() = " + Friday.calculateHours());

        BigDecimal total = new BigDecimal(Monday.calculateHours() + Tuesday.calculateHours() + Wednesday.calculateHours() + Thursday.calculateHours() + Friday.calculateHours() );
        total = total.setScale(2, RoundingMode.CEILING);
        System.out.println("total = " + total);
//        System.out.println("TOTAL: " + (Monday.calculateHours() + Tuesday.calculateHours() + Wednesday.calculateHours() + Thursday.calculateHours() + Friday.calculateHours() ));
//        String testtime = "9:30";
//        String[] splittime = testtime.split(":");
//        System.out.println("splittime[0] = " + splittime[0]);
//        System.out.println("splittime[1] = " + splittime[1]);

    }
}
