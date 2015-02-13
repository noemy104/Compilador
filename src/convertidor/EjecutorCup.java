
package convertidor;

import java.io.File;

public class EjecutorCup {
    
     public static void main(String[] args) {
        String opciones[] = new String[5]; 
        opciones[0]="-destdir";
        opciones[1]="src" +File.separator+ "convertidor";
        opciones[2]="-parser"; 
        opciones[3]="AnalizadorSintactico";
        opciones[4]="src" +File.separator+ "convertidor" +File.separator+ "cup.cup";
        try {
           // java_cup.Main.main(opciones);
            }
        catch (Exception e) {
            System.out.print(e);
            }
    }

}



