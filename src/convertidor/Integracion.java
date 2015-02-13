/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Noemi
 */
public class Integracion {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("src/convertidor/Entrada.txt"));
            Analizador lex = new Analizador(bf);
            AnalizadorSintactico parser = new AnalizadorSintactico(lex);
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error en " + e.getMessage());
        }
        
    }
}
