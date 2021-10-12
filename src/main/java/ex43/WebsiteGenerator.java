/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ex43;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {
    public String FileLocation;
    public String Site;
    public String Author;

    // Create Main Directory
    public String CreateDirectory(String Directory) {
        File FolderCreate = new File(Directory);
        FolderCreate.mkdirs();

        return Directory;
    }

    // Create and add HTML to directory
    public boolean CreateHTML(String Info) {
        File FolderCreate = new File(Info);
        // String in HTML of the Site at the title and author as the meta
        String HTML = "<title>" + Site + "</title>" +
                "\n<meta>" + Author + "</meta>\n";


        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FolderCreate));
            bw.write(HTML);
            bw.close();
            return true;
            }
        catch(Exception ex) {
            return false;
            }

        }

        // Create CSS Directory
    public String CreateCSS(String Directory) {
        File FolderCreate = new File(Directory);
        FolderCreate.mkdirs();

        return Directory;
    }
    // Crease JS Directory
    public String CreateJS(String Directory) {
        File FolderCreate = new File(Directory);
        FolderCreate.mkdirs();

        return Directory;
    }
}
