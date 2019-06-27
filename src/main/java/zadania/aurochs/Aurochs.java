package zadania.aurochs;


public class Aurochs {

    private int buffaloAmount;
    private int hayKilogramsReserve;
    private int acornsKilogramsReserve;
    private int feedingDayAcorns = 0;
    private int amountFeedingHay = 0;
    private int amountFeedingAcorns = 0;


    public Aurochs(int buffaloAmount, int hayKilogramsReserve, int acornsKilogramsReserve){
        this.buffaloAmount = buffaloAmount;
        this.hayKilogramsReserve = hayKilogramsReserve;
        this.acornsKilogramsReserve = acornsKilogramsReserve;
    }

    public void feed(int dayOfFeeding) throws NotEnoughFoodException {
        if (hayKilogramsReserve >= 50000) {
            feedBuffaloWithHay();
            amountFeedingHay++;
        } else {
            if(feedingDayAcorns == 0){
                feedingDayAcorns = dayOfFeeding;
            }
            feedBuffaloWithAcorn();
            amountFeedingAcorns++;
        }
    }

    private void feedBuffaloWithHay() throws NotEnoughFoodException {
        if(hayKilogramsReserve < 0 || hayKilogramsReserve - buffaloAmount * 40 < 0)
            throw new NotEnoughFoodException();

        hayKilogramsReserve = hayKilogramsReserve - buffaloAmount * 40;
    }

    private void feedBuffaloWithAcorn() throws NotEnoughFoodException {
        if(acornsKilogramsReserve < 0 || acornsKilogramsReserve - buffaloAmount * 20 < 0)
            throw new NotEnoughFoodException();

        acornsKilogramsReserve = acornsKilogramsReserve - buffaloAmount * 20;
    }

    public void hayDelivery(){
        hayKilogramsReserve += 15000;
    }

    public void acornDelivery(){
        acornsKilogramsReserve += 4000;
    }

    public int getFeedingDayAcorns(){
        return feedingDayAcorns;
    }

    public int getAmountFeedingHay() {
        return amountFeedingHay;
    }

    public int getAmountFeedingAcorns() {
        return amountFeedingAcorns;
    }

    public void printReport(int day, int month){
        System.out.println(day+"."+month + ":\t" + hayKilogramsReserve + "\t" + acornsKilogramsReserve);
    }
}
