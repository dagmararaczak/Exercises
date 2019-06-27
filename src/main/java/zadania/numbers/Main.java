package zadania.numbers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/dagmar/Desktop/SDA/numbers.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;


        Numbers number;

        int counter = 0;
        int NWDcounter = 0;
        int sumCounter = 0;
        int maxSum = 0;
        int maxAmount = 0;
        while ((line = bufferedReader.readLine()) != null) {

            String[] numbers = line.split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];
            String thirdNumber = numbers[2];

            number = new Numbers(firstNumber,secondNumber,thirdNumber);

            NWDcounter+=number.getNWDfor3numbers();



            if ( number.getGoingUpNumbers()){

                counter++;
            }

            if(number.getTotal() == 35){
                sumCounter++;
            }

            if(number.getTotal()>maxSum){
                maxSum = number.getTotal();
                maxAmount = 1;
            }else if (maxSum == number.getTotal()){
                maxAmount++;
            }





        }

        bufferedReader.close();

        System.out.println("Ilosc liczb ustawionych od najmniejszego do najwiekszego : " + counter);
        System.out.println("Suma NWD: " + NWDcounter);
        System.out.println("Suma wszystkich wierszy = 35: " + sumCounter);
        System.out.println("Maksymalna suma: " + maxSum);
        System.out.println("Ilosc wierszy w ktorych wystepuje maksymalna suma: " + maxAmount);




    }

}
