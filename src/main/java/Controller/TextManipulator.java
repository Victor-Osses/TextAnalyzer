package Controller;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * <b>TextManipulator</b> class is responsible for alphabeticaly sorting, mapping and nomralizing the words read on the user's files.
 * @author Gabriel Antunes Tosi, 254221
 * @author Jorge Yudi Saito Maruyama, 254274
 * @author Luis Francisco Ribeiro Malaquias, 254289
 * @author Pedro Trama Fernandes Pereira, 254344
 * @author Victor Hugo Costa Osses, 254373
 * @since Sep 2022
 * @version 1.0
 */
public class TextManipulator {
  
          
    /**
    * This method creates the structure for the list of adjecent words
    * @param  filesText contains the texts from the files
    * @return the structures with correlations of words
    */
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
    
          
    /**
    * This method normalizes text by removing unrequired characters 
    * @param text is the file's text
    * @return formatted text
    */
    public String normalizeText(String text) {
        text = text.toLowerCase();
        String[] normalizeChars = {".", ",",":",";","!","?","(",")","[","]","{","}","\"","\'","\\", "/"};
        for(String normalizeChar : normalizeChars) {
            text = text.replace(normalizeChar, "");
        }
        return text;
    }
}
