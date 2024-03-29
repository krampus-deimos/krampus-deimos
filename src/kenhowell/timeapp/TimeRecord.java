package kenhowell.timeapp;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TimeRecord {


    String startingTime;
    String endingTime;
    String breakDeduction;
    Double clockinMinutes;
    Double clockoutMinutes;


    public TimeRecord (String start, String end, String breaktime){
        DateFormat inputDF = new SimpleDateFormat("hh:mm aa");
        DateFormat output24DF = new SimpleDateFormat("HH:mm");
        Date date;
        String output = null;
        try{
            date = inputDF.parse(start);
            output = output24DF.format(date);
        }
        catch (ParseException pe){
            pe.printStackTrace();
        }
        String[] splitStartTime = output.split(":");
        this.startingTime = splitStartTime[0];
        this.clockinMinutes = Double.valueOf(splitStartTime[1]);
        try {
            date = inputDF.parse(end);
            output = output24DF.format(date);
        } catch (ParseException pe){
            pe.printStackTrace();
        }
        String[] splitEndTime = output.split(":");
        this.endingTime = splitEndTime[0];
        this.clockoutMinutes = Double.valueOf(splitEndTime[1]);
        this.breakDeduction = breaktime;
    }

     public double calculateHours(){
        double clockIn = Double.parseDouble(this.startingTime);
        double clockOut = Double.parseDouble(this.endingTime);
        double totalBreak = Double.parseDouble(this.breakDeduction) / 60;
        double bonusMins = 0;
        double clockInMins = this.clockinMinutes;
        double clockOutMins = this.clockoutMinutes;

//        second/third shift (CLOCKIN TIME PM CLOCKOUTTIME AM, ADD 24HRS TO CLOCKOUT TIME [e.g. 9PM clockin = 21, 5AM clockout = 5 becomes (24+5) - 21)
        if (clockOut < clockIn){
            clockOut += 24;
        }
//        24 HR SHIFT, 1440 MINUTES (24HR) ADDED TO BONUSMINS
        if (clockOut == clockIn)
        {
            bonusMins += 1440;
        }
//        dealing with spare minutes from clock ins/clock outs and dumping into bonusMins [a. 9:45 to 5:15, 45 > 15 => 30; b. 9:15 to 5:45, 15 < 45, (15+60) - 45 => 30]
        if (clockInMins > clockOutMins){
            bonusMins += clockInMins - clockOutMins;
        }
        if (clockInMins < clockOutMins){
           bonusMins += (clockInMins+60) - clockOutMins;
        }
//        final calc to hrs
        bonusMins /= 60;

        return ((clockOut - clockIn) - totalBreak + bonusMins);
    };

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

     public static void printRecords(ArrayList allRecords){
        TimeRecord bucketTime;
        int bucketInt = 0;

         System.out.printf("Calculating records. . %n%n");
         for (int i = 0; i < allRecords.size(); i++){
            bucketTime = (TimeRecord) allRecords.get(i);
            bucketInt += bucketTime.calculateHours();
            System.out.printf("Record %d:: %s hours.%n", i+1, bucketTime.calculateHours());
        }
         BigDecimal total = new BigDecimal(bucketInt);
         total = total.setScale(2, RoundingMode.CEILING);
         System.out.println("Total hours for records = " + total);

     }

    public static void main(String[] args) {
        String testme = "not a number";

        ArrayList<TimeRecord> testAL = new ArrayList<>();

        TimeRecord Monday = new TimeRecord("9:15 AM","9:15 PM","30");
        TimeRecord Tuesday = new TimeRecord("3:15 PM","12:15 AM","30");
        TimeRecord Wednesday = new TimeRecord("8:15 AM","8:15 AM","60");
        TimeRecord Thursday = new TimeRecord("7:15 AM","3:45 PM","30");
        TimeRecord Friday = new TimeRecord("9:15 PM","5:45 AM","30");

        testAL.add(Monday);
        testAL.add(Tuesday);
        testAL.add(Wednesday);
        testAL.add(Thursday);
        testAL.add(Friday);


printRecords(testAL);

//
//        BigDecimal total = new BigDecimal(Monday.calculateHours() + Tuesday.calculateHours() + Wednesday.calculateHours() + Thursday.calculateHours() + Friday.calculateHours() );
//        total = total.setScale(2, RoundingMode.CEILING);
//        System.out.println("total = " + total);
//



    }
}
