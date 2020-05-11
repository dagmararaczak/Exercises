package zadania.zadaniatestowe;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PowExercise implements Runnable {


    public static void main(String[] args) {

        int n = 534234;

        int z = Integer.parseInt(String.valueOf(n).chars()
                .map(i -> Integer.parseInt(String.valueOf((char)i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));

        System.out.println(z);

        IntStream.rangeClosed(0,100)
                .mapToObj(i -> i%5 == 0 ? (i%3 == 0 ? "fizzbuz": "fizz"):(i%3==0 ? "buzz": i ))
                .forEach(System.out :: println);

        Thread thread = new Thread(new PowExercise());
        thread.start();
    }








    @Override
    public void run() {

        System.out.println("dziala");

    }
}
