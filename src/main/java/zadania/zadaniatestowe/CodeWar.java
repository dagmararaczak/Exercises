package zadania.zadaniatestowe;

public class CodeWar {


    public static void main(String[] args) {


        System.out.println( maskify("Dagmara"));
    }

    public static String maskify(String str) {


        String end = str.substring(str.length()-4);

        String beginning = str.substring(0,str.length()-4);

        String newBeginning = "";

        for(int i= 0; i< beginning.length(); i++){

            newBeginning+="#";


        }

        String result = newBeginning + end;


       // throw new UnsupportedOperationException("Unimplemented");


        return result;


    }
}
