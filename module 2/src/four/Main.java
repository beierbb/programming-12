package four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Assignment: write code using what we learned in class about using Sets to count how many unique words there are.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();

//        import the text file and change it to only lower case words
        Scanner scanner = new Scanner(new File("C:\\Users\\2655708\\Downloads\\illiad.txt"));
        while (scanner.hasNext()) {
            String text = scanner.nextLine().toLowerCase().replaceAll("\\p{P}", "");
            lines.add(text);
        }
//        split the lines into words
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0 ; i<13393 ; i++){
            String line = lines.get(i);
            String[] setting = line.split(" ");
            words.add(Arrays.toString(setting));
        }
//        add the words into hashset
        HashSet<String> wordSet = new HashSet<>();
        for (int i = 0 ; i<13393 ; i++){
            wordSet.add(words.get(i));
        }
//        count the unique words
        System.out.println("Unique words: " + wordSet.size());

    }
}
