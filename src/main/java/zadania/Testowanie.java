package zadania;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Testowanie {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Daga","Jaga","czekolada"};
        int[] numbers1 = new int[3];
        int numer2 = numbers1[2];

        numer2 = 2;

        System.out.println(numer2);

    }
}
