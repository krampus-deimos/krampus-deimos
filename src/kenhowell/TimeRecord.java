package kenhowell;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRecord {


    String startingTime;
    String endingTime;
    String breakDeduction;


    public TimeRecord (String start, String end, String breaktime){
//        String[] splitStartTime = start.split(":");
//        String[] splitEndTime = end.split(":");
        DateFormat inputDF = new SimpleDateFormat("hh:mm aa");
        DateFormat output24DF = new SimpleDateFormat("HH:mm");
        Date date = null;
        String output = null;
        try{
        date = inputDF.parse(start);
        output = output24DF.format(date);
        }
        catch (ParseException pe){
            pe.printStackTrace();
        }
        this.startingTime = output;
        try {
            date = inputDF.parse(end);
            output = output24DF.format(date);
        } catch (ParseException pe){
            pe.printStackTrace();
        }
        this.endingTime = output;
        this.breakDeduction = breaktime;
    }

//    double calculateHours(){
//        double clockIn = Double.parseDouble(this.startingTime);
//        double clockOut = Double.parseDouble(this.endingTime);
//        double totalBreak = Double.parseDouble(this.breakDeduction);
//        clockOut += 12;
//        totalBreak /= 60;
//
//
//        return ((this.startingTime - this.endingTime) - totalBreak);
//    };

    public static void main(String[] args) {
        TimeRecord Monday = new TimeRecord("9:15 AM","5:45 PM","30");
        TimeRecord Tuesday = new TimeRecord("9:15 AM","5:15 PM","40");
        TimeRecord Wednesday = new TimeRecord("8:15 AM","3:45 PM","60");
        TimeRecord Thursday = new TimeRecord("7:15 AM","3:45 PM","30");
        TimeRecord Friday = new TimeRecord("9:15 AM","5:45 PM","30");

        System.out.println("Monday.startingTime = " + Monday.startingTime);
        System.out.println("Monday.endingTime = " + Monday.endingTime);
        System.out.println("Monday.breakDeduction = " + Monday.breakDeduction);
//
//        System.out.println("Monday.calculateHours() = " + Monday.calculateHours());
//        System.out.println("Tuesday.calculateHours() = " + Tuesday.calculateHours());
//        System.out.println("Wednesday.calculateHours() = " + Wednesday.calculateHours());
//        System.out.println("Thursday.calculateHours() = " + Thursday.calculateHours());
//        System.out.println("Friday.calculateHours() = " + Friday.calculateHours());

//        BigDecimal total = new BigDecimal(Monday.calculateHours() + Tuesday.calculateHours() + Wednesday.calculateHours() + Thursday.calculateHours() + Friday.calculateHours() );
//        total = total.setScale(2, RoundingMode.CEILING);
//        System.out.println("total = " + total);
//;

    }
}
