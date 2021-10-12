/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex44;

import com.google.gson.JsonObject;

public class ProductSearchOutput {
    void output(JsonObject Item){
        if(Item != null){
            // Prints output of object contents
            System.out.printf("Name: %s\nPrice: %s\nQuantity: %s",
                    // Remove the quotes by using the 1st index and second to last index
                    Item.get("name").toString().substring(1, Item.get("name").toString().length()-1),
                    Item.get("price").toString(),
                    Item.get("quantity").toString());
        }
    }
}
