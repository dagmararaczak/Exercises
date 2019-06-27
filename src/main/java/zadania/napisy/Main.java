package zadania.napisy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/dagmar/Desktop/SDA/napis.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));


        String line;

        Text text = new Text();

        List<String> words = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null)
        {

            words.add(line);


        }

        bufferedReader.close();


       printPrimeWords(text, words);

        printUpWords(text, words);

        printDuplicate(words);

    }

    private static void printDuplicate(List<String> words) {
        List<String> duplicateWords = words
                .stream()
                .filter(word -> Collections.frequency(words, word) > 1)
                .distinct()
                .collect(Collectors.toList());


        System.out.println("Duplikaty: ");
        for (String word : duplicateWords) {
            System.out.println(word);
        }
    }

    private static void printUpWords(Text text, List<String> words) {
        System.out.println("Slowa rosnace : ");
        for (String word : words) {

            if ( text.isUpWord(word)){
                System.out.println(word);

            }

        }
    }

    private static void printPrimeWords(Text text, List<String> words) {
        int countPrime = 0;

        System.out.println("Slowa pierwsze : ");
        for (String word : words) {

            if ( text.isAPrimeNumberWord(word)){
                System.out.println(word);

                countPrime++;
            }

        }

        System.out.println(" Jest  ich " + countPrime );
    }
}
