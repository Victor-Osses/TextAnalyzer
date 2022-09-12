package Controller;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextManipulator {
  
    public ArrayList<TreeMap<String, ArrayList<String>>> textAnalyzer(ArrayList<String> filesText) {
        try {
            ArrayList<TreeMap<String, ArrayList<String>>> wordsCorrelation = new  ArrayList<>();

             for(String text : filesText) {
                TreeMap<String, ArrayList<String>> treeMap = new TreeMap<>();
                text = normalizeText(text);

                String[] words = text.trim().split(" ");

                for(int index = 0; index < words.length - 1; index++) {
                   String key = words[index];
                   String value = words[index + 1];

                    if(!treeMap.containsKey(key)) {
                        treeMap.put(key, new ArrayList<>());
                    }

                   if(!treeMap.get(key).contains(value))
                        treeMap.get(key).add(value);
                }

                wordsCorrelation.add(treeMap);
            }
            return wordsCorrelation;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        return null;
    }
   
    public String normalizeText(String text) {
        text = text.toLowerCase();
        String[] normalizeChars = {".", ",",":",";","!","?","(",")","[","]","{","}","\"","\'","\\", "/"};
        for(String normalizeChar : normalizeChars) {
            text = text.replace(normalizeChar, "");
        }
        return text;
    }
}
