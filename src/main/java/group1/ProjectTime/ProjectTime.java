package group1.ProjectTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.Period;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;
    private int months;
    private long totalMinutes;

    SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        updateHours();
    }

    public void setStartTime(String start) {
        this.startTime = start;
        updateHours();
    }
    public void setEndTime(String end) {
        this.endTime = end;
        updateHours();
    }

    public String getStartTime() {
        return startTime;
    }
    public String getEndTime() {
        return endTime;
    }

    public String getHoursLogged() {
        if (hoursLogged < 0) {
            return "-1";
        }
        if (totalMinutes < 120) {
            return totalMinutes + " m";
        }
        long hours = totalMinutes/60;
        if (hoursLogged < 120) {
            return hours + " h";
        }
        if (months < 4) {
            return hours/24 + " d";
        }
        return months + " mo";
    }

    public void updateHours() {
        try {
            Date start = FORMAT.parse(startTime);
            Date end = FORMAT.parse(endTime);
            LocalDate startLong = LocalDate.parse(startTime, formatter);
            LocalDate endLong = LocalDate.parse(endTime, formatter);

            long milliSeconds = end.getTime() - start.getTime();
            Period period = Period.between(startLong, endLong);
            months = period.getMonths();
            totalMinutes = milliSeconds/60000;
            hoursLogged = totalMinutes/60f;
        }
        catch (ParseException e) {
            hoursLogged = -1;
        }
    }
}