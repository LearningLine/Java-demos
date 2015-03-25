package com.develop;

import static java.time.format.TextStyle.*;
import static java.lang.System.*;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Locale;

public class DateTimeApp {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            out.println(day.getDisplayName(FULL, Locale.FRANCE));
        }
        
        for (Month month : Month.values()) {
            out.println(month.getDisplayName(FULL, Locale.US));
        }

    }

}
