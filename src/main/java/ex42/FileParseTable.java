/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex42;

import java.util.List;


public class FileParseTable {
    public void TableOutput(List<String> info) {
        String DashString = Dash(SpaceMax(info).length());

        System.out.printf("Last%s" +
                "First%s" +
                "Salary%s" +
                        "\n%s",
                Spaces(Max(info, 0), 4),
                Spaces(Max(info, 1), 5),
                Spaces(Max(info, 2), 6),
                DashString);

        for (int i=0; i<info.size(); i++){
            if (i % 3 == 0)
                System.out.print("\n");
            String space = Spaces(Max(info, i % 3), info.get(i).length());
            System.out.printf("%s%s", info.get(i), space);
        }

    }

    public int Max(List<String> info, int start) {
        int max = 0;
        // Goes through the same type (hence the +3) and checks for max length
        for (int i= start; i<info.size(); i+=3){
            if(info.get(i).length() > max)
                max = info.get(i).length();
        }

        return max;
    }

    public String Spaces(int max, int size) {
        // Checks the max substracts size of string and adds 3 for design

        return " ".repeat(Math.max(0, max - size + 3));
    }

    public String Dash(int max) {
        // Checks the max substracts size of string and adds 3 for design
        return "-".repeat(Math.max(0, max));
    }

    public String SpaceMax(List<String> info) {
        String SpaceMaximum =  Spaces(Max(info, 0), 0) + Spaces(Max(info, 1), 0)
                + Spaces(Max(info, 2), 0);
        return Dash(SpaceMaximum.length());
    }


}