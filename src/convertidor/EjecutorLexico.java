package convertidor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java_cup.runtime.Symbol;

/**
 *
 * @author Noemi
 */
public class EjecutorLexico {

    public static void main(String[] args) {
       // jflex.Main.generate(new File(
              //  "src" + File.separator + "convertidor"
               // + File.separator + "convertidor.flex"));

        // generar el archivo del Analizador lexico...ojo esta configurado
        BufferedReader bf = null;
        System.out.println(" ********************Token***************");
        try {
            bf = new BufferedReader(new FileReader("src/convertidor/Entrada.txt"));
            Analizador a = new Analizador(bf);
            Symbol token = null;
            do {
                token = a.next_token();
                token.value.toString();
                System.out.println(token.value.toString());

            } while (token != null);

            bf.close();
        } catch (Exception e) {
            System.out.println("Error en " + e.getMessage());
        }

    }

}
