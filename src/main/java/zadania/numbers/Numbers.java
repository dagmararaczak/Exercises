package zadania.numbers;

public class Numbers {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Numbers(String firstNumber, String secondNumber, String thirdNumber) {
       this.firstNumber = Integer.parseInt(firstNumber);
       this.secondNumber = Integer.parseInt(secondNumber);
       this.thirdNumber = Integer.parseInt(thirdNumber);
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public boolean getGoingUpNumbers(){
        if(firstNumber>secondNumber | secondNumber>thirdNumber){
            return false;
        }

        return true;
    }

    public  int getNWDfor3numbers(){


       return getNWD(getNWD(firstNumber,secondNumber),thirdNumber);

    }



    private  int getNWD(int first, int second){


        if(second == 0){
            return first;
        }else {
            return getNWD(second,first%second);
        }


    }

    public int getTotal(){

        return getTotal( String.valueOf(firstNumber)) + getTotal(String.valueOf(secondNumber)) + getTotal(String.valueOf(thirdNumber));


    }



    private int getTotal(String number) {
        char[] chars = number.toCharArray();

        int sum = 0;

        for (int i = 0 ; i< number.toCharArray().length;i++){
           sum+= Character.getNumericValue(chars[i]);
        }

        return sum;
    }
}
