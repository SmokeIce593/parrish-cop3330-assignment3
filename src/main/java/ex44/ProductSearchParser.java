package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.util.Iterator;

public class ProductSearchParser {
    public static JsonObject fileParse(String Input) {

        JsonParser parser = new JsonParser();
        try {
            //Gets overarching obj
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));
            JsonObject object = (JsonObject) obj;

            //Reading products array
            JsonArray subjects = (JsonArray)object.get("products");

            return IterateArray(subjects, Input);
            }

        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static JsonObject IterateArray(JsonArray subjects, String Input){
        try {
            // If there is no first index
            if(subjects == null)
                return null;

            Iterator iterate = subjects.iterator();

            // Since JSON has quotes around name
            String input = "\"" +  Input + "\"";

            // Iterate through entire array if input and name match return object
            while(iterate.hasNext()){
                JsonObject individual = (JsonObject) iterate.next();
                if(input.equals(individual.get("name").toString())) {
                    return individual;
                }
            }
            return null;
        }

        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
