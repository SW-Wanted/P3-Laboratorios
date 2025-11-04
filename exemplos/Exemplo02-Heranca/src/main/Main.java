package main;

import java.util.Scanner;
import entidades.*;

/**
 *
 * @author emanuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Homem joana = new Homem("Joana Miguel", 31, "Preto", true);
        // Cao cao = new Cao("Ruff", 5, 5, true);
        // Gato gato = new Gato("Signal", 5, 5, false);
        joana.comunicar();
    }
    
}
