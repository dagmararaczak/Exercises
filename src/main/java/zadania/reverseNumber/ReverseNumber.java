package zadania.reverseNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 12345;

     /*  StringBuilder stringBuilder = new StringBuilder();

       stringBuilder.append(number);
        String reverseNumber = stringBuilder.reverse().toString();

        int result = Integer.parseInt(reverseNumber);

        System.out.println(result);
*/
       List<Integer> reverseNumbers = new ArrayList<>();

        for (int i = 0; number >0; i++ ){

            int nextNumber = number%10;

            reverseNumbers.add(nextNumber);

            number/=10;


        }

        for (Integer integer : reverseNumbers) {

            System.out.print(integer);
        }


    }
}
