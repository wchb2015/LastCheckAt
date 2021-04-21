package com.lastcheckat.utils;

import java.util.concurrent.TimeUnit;

public class TimeUtil {
    public static String diff(long currentTime, long previousTime)
    {

        long diff = currentTime - previousTime;
        final long day = TimeUnit.MILLISECONDS.toDays(diff);

        final long hours = TimeUnit.MILLISECONDS.toHours(diff)
                - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(diff));

        final long minutes = TimeUnit.MILLISECONDS.toMinutes(diff)
                - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diff));
        return String.format("%d Days %d Hours %d Minutes", day, hours, minutes);
    }

}
