package kenhowell.timeapp;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;


public class TimeClockApp {
    static Scanner sc = new Scanner(System.in);
    static boolean userEngageMain = false;
    static ArrayList<TimeRecord> workingRecord = new ArrayList<>();
    private static String clockedIn;
    private static String clockedOut;
    private static String breakTime;
    private static String confirm;

    public static void main(String[] args) {
        userEngageMain = true;

        System.out.printf("Welcome to D-MOS Time Management System.%n");
        while (userEngageMain){

            System.out.printf("Would you like to:%nA.) Input time for calculation.%nB.) Run calculation on accumulated days.%nC.) Exit our system.%n");
            String userChoice = sc.nextLine();
            userChoice = userChoice.toLowerCase();
            while (userChoice.length() > 1 || TimeRecord.isNumeric(userChoice)){
                System.out.println("Error! Invalid selection, please select a valid choice.");
                userChoice = sc.nextLine();
            }


            switch (userChoice){
                case "a":
                    boolean userCompleteCaseA = false;
                    while (!userCompleteCaseA) {
                        System.out.printf("Please input the time you clocked in: (HH:MM AM) or (HH:MM PM) %n");
                        clockedIn = sc.nextLine();
                        System.out.printf("Registered %s as start time, please input your clockout time: (HH:MM AM) or (HH:MM PM)%n", clockedIn);
                        clockedOut = sc.nextLine();
                        System.out.printf("Registered %s as end time, please input your break time in minutes:%n", clockedOut);
                        breakTime = sc.nextLine();
                        System.out.printf("%s registered as the amount of time on break.%n%nTo confirm: you clocked in at %s, clocked out at %s, and were on break for %s minutes. Y/N?%n", breakTime, clockedIn, clockedOut, breakTime);
                        confirm = sc.nextLine();
                        if ((confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("yes"))){
                            TimeRecord created = new TimeRecord(clockedIn, clockedOut, breakTime);
                            workingRecord.add(created);
                            System.out.printf("Record written!%nYou have %d record(s) so far.%n%n", workingRecord.size());
                            userCompleteCaseA = true;

                        } else {
                            System.out.printf("Understood. Returning to beginning of menu.%n");
                        }
                    }


                case "b":


                case "c":

            }
        }



    }


}
