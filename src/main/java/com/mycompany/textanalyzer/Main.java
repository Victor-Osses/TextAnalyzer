/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.textanalyzer;

import Controller.Controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            List fileNames = cont.scanFileNames();
            cont.getFileManipulator(fileNames);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
