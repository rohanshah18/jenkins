import java.util.ArrayList;
import java.util.HashMap;

public class ErrorResponses {
    private static HashMap<String, ArrayList<String>> errorResponseMap = new HashMap<String, ArrayList<String>>();

    private static boolean addErrorResponse(String error, String hint) {
        ArrayList<String> hints = new ArrayList<String>();
        error = error.trim().toLowerCase();
        if (errorResponseMap.containsKey(error)) {
            hints = errorResponseMap.get(error);
        }
        hints.add(hint);
        errorResponseMap.put(error, hints);
        return true;
    }

    private static ArrayList<String> getErrorResponse(String error) {
        if (error != null && error.length() > 0) {
            error = error.toLowerCase();
            if (errorResponseMap.containsKey(error)) {
                return errorResponseMap.get(error);
            }
        }
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        addErrorResponse("java.lang.ArrayIndexOutOfBoundsException", "The array is indexed at 0 in java \n");
        addErrorResponse("java.lang.ArrayIndexOutOfBoundsException", "Did you try to access an array's ith element whose value is not defined yet?\n");
        addErrorResponse("java.lang.NullPointerException", "Did you try to use a variable that was not initialized before?");
        ArrayList<String> hints = getErrorResponse(args[0]);
        for (int i = 1; i <= hints.size(); i++) {
            System.out.println(i + ". " + hints.get(i - 1));
        }
    }
}
