/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex44;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ProductSearchTest {
    // If not null it should pass this test
    @Test
    void ConditionalSuccess() {
        JsonParser parser = new JsonParser();
        try {
            Object obj = parser.parse(new FileReader("input/exercise44_input.json"));
            JsonObject object = (JsonObject) obj;
            assertEquals(ProductSearchBase.Conditional(object), object);
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    void FindInArrayNULL() {
        assertNull(ProductSearchParser.IterateArray(null, "test"));
    }

    @Test
    void FindInArray() {
        String actual = Objects.requireNonNull(ProductSearchParser.fileParse("Doodad")).toString();
        String expected = "{\"name\":\"Doodad\",\"price\":5.00,\"quantity\":10}";
        assertEquals(actual, expected);
    }

}