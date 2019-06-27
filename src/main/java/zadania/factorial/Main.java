package zadania.factorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/dagmar/Desktop/SDA/silnia_przyklad.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<Integer> numberslist = new ArrayList<Integer>();

        String line;

        while ((line = bufferedReader.readLine()) != null) {

            numberslist.add(Integer.parseInt(line));
        }

        bufferedReader.close();

        PowerUtils powerUtils = new PowerUtils();

        int counterPower3 = 0;

        for (Integer numb : numberslist) {
            if (powerUtils.isNUmberPowerOfThree(numb)) {
                counterPower3++;
            }

        }

        for (Integer number : numberslist) {


            if (powerUtils.validateFactorial(number)) {

                System.out.println(number);
            }


        }

        System.out.println("Ilosc liczb ktora jest potega 3 to : " + counterPower3);


    }


    public static int factorial(int n) {

        if (n > 1) {

            return factorial(n - 1) * n;
        }


        return 1;

    }


}
