package ro.scoalainformala;

public class WordCounter {
    public static int countWordsinOneLine(String myLine) {
        if(myLine == null)
            return -1;

        String words = myLine.trim();
        if(words.isEmpty())
            return 0;
        else
            return words.split("\\W+").length;
    }
}
