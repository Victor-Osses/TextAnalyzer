/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 * @autor Pedro Trama Fernandes Pereira, 254344
 * @authos Luis Francisco Ribeiro Malaquias, 254289
 * @autor Jorge Yudi Saito Maruyama, 254274
 */

public class TextManipulator {
  
    public ArrayList<TreeMap<String, ArrayList<String>>> textAnalyzer(ArrayList<ArrayList<String>> filesTextLines) {
        ArrayList<TreeMap<String, ArrayList<String>>> wordCorrelation = new  ArrayList<>();
       
         for(ArrayList<String> text : filesTextLines) {
       
            for(String line : text) {
                String[] words = line.trim().split(" ");
                TreeMap<String, ArrayList<String>> tree = new TreeMap<>();
                
                for(int index = 0; index < words.length - 1; index++) {
                   if(!tree.containsKey(words[index])) {
                        tree.put(words[index], new ArrayList<>());
                    }
                   
                    tree.get(words[index]).add(words[index + 1]);
                }
               wordCorrelation.add(tree);
            }
        }
        
        return wordCorrelation;
    }
   
    
    /*Tirar acentos, pontuação, travessão etc*/
    public String textRegex(String text) {
        return "texto formatado";
    }

}
