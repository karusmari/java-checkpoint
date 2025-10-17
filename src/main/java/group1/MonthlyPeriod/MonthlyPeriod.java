package group1.MonthlyPeriod;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);

            Period period = Period.between(start, end);

            int months = Math.abs(period.getMonths());
            int years = Math.abs(period.getYears());

            if (years == 0 && months == 0) {
                return "0 months";
            } else if (years == 0) {
                return months + (months == 1 ? " month" : " months");
            } else if (months == 0) {
                return years + (years == 1 ? " year" : " years");
            } else {
                return years + (years == 1 ? " year" : " years")
                        + " and " +
                        months + (months == 1 ? " month" : " months");
            }
        }catch (DateTimeParseException e) {
            return "Error";
        }
    }
}