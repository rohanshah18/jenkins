import java.util.ArrayList;
import java.util.HashMap;

public class FeedBackMap {
    private static HashMap<String, ArrayList<String>> fdbMap = new HashMap<String, ArrayList<String>>();

    public static String updateFeedback(String error, String hint) {
        ArrayList<String> hints = new ArrayList<String>();
        error = error.trim().toLowerCase();
        if (fdbMap.containsKey(error)) {
            hints = fdbMap.get(error);
        }
        hints.add(hint);
        fdbMap.put(error, hints);
        return "the error: " + error + " and the feedback: " + hint + " has been successfully added.";
    }

    private static ArrayList<String> getFeedback(String error) {
        if (error != null && error.length() > 0) {
            error = error.toLowerCase();
            if (fdbMap.containsKey(error)) {
                return fdbMap.get(error);
            }
        }
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        updateFeedback("java.lang.ArrayIndexOutOfBoundsException", "The array is indexed at 0 in java \n");
        updateFeedback("java.lang.ArrayIndexOutOfBoundsException", "Did you try to access an array's ith element whose value is not defined yet?\n");
        updateFeedback("java.lang.NullPointerException", "Did you try to use a variable that was not initialized before?");
        ArrayList<String> hints = getFeedback(args[0]);
        for (int i = 1; i <= hints.size(); i++) {
            System.out.println(i + ". " + hints.get(i - 1));
        }
    }
}
