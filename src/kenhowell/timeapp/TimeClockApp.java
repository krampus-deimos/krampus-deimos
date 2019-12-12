package kenhowell.timeapp;
import java.util.Scanner;


public class TimeClockApp {
    static Scanner sc = new Scanner(System.in);
    static boolean userEngage = false;

    public static void main(String[] args) {
        System.out.printf("Welcome to D-MOS Time Management System.%n");
        System.out.printf("Would you like to:%nA.) Input weeks time for calculation.%nB.) Review input data for accuracy.%nC.) Exit our system.%n");
        String userChoice = sc.nextLine();
        userChoice = userChoice.toLowerCase();
        if (userChoice.length() > 1 || TimeRecord.isNumeric(userChoice)){
            System.out.println("Error! Invalid selection, please select a valid choice.");

        } else {
            userEngage = true;
        }

        while (userEngage){

        }



    }
}
