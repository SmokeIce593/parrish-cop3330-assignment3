/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex44;

import com.google.gson.JsonObject;

import java.util.Scanner;


public class ProductSearchBase {

    public static void main(String[] args) throws Exception {
        ProductSearchOutput out = new ProductSearchOutput();
        // First find
        String UserInput = Input();
        JsonObject Found = ProductSearchParser.fileParse(UserInput);

        // Checks if something is inside Found or if it is Null (If null keep searching)
        Found = Conditional(Found);

        // When Found is no longer null it prints the values
        out.output(Found);

    }


    // Takes the products name
    public static String Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the product name? ");
        return input.nextLine();
    }

    // If found is null keep searching until found is no longer null
    public static JsonObject Conditional(JsonObject Found) {
        while(Found == null){
            System.out.print("Sorry, that product was not found in our inventory.\n");
            Found = ProductSearchParser.fileParse(Input());
        }

        return Found;
    }



}