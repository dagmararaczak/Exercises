package zadania.fields;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Field> fields = new ArrayList<>();

        File file = new File("/Users/dagmar/Desktop/SDA/fields.txt");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        List<String> rowList = new ArrayList<>();

      List<String> mapsAsString = new ArrayList<>();

        String line;

        int count = 0;

        int mapsCounter = 1;

        while ((line = bufferedReader.readLine()) != null)
        {


            if(!line.equals("")){
                mapsAsString.add(line);
            }else if(line.equals("")){
                Field field = new Field(mapsAsString,mapsCounter);
                fields.add(field);
                mapsCounter++;
                mapsAsString.clear();

            } else{
                Field field = new Field(mapsAsString,mapsCounter);
                fields.add(field);

            }

        }

        bufferedReader.close();

        int counter = 0;

        for (Field field : fields) {

            if(field.is70percentOfFieldCoveredByGrass()){
                counter++;
            }
        }

        System.out.println("Liczba dzialek porosnietych trawa : " + counter);



    }
}
