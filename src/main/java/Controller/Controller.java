package Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Controller {
    private final FileManipulator fileM = new FileManipulator();
    private final TextManipulator textM = new TextManipulator();
    
    public Controller() {}

    public List<String> scanFilesName() {
         return getFileM().scanFileNames();
    }

    public ArrayList<File> getFiles(List fileNames) {
       return getFileM().getFiles(fileNames);
    }
    
    public ArrayList<String> getFilesText (ArrayList<File> files) {
        return getFileM().getFilesText(files);
    }

    public void createFiles (ArrayList<TreeMap<String, ArrayList<String>>>  wordsCorrelation) {
        for(int index = 0; index < wordsCorrelation.size(); index++) {
              FileManipulator fileM = getFileM();
              File file = fileM.createFiles(index + 1);
              
              if(file.isFile()) {
                fileM.writeToFile(wordsCorrelation.get(index), file);
              } 
        }
    }
    
    public ArrayList<TreeMap<String, ArrayList<String>>> textAnalyzer(ArrayList<String> filesTexts) {
         return getTextM().textAnalyzer(filesTexts);
    }

    public TextManipulator getTextM() {
        return textM;
    }
    
    public FileManipulator getFileM() {
        return fileM;
    }  
}