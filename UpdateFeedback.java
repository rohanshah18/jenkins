import java.io.FileWriter;
import java.io.IOException;

public class UpdateFeedback {
    public static void main(String[] args) {
        System.out.println(updateFeedback(args[0], args[1]+ "\n"));
    }
    public static String updateFeedback(String error, String hint) {
        try{
            FileWriter fileWriter = new FileWriter("feedback.txt", true);
            String fileContent = error + "; " + hint;
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch (IOException e) {
            // exception handling
        }
        return "the error: " + error + " and the feedback: " + hint + " has been successfully added.";
    }
}