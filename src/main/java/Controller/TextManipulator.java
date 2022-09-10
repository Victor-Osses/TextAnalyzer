/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Victor Hugo Costa Osses, 254373
 * @autor Pedro Trama Fernandes Pereira, 254344
 * @authos Luis Francisco Ribeiro Malaquias, 254289
 * @autor Jorge Yudi Saito Maruyama, 254274
 */
public class TextManipulator {
    private List fileNames;
    
    public TextManipulator(List fileNames) {
        setFileNames(fileNames);
    }
    
    public void getFiles() {
       try {
         for(int index = 0; index < this.getFileNames().size(); index++) {

                 File file = new File(this.getFileNames().get(index).toString());
                 Scanner scan = new Scanner(file);
                 String text = "";

                 while (scan.hasNextLine()) {
                    text += scan.nextLine() + '\n';
                 }
                 
                 System.out.println(text);
                 scan.close();  
         }
       } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
       }
    }
    
    public void textAnalyzer(String text) {
        
        textRegex(text); //Luis
        //criar estrutra treemap //Osses
        //fazer função que ordena os indíces da Treemap //Trama e Jorge 
        //Criar arquivo e baixar ele na máquina do usuário //Tosi
        
        //OBS: Todos os blocos devem estar dentro de blocos Try Catch e suas excessões devem ser tratadas de forma especializada
        //OBS: Tudo deve estar em inglês
    /*  
        - Ler cada linha do texto
        - Implementar uma função para retirar a pontuação, aspas, travessões  etc - regex é uma solução
        - Retornar a linha formatada corretamente
        - Separar palavras da linha por espaço (guardar em um array list cada palavra)
        - Associar cada palavra com a palavra posterior (ver estrutura tree map)
            Exemplo de treemap (acho que é algo assim):
               feliz dia aniversario
               feliz ano
 
               ['feliz'] => ['dia', 'aniversario', 'ano']
               ['pedro'] => ['dia', 'aniversario', 'ano']
       - Depois de associar todas as palavras, ordernar por indíice do array 
       - Passar treemap para o controller, do controller para saveFile que vai escrever a estrutura dentro de um arquivo e baixar 
    */
    }
    
    /*Tirar acentos, pontuação, travessão etc*/
    public String textRegex(String text) {
        
        return "texto formatado";
    }

    public List getFileNames() {
        return fileNames;
    }

    public void setFileNames(List fileNames) {
        this.fileNames = fileNames;
    }
}
