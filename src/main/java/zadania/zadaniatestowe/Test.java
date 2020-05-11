package zadania.zadaniatestowe;

public class Test {
    public static void main(String[] args) {


        System.out.println(getNumber(9119));
        getNumber(9119);


    }

    private static int getNumber(int numberToProcess){

        String stringNumber = Integer.toString(numberToProcess);

        String result = "";

        char[] singleNumbers = stringNumber.toCharArray();

        for (char num : singleNumbers) {

            int numberToPow = Character.getNumericValue(num);
            int squareNumber = (int)Math.pow(numberToPow,2);
            String squareNumberString = Integer.toString(squareNumber);
            result+=squareNumberString;

        }

        return Integer.parseInt(result);
    }
}
