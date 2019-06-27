package zadania.words;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {


        File file = new File("/Users/dagmar/Desktop/SDA/slowa2.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;

        List<StringTuple> tuples = new ArrayList<StringTuple>();

        StringTuple stringTuple;


        while ((line = bufferedReader.readLine()) != null) {

            String[] words = line.split(" ");

            String firstWord = words[0];
            String secondWord = words[1];

            stringTuple = new StringTuple(firstWord, secondWord);

            tuples.add(stringTuple);


        }

        bufferedReader.close();

        getWordEndWithA(tuples);

        getWordBContainsWordA(tuples);

        getAnagrams(tuples);

    }

    private static void getAnagrams(List<StringTuple> tuples) {
        int counterAnagram = 0;
        for (StringTuple tuple : tuples) {
            if (tuple.isLineAnagram()) {

                System.out.println(tuple.getFirstAndSecondWord());
                counterAnagram++;

            }
        }
        System.out.println("Jest : " + counterAnagram + " wierszy w ktorych wystepuje anagram");
    }

    private static void getWordBContainsWordA(List<StringTuple> tuples) {
        int counterContains = 0;
        for (StringTuple tuple : tuples) {
            if (tuple.isWordBcontainsA()) {
                counterContains++;
            }
        }
        System.out.println("Jest : " + counterContains + " wierszy w ktorych 2 slowo zawiera 1 ");
    }

    private static void getWordEndWithA(List<StringTuple> tuples) {
        int counterA = 0;
        for (StringTuple tuple : tuples) {
            counterA += tuple.getWordEndWithA();
        }

        System.out.println("Jest : " + counterA + " slow konczacych sie na A");
    }
}
