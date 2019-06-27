package zadania.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Token {

    public static List<String> tokenize(String text,String sep){
        List<String> tokens = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(text,sep);

        while(st.hasMoreTokens()) tokens.add(st.nextToken());

        return tokens;
    }
}
