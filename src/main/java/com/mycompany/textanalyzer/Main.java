package com.mycompany.textanalyzer;

import Controller.Controller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try {
            Controller cont = new Controller();
            List fileNames = cont.scanFilesName();
            ArrayList<File> files = cont.getFiles(fileNames);
            ArrayList<String> filesTexts = cont.getFilesText(files);
            ArrayList<TreeMap<String, ArrayList<String>>> wordsCorrelation = cont.textAnalyzer(filesTexts);
            System.out.println(wordsCorrelation);
            cont.createFiles(wordsCorrelation);       
        } catch(Exception e) {
            System.out.println("a" + e.getMessage());
        } 
    }
}
