import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class StringOper {
    private String string;
    private Set<String> words = new LinkedHashSet<>();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getWords() {
        String string = "";
        for (String word:
             words) {
            string += word + "\n";
        }
        return string;
    }

    public void setWords() {
        String[] wordsToSet = string.split("[ \n]+");
        for (String word : wordsToSet){
            if(word.matches("[a-zA-Z]+")){
                words.add(word.toLowerCase(Locale.ROOT));
            }
        }
    }

    public void clear(){
        words.clear();
    }
}
