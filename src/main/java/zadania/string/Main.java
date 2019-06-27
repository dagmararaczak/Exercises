package zadania.string;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String text = "Ala\nma\nkota";

        List<String> strings = Token.tokenize(text, "\n");

        String join = String.join("+", strings);

        System.out.println(strings.toString());
        System.out.println(join);


    }
}
