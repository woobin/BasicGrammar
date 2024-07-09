import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extraction {

    /**
     * @author Jeongwoo Lee
     * @param args
     */
    public static void main(String[] args) {
        String input = "Recombinable business logic in a Boolean fashion";
        outputWordsStartingWithB(input);
        // printList(getWordsStartingWithB(input));
    }
    
    /**
     * テキストからBもしくはbで始まる単語をプリントする
     * @param input テキスト入力
     */
    public static void outputWordsStartingWithB(String input) {
        List<String> wordsStartingWithB = getWordsStartingWithB(input);
        printList(wordsStartingWithB);
    }
    
    /**
     * テキストからBもしくはbで始まる単語を取得する
     * @param input テキスト入力
     * @return Bもしくはbで始まる単語のリスト
     */
    public static List<String> getWordsStartingWithB(String input) {
        String[] words = input.split("\\s+");
        Pattern pattern = Pattern.compile("^B", Pattern.CASE_INSENSITIVE);
        List<String> results = new ArrayList<>();
        
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                results.add(word);
            }
        }
        return results;
    }
    
    /**
     * Listの値をカンマで区切って並べてプリントする
     * @param list リスト
     */
    public static void printList(List<String> list) {
        System.out.println(String.join(",", list));
    }
}

