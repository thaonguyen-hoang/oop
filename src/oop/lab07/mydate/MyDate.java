package oop.lab07.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

    public static final int[] DAYS_IN_MONTH
            = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int dayMax = DAYS_IN_MONTH[month - 1];
        if (isLeapYear(year) && month == 2) {
            dayMax++;
        }
        return day >= 1 && day <= dayMax;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int yearNumber = lastTwoDigitsOfYear / 4;

        final int[] NON_LEAP_YEAR_NUMBERS = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        final int[] LEAP_YEAR_NUMBERS = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int monthNumber;
        if (isLeapYear(year)) {
            monthNumber = LEAP_YEAR_NUMBERS[month - 1];
        } else {
            monthNumber = NON_LEAP_YEAR_NUMBERS[month - 1];
        }
        return (centuryNumber + lastTwoDigitsOfYear
                + yearNumber + monthNumber + day) % 7;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public void setDay(int day) {
        int dayMax = DAYS_IN_MONTH[month - 1];
        if (isLeapYear(year) && month == 2) {
            dayMax += 1;
        }
        if (day < 1 || day > dayMax) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        if (!isValidDate(year, month, day)) {
            return "";
        }
        return String.format("%s %d %s %04d",
                DAYS[getDayOfWeek(year, month, day)],
                day, MONTHS[this.month - 1], year);
    }

    public MyDate nextDay() {
        int dayMax = DAYS_IN_MONTH[month - 1];
        if (isLeapYear(year) && month == 2) {
            dayMax++;
        }
        if (day == dayMax) {
            nextMonth();
            day = 1;
        } else {
            day++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            nextYear();
        } else {
            month++;
        }
        int dayMaxNextMonth = DAYS_IN_MONTH[month];
        if (day > dayMaxNextMonth) {
            day = dayMaxNextMonth;
        }
        return this;
    }

    public MyDate nextYear() {
        if (year == 9999) {
            throw new IllegalArgumentException("Year out of range!");
        }
        year++;
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day == 1) {
            if (month == 1) {
                day = DAYS_IN_MONTH[11];
            } else {
                day = DAYS_IN_MONTH[month - 2];
            }
            previousMonth();
        } else {
            day--;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            previousYear();
        } else {
            month--;
        }
        int dayMaxLastMonth = DAYS_IN_MONTH[month - 2];
        if (day > dayMaxLastMonth) {
            day = dayMaxLastMonth;
        }
        return this;
    }

    public MyDate previousYear() {
        if (year == 1) {
            throw new IllegalArgumentException("Year out of range!");
        }
        year--;
        if (isLeapYear(year) && month == 2 && day == 29) {
            day = 28;
        }
        return this;
    }
}
