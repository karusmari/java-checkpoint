package group1.AgeFinder;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFinder {
    public int calculateAge(String date) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthday = LocalDate.parse(date, formatter);
            LocalDate today = LocalDate.parse(07-09-2024, formatter);

            Period period = Period.between(birthday, today);
            int years = period.getYears();
            if (years < 0) {
                return -1;
            }
        }
    }
}

//antud formaat edasi anda
//parse-in selle antud kuupäevale
//sünnipäeva muutuja
//tänase päeva muutuja
//arvutada periood sünnikuupäevast tänaseni
//tagastada aastad
//kui on negatiivne, siis tagasta -1
//kui on error, siis tagasta -1
