package zadania.zadaniatestowe;

public class TownWalko {


    public static void main(String[] args) {

        System.out.println( isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    }

    public static boolean isValid(char[] walk) {

        int countS = 0;
        int countN = 0;
        int countE = 0;
        int countW = 0;

        if(walk.length == 10){

            for (char direction : walk) {

                switch (direction){
                    case 's':
                        countS+=1;

                        break;
                    case 'n':
                        countN+=1;
                        break;
                    case 'e':
                        countE+=1;
                        break;
                    case 'w':
                        countW+=1;

                }

            }

            if(countN == countS && countE == countW){
                return true;
            }

        }

        return false;
    }
}
