package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileManipulator {
    
    public FileManipulator() {}
    
     public List<String> scanFileNames() { 
        try {
            List<String> fileNames = new ArrayList();
            System.out.println("Informe o caminho dos arquivos (informe vazio para parar)");
            
            while(true) {
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();
                
                if(!str.equals("")) fileNames.add(str); 
                else  break;
            }
            
          return fileNames;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

     public ArrayList<File> getFiles(List fileNames) {
         try {
            ArrayList<File> files = new ArrayList<File>();
            
            for(int index = 0; index < fileNames.size(); index++) {
                File file = new File(fileNames.get(index).toString());
                files.add(file);
           }
            
           return files;
         } catch (Exception e) {
              System.out.println(e.getMessage());
         } 
         return null;
     }
     
      public  ArrayList<String>  getFilesText (ArrayList<File> files) {
          try {
             ArrayList<String> fileTexts = new  ArrayList<String>();
             
             for(int index = 0; index < files.size(); index++) {
                String fileLines = "";
                
                Scanner scan = new Scanner(files.get(index));
                
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if(!line.equals("")) {
                        line = line.replace("\n", "") + " ";
                        fileLines += line;
                    }
                }
                
                fileTexts.add(fileLines);
                scan.close();  
             }
             
            return fileTexts;
          }
          catch (FileNotFoundException e) {
              System.out.println("File not found");
              e.printStackTrace();
          } 
          
          return null;
      }
      
  
      public void writeToFile(TreeMap<String, ArrayList<String>> text, File file) {
            try {
                FileWriter fw = new FileWriter(file.getName());
                for(Map.Entry<String, ArrayList<String>> entry : text.entrySet()) {
                    String line = "";
                    for(String word : entry.getValue()) {
                        line += word + " ";
                    }
                    
                   fw.write(entry.getKey() + " " + line.trim() + "\n");
                }
                fw.close();
              } 
              catch (IOException e) {
                  System.out.println("Error");
                     e.printStackTrace();
              }
      }
      
      
      public File createFiles(int index) {
            try {
                 File file = new File("Texto0" + index + ".csv");
                 
                 if (!file.createNewFile()) {
                     System.out.println("File not created");
                 } 
                 
                 return file; 
             } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
             } 
          return null;
      }
}
