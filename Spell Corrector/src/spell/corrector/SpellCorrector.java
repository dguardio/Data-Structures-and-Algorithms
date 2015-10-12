/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell.corrector;

/**
 *
 * @author Opiza
 */
public class SpellCorrector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputDocument = args[0];
        String inputDictionary = args[1];
        StringComparison.stringIn(inputDocument, inputDictionary);
        
        
      // System.out.println(StringComparison.toCorrect);
        // System.out.println(StringComparison.dictWords);
    }
    
}
