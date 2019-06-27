package zadania.fields;

import java.util.List;

import static zadania.fields.FieldType.*;

public class Field {

    private int id;

    private FieldType[][] map;

    public Field(List<String> mapAsList, int id)  {

        this.id = id;

        map = new FieldType[mapAsList.size()][];

        for(int row = 0; row< mapAsList.size(); row++){
            map[row] = new FieldType[mapAsList.get(row).length()];

            char[] mapAsChars = mapAsList.get(row).toCharArray();
            for(int column = 0; column<mapAsChars.length; column++){
                if(mapAsChars[column] == '.'){
                    map[row][column] = NOTHING;
                }else if (mapAsChars[column] == '*'){
                    map[row][column] = GRASS;
                }else {
                    map[row][column] = OBSTACLE;
                }
            }
        }

    }

    public boolean is70percentOfFieldCoveredByGrass(){

        int fieldSize = 900;
        int grassFieldCounter = 0;

        for(int i = 0; i<map.length; i++ ){

            for(int j = 0; j< map[i].length; j++){

                if(map[i][j].equals(GRASS)){
                    grassFieldCounter++;
                }
            }
        }

       return (double) grassFieldCounter/fieldSize >=0.7;


    }

    public int getMaxBuildSize(){
        int buildSize = 1;

        for(int i = 0 ; i < 30; i++){

            for(int j = 0; j<30; j++){
                if (map[i][j] == OBSTACLE){

                    return i + 1;
                }
            }

            for(int j = 0 ; j<30; j++){
                if(map[j][i] == OBSTACLE){
                    return i + 1;
                }
            }

        }

        return 0;
    }
}
