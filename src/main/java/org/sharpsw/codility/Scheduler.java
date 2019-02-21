package org.sharpsw.codility;

import java.util.Arrays;
import java.util.List;

public class Scheduler {
    private static final int MINUTES_POSITION_IN_DAY = 1441;

    public int solution(String S) {
        int[] schedule = new int[10087];
        List<String> entries = splitSchedule(S);

        for(String entry: entries) {
            String[] meeting = splitMeetingInfo(entry);
            Integer startPosition = convertTimeAndDateToPositionInSchedule(meeting[1], meeting[0]);
            Integer endPosition = convertTimeAndDateToPositionInSchedule(meeting[2], meeting[0]);

            markScheduleWithMeeting(startPosition, endPosition, schedule);
        }

        String scheduleInStr = convertScheduleToString(schedule);
        return searchLongestTimeSlot(scheduleInStr);
    }

    private Integer searchLongestTimeSlot(String fullSchedule) {
        int longestTimeSlot = 0;

        int search = 0;
        while(search > -1) {
            search = fullSchedule.indexOf("0", search);

            if(search > -1) {
                int currentInterval;

                int finalPos = fullSchedule.indexOf("1", search + 1);
                if(finalPos == -1) {
                    currentInterval = fullSchedule.length() - search;
                } else {
                    currentInterval = finalPos - search;
                }

                if(currentInterval > longestTimeSlot) {
                    longestTimeSlot = currentInterval;
                }
                search = finalPos;
            }
        }

        return longestTimeSlot;
    }

    private String convertScheduleToString(int[] schedule) {
        StringBuilder buffer = new StringBuilder();
        int position = 0;
        while(position < schedule.length) {
            buffer.append(schedule[position]);
            position++;
        }
        return buffer.toString();
    }

    private void markScheduleWithMeeting(Integer start, Integer end, int[] schedule) {
        Integer index = start;
        while(index <= end) {
            schedule[index] = 1;
            index++;
        }
    }

    private String[] splitMeetingInfo(String line) {
        return line.split("-|\\s* ");
    }

    private List<String> splitSchedule(String input) {
        String[] items = input.split("\\r?\\n");
        return Arrays.asList(items);
    }

    private Integer convertTimeAndDateToPositionInSchedule(String time, String dayWeek) {
        Integer minutePosition = convertTimeToMinutes(time);
        return shiftMinutePositionAccordingDayWeek(minutePosition, dayWeek);
    }

    private Integer convertTimeToMinutes(String time) {
        String[] tokens = time.split(":");
        Integer hours = Integer.parseInt(tokens[0]) * 60;
        Integer minutes = Integer.parseInt(tokens[1]);

        return hours + minutes;
    }

    private Integer shiftMinutePositionAccordingDayWeek(Integer minutes, String dayWeek) {
        switch (dayWeek) {
            case "Tue":
                return minutes + MINUTES_POSITION_IN_DAY;
            case "Wed":
                return minutes + (MINUTES_POSITION_IN_DAY * 2);
            case "Thu":
                return minutes + (MINUTES_POSITION_IN_DAY * 3);
            case "Fri":
                return minutes + (MINUTES_POSITION_IN_DAY * 4);
            case "Sat":
                return minutes + (MINUTES_POSITION_IN_DAY * 5);
            case "Sun":
                return minutes + (MINUTES_POSITION_IN_DAY * 6);
            default:
                return minutes;
        }
    }
}
