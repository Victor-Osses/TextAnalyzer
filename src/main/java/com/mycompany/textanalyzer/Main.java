package com.mycompany.textanalyzer;

import Controller.Controller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * <b>Main</b> class the core that initiates the program and generates outputs.
 * @author Gabriel Antunes Tosi, 254221
 * @author Jorge Yudi Saito Maruyama, 254274
 * @author Luis Francisco Ribeiro Malaquias, 254289
 * @author Pedro Trama Fernandes Pereira, 254344
 * @author Victor Hugo Costa Osses, 254373
 * @since Sep 2022
 * @version 1.0
 */
public class Main {
    
          
    /**
    * This is the main method
    * @param args contains an array of strings of the program's inputs
    */
    public static void main(String[] args) {
        try {
            Controller cont = new Controller();
            List fileNames = cont.scanFilesName();
            ArrayList<File> files = cont.getFiles(fileNames);
            ArrayList<String> filesTexts = cont.getFilesText(files);
            ArrayList<TreeMap<String, ArrayList<String>>> wordsCorrelation = cont.textAnalyzer(filesTexts);
            cont.createFiles(wordsCorrelation);       
        } catch(Exception e) {
            System.out.println("a" + e.getMessage());
        } 
    }
}
