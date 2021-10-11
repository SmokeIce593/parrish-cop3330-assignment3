package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;

public class ProductSearchParser {
    public static JsonObject fileParse() throws IOException {
        JsonParser parser = new JsonParser();
        try {
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));
            JsonObject object = (JsonObject) obj;

            //Reading products array from  the file
            JsonArray subjects = (JsonArray)object.get("products");
            Iterator iterate = subjects.iterator();
            while(iterate.hasNext()){
                JsonObject test = (JsonObject) iterate.next();
                return test;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
