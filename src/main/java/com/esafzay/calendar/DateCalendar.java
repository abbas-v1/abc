package com.esafzay.calendar;

import java.time.LocalDate;

public class DateCalendar {

    private static String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int offsetFromReferenceDay = 6;

    public static void main(String[] args) {
        compare(2022, 12, 8);
        compare(2022, 11, 8);
        compare(2022, 1, 8);
        compare(1919, 12, 8);
        compare(1717, 12, 8);
        compare(506, 2, 8);
        compare(5, 1, 1);
    }

    private static String getDayOfTheWeek(int year, int month, int day) {

        int days = day;

        for (int m = 0; m < month - 1; m++) {
            days = days + daysInMonth[m];
        }

        days = days + year * 365;
        int leapYears = getLeapYears(year);
        days = days + leapYears;

        return daysOfWeek[(days + offsetFromReferenceDay) % 7];
    }

    private static int getLeapYears(int year) {
        int noOf400 = year / 400;
        int noOf100 = year % 400 / 100;
        int noOfLeapYearsInLastCentury = year % 400 % 100 / 4;
        return noOf400 * 97 + noOf100 * 24 + noOfLeapYearsInLastCentury;
    }

    private static void compare(int year, int month, int day) {
        System.out.println(getDayOfTheWeek(year, month, day)
                + " = " +
                getDayOfTheWeekSystem(year, month, day));
    }

    private static String getDayOfTheWeekSystem(int year, int month, int day) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
