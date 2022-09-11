/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.textanalyzer;

import Controller.Controller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 * @autor Pedro Trama Fernandes Pereira, 254344
 * @authos Luis Francisco Ribeiro Malaquias, 254289
 * @autor Jorge Yudi Saito Maruyama, 254274
 */
public class Main {

    public static void main(String[] args) {
        try {
            Controller cont = new Controller();
            List fileNames = cont.scanFilesName();
            ArrayList<File> files = cont.getFiles(fileNames);
            ArrayList<ArrayList<String>> filesTexts = cont.getFilesTextLines(files);
            System.out.println(cont.textAnalyzer(filesTexts));
            
           /* ArrayList<TreeMap<String, ArrayList<String>>> wordCorrelation = new  ArrayList<>();
            TreeMap<String, ArrayList<String>> tree = new TreeMap<>();
            
            if(!tree.containsKey("a")) {
                tree.put("a", new ArrayList<>());
            }
            
            tree.get("a").add("texto");
            tree.get("a").add("texto2");
            tree.put("a", tree.get("a"));
            wordCorrelation.add(tree);
            System.out.println(wordCorrelation);*/
        } catch(Exception e) {
            System.out.println("a" + e.getMessage());
        }
    }
}
