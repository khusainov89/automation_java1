package Enums;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static Scanner scanner = new Scanner(System.in);
    static String user_month = null;
    static boolean monthExist = false;
    static String userSeason = null;
    static int userNumDays = 0;
    public static ArrayList<String> evenMonths = new ArrayList<String>();
    public static ArrayList<String> oddMonths = new ArrayList<String>();
    public static void getUserMonth(){
        user_month = scanner.nextLine();
        for (Month month: Month.values()) {
            if (month.name().equalsIgnoreCase(user_month)){
                monthExist = true;
                userSeason = String.valueOf(month.getSeason());
                userNumDays = month.getNumberOfDays();
            }
        }
        if (!monthExist){
            logger.info("There is no such month");
        }
    }
    public static void getUserSeason(){
        for (Month month: Month.values()) {
            if (month.getSeason().toString().equalsIgnoreCase(userSeason)) {
                logger.info(month);
            }
        }
    }
    public static void getUsersNumDays(){
        for (Month month: Month.values())
            if (month.getNumberOfDays() == userNumDays) {
                logger.info(month);
            }
    }
    public static void evenOrOddDays (){
        for (Month month: Month.values()) {
            if (month.getNumberOfDays() % 2 == 0) {
                evenMonths.add(String.valueOf(month));
            } else if (month.getNumberOfDays() % 2 == 1) {
                oddMonths.add(String.valueOf(month));
            }
        }
    }
    public static void isUserMonthDaysEven (){
        if (userNumDays % 2 ==0){
            logger.info("Your month has an even number of days");
        }
        logger.info("Your month has an odd number of days");
    }
    public static void main(String[] args) {

        logger.info(Arrays.toString(Month.values()));
        logger.info("Enter month");
        getUserMonth();
        logger.info("This season's list of months:");
        getUserSeason();
        logger.info("List of months with the same number of days:");
        getUsersNumDays();
        evenOrOddDays();
        logger.info("Even months: " + evenMonths);
        logger.info("Odd months: " + oddMonths);
        isUserMonthDaysEven();
    }

}
