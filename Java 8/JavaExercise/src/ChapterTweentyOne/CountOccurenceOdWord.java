package ChapterTweentyOne;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurenceOdWord {

    public static void main(String[] args) {
        String tezt = "Good morning. Have A good class. " + "Have a good visit. Have fun";

        Map<String, Integer> map = new TreeMap<>();

        String[] word = tezt.split("[\\s+\\p{P}]");//"[\\s+\\p{P}]"
        for (int i = 0; i < word.length; i++) {
            String key = word[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }
    }
}
