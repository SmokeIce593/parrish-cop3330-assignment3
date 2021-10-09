/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex42;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;



public class FileParseTable {
    public void TableOutput(List<String> names) {
        String DashString = Dash(SpaceMax(names).length());

        System.out.printf("Last%s" +
                "First%s" +
                "Salary%s" +
                        "\n%s",
                Spaces(Max(names, 0), 4),
                Spaces(Max(names, 1), 5),
                Spaces(Max(names, 2), 6),
                DashString);

        for (int i=0; i<names.size(); i++){
            if (i % 3 == 0)
                System.out.print("\n");
            String space = Spaces(Max(names, i % 3), names.get(i).length());
            System.out.printf("%s%s", names.get(i), space);
        }

    }

    public int Max(List<String> names, int start) {
        int max = 0;
        // Goes through the same type (hence the +3) and checks for max length
        for (int i= start; i<names.size(); i+=3){
            if(names.get(i).length() > max)
                max = names.get(i).length();
        }

        return max;
    }

    public String Spaces(int max, int size) {
        String space = "";
        // Checks the max substracts size of string and adds 3 for design
        for (int i=0; i<max-size + 3; i++){
            space = space + ' ';
        }

        return space;
    }

    public String Dash(int max) {
        String dash = "";
        // Checks the max substracts size of string and adds 3 for design
        for (int i=0; i<max; i++){
            dash = dash + '-';
        }

        return dash;
    }

    public String SpaceMax(List<String> names) {
        String SpaceMax =  Spaces(Max(names, 0), 0) + Spaces(Max(names, 1), 0)
                + Spaces(Max(names, 2), 0);
        return Dash(SpaceMax.length());
    }


}