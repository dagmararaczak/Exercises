package zadania.dates;



import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class MainDate {
    public static void main(String[] args) {
        LocalDate begin =  LocalDate.of(2019,02,15);
        LocalDate end =  LocalDate.of(2019,05,15);

        Period period = Period.between(begin,end);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        long daysTotal = ChronoUnit.DAYS.between(begin,end);
        System.out.println(days);
        System.out.println(months);
        System.out.println(daysTotal);




    }
}

