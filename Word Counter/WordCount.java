//import java.io.File;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class WordCount {
//    public static void main(String[] args) {
//        String patternToMatch = "([a-zA-z]+)";
//        int countWord = 0;
//        try {
//            Pattern pattern =  Pattern.compile(patternToMatch);
//            File file = new File("abx.txt");
//            Scanner sc = new Scanner(file);
//            while(sc.hasNextLine()){
//                Matcher matcher = pattern.matcher(sc.nextLine());
//                while(matcher.find()){
//                    countWord++;
//                }
//            }
//            sc.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        if(countWord>0)
//            System.out.println("Number of words in file:"+countWord);
//        else
//            System.out.println("No words found in the file");
//    }
//}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ASUS\\Downloads\\Alfido Tech\\src\\my"; // Replace with the path to your text file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                // Split each line into words using space as a delimiter
                String[] words = line.split(" ");
                wordCount += words.length;
            }

            reader.close();

            System.out.println("Total words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
