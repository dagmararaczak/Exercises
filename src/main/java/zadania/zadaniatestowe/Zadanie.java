package zadania.zadaniatestowe;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Zadanie  {

    public static void main(String[] args) {




        Object a = new ArrayList<>();
        System.out.println(a);

        a = new File(".");

        System.out.println(a.toString());

        System.out.println(a);

        a = new String("Cos");

        System.out.println(a);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime date = LocalDateTime.now();
        String text = date.format(formatter);

        System.out.println(text);


        AtomicInteger atomicInteger = new AtomicInteger();

        String str1 = new String("Siabada1");
        Object str2 = new String("Siabada2");
        System.out.println(str1);
        System.out.println(str2);
    }



}
