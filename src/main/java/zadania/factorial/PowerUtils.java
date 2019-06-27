package zadania.factorial;

import java.util.ArrayList;
import java.util.List;

public class PowerUtils {
    private ArrayList<Integer> powersOfThree = new ArrayList<>();


    public PowerUtils() {
        generatePowerOfThree();
    }

    private void generatePowerOfThree(){
        int pow = 1;

        for(int i = 1; i< 11; i++ ){

            powersOfThree.add((int) Math.pow(3, i));

        }
    }

    public boolean isNUmberPowerOfThree(Integer number){

        return powersOfThree.contains(number);
    }

    public boolean validateFactorial(int n){

        String numberAsString = String.valueOf(n);

        char[] numbersAsChars = numberAsString.toCharArray();

        int result = 0;
        for (char c : numbersAsChars) {

            result+= factorial(Character.getNumericValue(c));


        }

        if(result == n){
            return true;
        }

        return false;
    }

    public  int factorial(int n){

        if(n>1){

            return factorial(n-1)*n;
        }


        return 1;

    }


    public void validateNWD(List<Integer> numbers){

        int firstNumber = -1;
        int maxFirstNumber = -1;
        int length = -1;
        int ourNWD = -1;
        int maxNWD = -1;
        int tempNWD = -1;
        int maxLength = -1;

        for (int i = 0; i < numbers.size()-1; i++) {
            firstNumber = numbers.get(i);
            ourNWD = getNWD(numbers.get(i), numbers.get(i+1));
            length = 2;
            for (int j = i + 2; j < numbers.size(); j++){
                tempNWD = getNWD(numbers.get(j), ourNWD);

                if(tempNWD < 2){
                    if(maxLength < length) {
                        maxLength = length;
                        maxFirstNumber = firstNumber;
                        maxNWD = ourNWD;
                    }
                    break;
                }
                ourNWD = tempNWD;
                length++;
            }

        }
        System.out.println("MAX LENGTH " + maxLength + " FIRST: "
                + maxFirstNumber + " MAX NWD: " + maxNWD);

    }

    private int getNWD(int firstnumber, int secondnumber){

        if(firstnumber == 0){
            return firstnumber;
        }else {
            return getNWD(secondnumber%firstnumber,firstnumber);
        }


    }
}
