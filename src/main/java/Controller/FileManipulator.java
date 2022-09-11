/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Victor Hugo Costa Osses, 254373
 * @author Pedro Trama Fernandes Pereira, 254344
 * @author Luis Francisco Ribeiro Malaquias, 254289
 * @author Jorge Yudi Saito Maruyama, 254274
 */
public class FileManipulator {
    
    public FileManipulator() {}
    
     public List<String> scanFileNames() {
        List<String> fileNames = new ArrayList();
        System.out.println("Informe o caminho dos arquivos (informe vazio para parar)");
        
        try {
            while(true) {
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                
                if(!str.equals("")) fileNames.add(str); 
                else  break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return fileNames;
    }

     public ArrayList<File> getFiles(List fileNames) {
        ArrayList<File> files = new ArrayList<File>();
         try {
            for(int index = 0; index < fileNames.size(); index++) {
                File file = new File(fileNames.get(index).toString());
                files.add(file);
           }
         } catch (Exception e) {
              System.out.println(e.getMessage());
         }
         return files;
     }
     
      public ArrayList<ArrayList<String>> getFilesTextLines(ArrayList<File> files) {
          ArrayList<ArrayList<String>> fileTexts = new ArrayList<ArrayList<String>>();
          try {
             for(int index = 0; index < files.size(); index++) {
                ArrayList<String> fileLines = new ArrayList<String>();
                Scanner scan = new Scanner(files.get(index));
                
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if(!line.equals(""))
                        fileLines.add(line);
                }
                scan.close();  
                fileTexts.add(fileLines);
             }
          }
          catch (FileNotFoundException e) {
              System.out.println("File not found");
              e.printStackTrace();
         }
          
          return fileTexts;
      }
      
      public void saveNewFiles(ArrayList<ArrayList<String>> newFiles) {
          
      }
}
