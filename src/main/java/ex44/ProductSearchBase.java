/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
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


public class ProductSearchBase {

    public static void main(String[] args) throws Exception {
        /*
        String path = "Input/exercise44_input.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        Gson gson = new Gson();
        Object json = gson.fromJson(bufferedReader, Object.class);

        System.out.println(json.toString());


         */
        JsonParser parser = new JsonParser();
        try {
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));
            JsonObject object = (JsonObject) obj;

            //Reading products array from  the file
            JsonArray subjects = (JsonArray)object.get("products");
            Iterator iterate = subjects.iterator();
            JsonObject json = (JsonObject) iterate.next();
            JsonObject test = (JsonObject) iterate.next();
            String Name = test.get("price").toString();
            System.out.println(Name);
            // while iterator.hasNext()
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }



    private static List<String> convertFile() throws IOException {
        List<String> names = Files.readAllLines(Path.of("Input/exercise42_input.txt"));
        return names;
    }


}