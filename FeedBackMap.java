import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class FeedBackMap {
        private static ArrayList<String> getFeedback(String error) {
        error = error.trim().toLowerCase();
        ArrayList<String> hints = new ArrayList<String>();
        String line;
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader("feedback.txt"));
            while ((line = bufferReader.readLine()) != null) {
                String[] words = line.split(";");
                if(words[0].toLowerCase().equals(error)) {
                    hints.add(words[1]);
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return hints;
    }

    public static void main(String[] args) {
        ArrayList<String> hints = getFeedback(args[0]);
        for (int i = 1; i <= hints.size(); i++) {
            System.out.println(i + ". " + hints.get(i - 1));
        }
    }
}
/*
        // updateFeedback("java.lang.ArrayIndexOutOfBoundsException", "Did you try to access an array's ith element whose value is not defined yet?\n");
        updateFeedback("java.lang.ArrayIndexOutOfBoundsException", "Did you try to access an array's ith element whose value is not defined yet?\n");
        updateFeedback("java.lang.NullPointerException", "Did you try to use a variable that was not initialized before?");
        ArrayList<String> hints = getFeedback(args[0]);
        for (int i = 1; i <= hints.size(); i++) {
            System.out.println(i + ". " + hints.get(i - 1));
        }*/