package ro.scoalainformala;
import java.io.*;
import java.net.*;

public class URLReader {
    public static final String FILE_PATH = "https://gist.githubusercontent.com/phillipj/4944029/raw/75ba2243dd5ec2875f629bf5d79f6c1e4b5a8b46/alice_in_wonderland.txt";
    public static final String FILE_LOCAL_PATH ="d:/Alice.txt";

    public static void main(String[] args) throws Exception {

        FileManager.createFile(FILE_LOCAL_PATH);
        URL myUrl = new URL(FILE_PATH);
        BufferedReader in = new BufferedReader(new InputStreamReader(myUrl.openStream()));

        String inputLine;
        int nrOfWordsInOneLine;
        while ((inputLine = in.readLine()) != null) {
            nrOfWordsInOneLine = WordCounter.countWordsinOneLine(inputLine);
            FileManager.writeToFile(FILE_LOCAL_PATH, "(" + nrOfWordsInOneLine + ") " + inputLine);
            //System.out.println("(" + nrOfWordsInOneLine + ") " + inputLine);
        }
        in.close();
        System.out.println("Done");

    }
}