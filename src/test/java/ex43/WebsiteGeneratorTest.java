/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */

package ex43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebsiteGeneratorTest {
    @Test
    void DirectorySuccess() {
        WebsiteGenerator gen = new WebsiteGenerator();
        String actual = gen.CreateDirectory("Output/" + "Test");
        String expected = "Output/" + "Test";


        Assertions.assertEquals(actual, expected);

    }

    // Just testing the creation of the HTML Here. It inputs everything fine except the variables.
    @Test
    void HTMLSuccess() {
        WebsiteGenerator gen = new WebsiteGenerator();
        gen.CreateDirectory("Output/" + "Test");
        boolean actual = gen.CreateHTML("Output/" + "Test" + "/index.html");


        Assertions.assertTrue(actual);

    }

    @Test
    void JSTest() {
        WebsiteGenerator gen = new WebsiteGenerator();
        gen.CreateDirectory("Output/" + "Test");
        String actual = gen.CreateJS("Output/" + "Test" + "/js");
        String expected = "Output/" + "Test" + "/js";

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void CSSTest() {
        WebsiteGenerator gen = new WebsiteGenerator();
        gen.CreateDirectory("Output/" + "Test");
        String actual = gen.CreateJS("Output/" + "Test" + "/css");
        String expected = "Output/" + "Test" + "/css";

        Assertions.assertEquals(actual, expected);

    }
}
