package group2.Factorial;

public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}


// Alamklass factorial klassist, mis arvutab faktoriaali iteratiivselt
// Override meetod calculate, mis võtab täisarvu n ja tagastab pika arvu
// Kui n on 0 või 1, siis tagastan 1, sest 0! ja 1! on 1
// Määran muutuja result väärtuseks 1, sest faktoriaali korrutamisel on neutraalne element 1
// Teen tsükli, mis algab n-st ja lõpeb 1-ni, iga sammuga vähendades i väärtust 1 võrra
// Tsükli sees korrutan result muutujat i-ga
// Pärast tsüklit tagastan result muutuja, mis sisaldab faktoriaali väärtust