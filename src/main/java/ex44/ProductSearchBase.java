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
import java.util.Scanner;


public class ProductSearchBase {

    public static void main(String[] args) throws Exception {
        ProductSearchParser parser = new ProductSearchParser();
        // If this is null it errors out
        // If it picks a names that is there then it works
        JsonObject Found = parser.fileParse();




        String Name = Found.get("price").toString();
        System.out.println(Found);
        System.out.println(Name);
    }





    public String Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the product name? ");
        return input.nextLine();
    }


}