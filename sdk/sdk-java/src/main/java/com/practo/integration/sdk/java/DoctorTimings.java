package com.practo.integration.sdk.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DoctorTimings {

    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    private Map<DayOfWeek, TreeMap<Integer, Integer>> weeklyDoctorTimings;

    public DoctorTimings() {
        weeklyDoctorTimings = new HashMap<DayOfWeek, TreeMap<Integer, Integer>>();
    }

    // This method adds a given continuous range of practice timing for a given day of week. The range
    // is represented by start time and end time in minutes of day, i.e. (0, 1440). The method validates
    // that the input range doesn't overlap with any existing practice for the same day.
    public DoctorTimings addDoctorTimings(DayOfWeek day, int startTimeInMin, int endTimeInMin) {
        TreeMap<Integer, Integer> dayTimings = weeklyDoctorTimings.get(day);
        if (null == dayTimings) {
            dayTimings = new TreeMap<Integer, Integer>();
            weeklyDoctorTimings.put(day, dayTimings);
        }

        Entry<Integer, Integer> floorEntry = dayTimings.floorEntry(startTimeInMin);
        Entry<Integer, Integer> ceilingEntry = dayTimings.ceilingEntry(startTimeInMin);

        // validate that the floor entry doesn't overlap with the input entry
        if (floorEntry != null) {
            if (floorEntry.getValue() > startTimeInMin) {
                throw new IllegalArgumentException("An overlapping timing entry already exists: ["
                        + floorEntry.getKey() + "," + floorEntry.getValue() + "]");
            }
        }

        // validate that the ceiling entry doesn't overlap with the input entry
        if (ceilingEntry != null) {
            if (endTimeInMin > ceilingEntry.getKey()) {
                throw new IllegalArgumentException("An overlapping timing entry already exists: ["
                        + ceilingEntry.getKey() + "," + ceilingEntry.getValue() + "]");
            }
        }

        dayTimings.put(startTimeInMin, endTimeInMin);
        return this;
    }
}
