package pl.edu.agh.mwo;

import com.google.gson.Gson;

import java.io.FileReader;
import java.lang.reflect.Type;

public class DataReader {
    public List<PitStop> readPitStops(String fileName){
        Gson gson = new Gson();
        Type listType = new TypeToken<List<PitStop>>() {}.getType();

        return gson.fromJson(new FileReader(fileName), listType);


    }
}
