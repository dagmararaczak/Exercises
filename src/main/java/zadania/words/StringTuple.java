package zadania.words;

import static java.util.Arrays.sort;

public class StringTuple {

    private  String firstWord;
    private String secondWord;



    public StringTuple(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }


    public String getFirstWord() {
        return firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public int getWordEndWithA(){

         int countA = 0;

            if(firstWord.endsWith("A")){
                countA++;
            }

            if (secondWord.endsWith("A")){
                countA++;
            }

        return countA;



    }

    public boolean isWordBcontainsA(){

       return secondWord.contains(firstWord);
    }



    public boolean isLineAnagram(){

        if(firstWord.length() != secondWord.length()){

            return false;

        }

        char[] charsFrom1word = firstWord.toCharArray();
        char[] charsFrom2word = secondWord.toCharArray();

        sort(charsFrom1word);
        sort(charsFrom2word);

        for (int i = 0; i < charsFrom1word.length; i++){

            if(charsFrom1word[i] != charsFrom2word[i]){
                return false;
            }
        }



        return true;
    }


    public String getFirstAndSecondWord(){
        return  firstWord + " " + secondWord;
    }


}
