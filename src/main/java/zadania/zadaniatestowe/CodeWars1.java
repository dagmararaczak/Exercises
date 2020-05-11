package zadania.zadaniatestowe;

import java.util.ArrayList;
import java.util.List;


public class CodeWars1 {

    public static void main(String[] args) {

        int a = 46288;
        int b = 3;




        char[] numbers = Integer.toString(a).toCharArray();


        List<Integer> powNumber = new ArrayList<>();



        for (char number : numbers) {

            Integer pow = (int) Math.pow(Character.getNumericValue(number), b);

            powNumber.add(pow);

            b++;

        }

        int result = 0;
        for (Integer integer : powNumber) {

            result+=integer;


        }



        System.out.println(result);

        int totalresult = result%a == 0 ? result/a : -1;

        System.out.println(totalresult);
    }

}
