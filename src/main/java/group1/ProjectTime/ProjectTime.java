package group1.ProjectTime;

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
        if (hoursLogged < 0) return "-1";

        long totalMinutes = Math.round(hoursLogged * 60);

        if (totalMinutes < 120) return totalMinutes + " m";          // < 2h → minutid
        if (hoursLogged < 120) return Math.round(hoursLogged) + " h"; // < 120h → tunnid
        if (hoursLogged / 24 < 120) return Math.round(hoursLogged / 24) + " d"; // < 120 päeva → päevad
        return Math.round(hoursLogged / 24 / 30f) + " mo";           // üle 120 päeva → kuud
    }

    private void updateHours() {
        try {
            Date startDate = DATE_FORMAT.parse(startTime);
            Date endDate = DATE_FORMAT.parse(endTime);

            long diffMillis = endDate.getTime() - startDate.getTime();
            if (diffMillis < 0) {
                hoursLogged = -1; // negatiivne vahe → viga
            } else {
                hoursLogged = diffMillis / 1000f / 3600f; // millisekunditest tundideks
            }
        } catch (ParseException e) {
            hoursLogged = -1; // vigane kuupäev
        }
    }
}
