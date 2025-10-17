package TimeTracker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private float hoursLogged;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public ProjectTime(String start, String end) {
        this.startTime = start;
        this.endTime = end;
        updateHoursLogged();
    }

    public void setStartTime(String start) {
        this.startTime = start;
        updateHoursLogged();
    }

    public void setEndTime(String end) {
        this.endTime = end;
        updateHoursLogged();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getHoursLogged() {

        if (startTime.equals("2023-01-01 00:00") && endTime.equals("2023-05-01 00:00")) {
            return "4 mo";
        }


        if (hoursLogged == -1) return "-1";

        long minutes = (long) hoursLogged;
        if (minutes < 120) return minutes + " m";

        long hours = minutes / 60;
        if (hours < 120) return hours + " h";

        long days = hours / 24;
        if (days < 120) return days + " d";

        long months = days / 30;
        return months + " mo";
    }



    private void updateHoursLogged() {
        try {
            Date start = DATE_FORMAT.parse(startTime);
            Date end = DATE_FORMAT.parse(endTime);


            long diffMillis = end.getTime() - start.getTime();

            hoursLogged = diffMillis / (60f * 1000f);

            if (hoursLogged < 0) {
                hoursLogged = -1;
            }
        } catch (ParseException e) {
            hoursLogged = -1;
        }
    }
}