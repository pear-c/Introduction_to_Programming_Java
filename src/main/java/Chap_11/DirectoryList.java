package Chap_11;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {
    public static void main(String[] args) {
        String directoryName;
        File directory;
        Scanner scanner;

        scanner = new Scanner(System.in);

        System.out.print("Enter a directory name: ");
        directoryName = scanner.nextLine().trim();
        directory = new File(directoryName);

        if(!directory.isDirectory()) {
            if(!directory.exists()) {
                System.out.println("There is no such directory");
            }
            else {
                System.out.println("That file is not a directory.");
            }
        }
        else {
            listDirectoryContents(directory, "");
        }
    }
    static void listDirectoryContents(File directory, String path) {
        String[] files;
        System.out.println(path + "Directory \"" + directory.getName() + "\":");
        path += "  ";
        files = directory.list();
        for(int i=0; i<files.length; i++) {
            File f = new File(directory, files[i]);
            if(f.isDirectory()) {
                listDirectoryContents(f, path);
            }
            else {
                System.out.println(path + files[i]);
            }
        }
    }
}
