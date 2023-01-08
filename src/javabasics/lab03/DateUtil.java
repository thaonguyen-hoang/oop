package javabasics.lab03;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(2012, 2, 14));
        compare(2012, 2, 14);
    }

    public static String[] strMonths
            = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String[] strDays
            = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public static int[] daysInMonths
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1];
        if (isLeapYear(year)) {
            monthDays += 1;
        }
        return day >= 1 && day <= monthDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int sum = 0;
        // Add to the number obtained from the "century" table
        if ((year / 100) % 4 == 1) {
            sum += 4;
        } else if ((year / 100) % 4 == 2) {
            sum += 2;
        } else if ((year / 100) % 4 == 3) {
            sum += 0;
        } else {
            sum += 6;
        }
        // Add to the last two digit of the year
        sum += (year % 100);
        // Add to the last two digit of the year divide by 4,
        // truncate the fractional part
        sum += ((year % 100) / 4);
        // Add to the number obtained from the month table
        final int[] NON_LEAP_YEAR_NUMBERS = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        final int[] LEAP_YEAR_NUMBERS = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        if (isLeapYear(year)) {
            sum += LEAP_YEAR_NUMBERS[month - 1];
        } else {
            sum += NON_LEAP_YEAR_NUMBERS[month - 1];
        }
        // Add to the day
        sum += day;
        return sum % 7;
    }

    public static String toString(int year, int month, int day) {
        return strDays[getDayOfWeek(year, month, day)] + " " + day
               + " " + strMonths[month - 1] + " " + year;
    }

    public static void compare(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("It is " + strDays[dayNumber - 1]);
    }
}
