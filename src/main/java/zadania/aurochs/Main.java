package zadania.aurochs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import static java.util.Calendar.*;


public class Main {
    private static int hayDeliveries = 0;
    private static int acornDeliveries = 0;

    public static void main(String[] args) throws NotEnoughFoodException {
        Aurochs ranch =
                new Aurochs(90, 100000, 5000);
        try {
            makeSimulation(ranch);
        }
        catch (NotEnoughFoodException ignored){ }

        //3.1
        System.out.println("Liczba dostaw siana: " + hayDeliveries );
        System.out.println("Liczba dostaw żołędzi: " + acornDeliveries);

        //3.2
        System.out.println("Dzień pierwszego karmienia żołędziami: "
                + ranch.getFeedingDayAcorns());

        //3.3
        System.out.println("W sumie nakarmiono żołędziami: "
                + ranch.getAmountFeedingAcorns());
        System.out.println("W sumie nakarmiono sianem: "
                + ranch.getAmountFeedingHay());


        //3.4
        for (int i = 90; i < 110; i++) {
            try {
                ranch = new Aurochs(i, 100000, 5000);
                makeSimulation(ranch);
            }
            catch (NotEnoughFoodException e){
                System.out.println("Max. liczba żubrów: " + (i-1));
                throw new NotEnoughFoodException();
            }
        }
    }

    private static void makeSimulation(Aurochs ranch) throws NotEnoughFoodException {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2012, Calendar.DECEMBER, 1);


        int dayCounter = 0;

        while (!(calendar.get(Calendar.DAY_OF_MONTH) == 1
                && calendar.get(Calendar.MONTH) == MARCH)){
            dayCounter++;

            if(
                    (calendar.get(Calendar.DAY_OF_MONTH) == 31 &&
                            calendar.get(Calendar.MONTH) == DECEMBER) ||
                            (calendar.get(Calendar.DAY_OF_MONTH) == 31 &&
                                    calendar.get(Calendar.MONTH) == JANUARY) ||
                            (calendar.get(Calendar.DAY_OF_MONTH) == 28 &&
                                    calendar.get(Calendar.MONTH) == FEBRUARY)
            ){
                ranch.printReport(calendar.get(Calendar.DAY_OF_MONTH),
                        calendar.get(Calendar.MONTH)+1);
            }


            ranch.feed(dayCounter);

            if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                ranch.hayDelivery();
                hayDeliveries++;
            }
            if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY){
                ranch.acornDelivery();
                acornDeliveries++;
            }

            calendar.add(DATE, 1);
        }
    }

}
