/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex45;

import java.io.IOException;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;


public class WordFinderExport {
    public static void exportList(List<String> Names) throws IOException {
        FileWriter outputWriter = new FileWriter("Output/" + Input() + ".txt");
        for (String name : Names) {
            outputWriter.write(name + "\n");
        }
        outputWriter.close();
    }

    public static String Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("What should the name of the file be?");
        return input.nextLine();
    }
}