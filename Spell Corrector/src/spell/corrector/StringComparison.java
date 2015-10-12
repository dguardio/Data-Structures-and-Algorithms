/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell.corrector;

import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Opiza
 */
public class StringComparison {
    public static ArrayList<String> dictWords = new ArrayList<>();
    public static ArrayList<String> toCorrect = new ArrayList<>();
    public static ArrayList<String> corrected = new ArrayList<>();
         
        
    public static void stringIn(String a, String b){
        
        try {
            BufferedReader readDoc = new BufferedReader(new FileReader(a));
            BufferedReader readDict = new BufferedReader(new FileReader(b));
            
            
            String spaceX = null;
            String line = null;
            int i = 0;
            
            
            while((spaceX = readDoc.readLine()) != null){
                //for(i = 0; i < readDoc.length; i++){
                 String[]  space = spaceX.split(" ");
                    Collections.addAll(toCorrect, space);
                  
                //}
                //System.out.println(Arrays.toString(space));
            }
            
             while((line = readDict.readLine()) != null){
                //for(i = 0; i < readDoc.length; i++){
              
                    dictWords.add(line);
                //}
                //System.out.println(Arrays.toString(space));
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
            Logger.getLogger(StringComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            System.out.println("Input Output Error");
            Logger.getLogger(StringComparison.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(StringComparison.toCorrect);
        System.out.println(StringComparison.dictWords);
        
    }
    
    
    
    //String[] row = line.split("\\s+");
    
}
