package zadania.napisy;

public class Text {

    private String text;




    public boolean isAPrimeNumberWord(String word){


        char[] wordChars = word.toCharArray();

        int ASCIIValue = 0;

        for (char wordChar : wordChars) {

            ASCIIValue+=wordChar;

        }

        int length = ASCIIValue/2;


        if(ASCIIValue == 1 |ASCIIValue == 0 ){
            return false;
        }

        for(int i  = 2; i< length; i++){
            if(ASCIIValue%i == 0){
                return false;
            }
        }


        return true;
    }

    public boolean isUpWord(String word){

        char[] wordChars = word.toCharArray();

       for(int i = 0; i<wordChars.length-1;i++){

           if(wordChars[i]>wordChars[i+1]){
               return false;
           }
       }

       return true;

    }
}
