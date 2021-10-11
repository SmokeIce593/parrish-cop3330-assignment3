package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ProductSearchParser {
    public static JsonObject fileParse() throws IOException {
        ProductSearchBase base = new ProductSearchBase();
        JsonParser parser = new JsonParser();
        try {
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));
            JsonObject object = (JsonObject) obj;

            //Reading products array from  the file
            JsonArray subjects = (JsonArray)object.get("products");
            Iterator iterate = subjects.iterator();
            String input = "\"" + base.Input() + "\"";
            while(iterate.hasNext()){
                JsonObject test = (JsonObject) iterate.next();
                if(input.equals(test.get("name").toString())) {
                    System.out.printf("%s \t %s\n", test.get("name").toString(), input);
                    return test;
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
