/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import ex42.FileParseSort;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;


public class ProductSearchBase {

    public static void main(String[] args) throws Exception {
        ProductSearchParser parser = new ProductSearchParser();
        JsonObject Found = parser.fileParse();


        String Name = Found.get("price").toString();
        System.out.println(Found);
        System.out.println(Name);
    }



    private static List<String> convertFile() throws IOException {
        List<String> names = Files.readAllLines(Path.of("Input/exercise42_input.txt"));
        return names;
    }


}