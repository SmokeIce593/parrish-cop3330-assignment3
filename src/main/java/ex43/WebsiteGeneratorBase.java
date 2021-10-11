/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex43;

import java.util.Scanner;


public class WebsiteGeneratorBase{
    private static String SiteName;
    private static String AuthorName;
    private static String JavaFolder;
    private static String CSSFolder;

    public static void main(String[] args){
        UserInput();
        Output();
    }


    // Takes in userinput
    public static void UserInput() {
        Scanner input = new Scanner(System.in);

        // Site Name
        System.out.print("Site name:");
        SiteName = input.nextLine();

        // Author Name
        System.out.print("Author:");
        AuthorName = input.nextLine();

        // Java Script Folder?
        System.out.print("Do you want a folder for JavaScript?");
        JavaFolder = input.nextLine();

        // CSS Folder?
        System.out.print("Do you want a folder for CSS?");
        CSSFolder = input.nextLine();
    }

    // Outputs created file statements
    public static void Output() {
        WebsiteGenerator gen = new WebsiteGenerator();

        // Assigning the variables over to the Generator
        gen.FileLocation = "Output/";
        gen.Author = AuthorName;
        gen.Site = SiteName;

        // Creating Initial Directory + HTML
        gen.CreateDirectory("Output/" + SiteName);
        gen.CreateHTML("Output/" + SiteName + "/index.html");

        System.out.printf("Created ./Output/%s\n" +
                "Created ./Output/%s/index.html\n", SiteName, SiteName);

        if(JavaFolder.equals("y") || JavaFolder.equals("Y")){
            System.out.printf("Created ./Output/%s/js/\n", SiteName);
            gen.CreateJS("Output/" + SiteName + "/js");
        }
        if(CSSFolder.equals("Y") || CSSFolder.equals("y")){
            System.out.printf("Created ./Output/%s/cs/\n", SiteName);
            gen.CreateCSS("Output/" + SiteName + "/css");
        }
    }


}