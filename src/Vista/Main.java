/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.Ciudad;
import Logica.EstacionMet;
import Logica.MilimetrosA;
import Logica.NivelCE;
import Logica.Sensor;
import Logica.TemperaturaA;
import Logica.UIM;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("Archivo.txt"));
       while (s.hasNextLine()) {
            String line = s.nextLine();
            System.out.println(line);
          String [] lineas=line.split(" ");
                          System.out.println(lineas[0]+lineas[1]+lineas[2]+lineas[3]);
                 
            }
            
            
           
        
       }}
