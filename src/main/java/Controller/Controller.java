/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 * @author Pedro Trama Fernandes Pereira, 254344
 * @author Luis Francisco Ribeiro Malaquias, 254289
 * @author Jorge Yudi Saito Maruyama, 254274
 */

public class Controller {
 
    public Controller() {}

    public List<String> scanFileNames() {
        List<String> fileNames = new ArrayList();
        System.out.println("Informe os nomes dos arquivos (não informe nada para parar)");
        
        try {
            while(true) {
                Scanner scan = new Scanner(System.in);
                String str = scan.nextLine();

                if(!str.equals("")) {
                    fileNames.add(str); 
                } else {
                    break;
                }
        
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return fileNames;
    }
   
    public void getFileManipulator(List fileNames) {
        TextManipulator fileM = new TextManipulator(fileNames);
        fileM.getFiles();
    }
}
