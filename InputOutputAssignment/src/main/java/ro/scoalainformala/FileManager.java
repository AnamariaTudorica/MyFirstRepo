package ro.scoalainformala;

import java.io.*;

public class FileManager {
    public static void createFile(String nameAndPath) {
            try {
                File myFile = new File(nameAndPath);
                if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                } else {
                    System.out.println("File already exists. Appending to existing content.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }

    public static void writeToFile(String nameAndPath, String textToWrite) {
        try(FileWriter pen = new FileWriter(nameAndPath, true );
            BufferedWriter ink = new BufferedWriter(pen);
            PrintWriter hand = new PrintWriter(ink)) {
            hand.println(textToWrite);
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
}
