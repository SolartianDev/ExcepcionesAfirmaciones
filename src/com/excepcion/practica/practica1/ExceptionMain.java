package com.excepcion.practica.practica1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            // 1. Intenta mostrar un mensaje indicando que se está leyendo el archivo especificado en args[0].
            System.out.println("Leyendo el archivo " + args[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // 2. Captura la excepción ArrayIndexOutOfBoundsException si args[0] no está presente.
            System.out.println("El archivo no fue encontrado");
            // 3. (La línea comentada anteriormente es una instrucción para salir del programa con un código de error)
        }

        try (BufferedReader b = new BufferedReader(new FileReader(args[0]));) {
            // 4. Abre un archivo para lectura utilizando un BufferedReader dentro de un bloque try-with-resources.
            String s = null;
            while ((s = b.readLine()) != null) {
                // 5. Lee cada línea del archivo y la imprime en la consola.
                System.out.println(s);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // 6. Captura la excepción ArrayIndexOutOfBoundsException si args[0] no está presente.
            System.out.println("El archivo no fue encontrado " + e.toString());
            // 7. (La línea comentada anteriormente es una instrucción para salir del programa con un código de error)
        } catch (FileNotFoundException e) {
            // 8. Captura la excepción FileNotFoundException si el archivo no se encuentra.
            System.out.println("EL archivo no fue encontrado: " + args[0]);
            // 9. (La línea comentada anteriormente es una instrucción para salir del programa con un código de error)
        } catch (IOException ex) {
            // 10. Captura la excepción IOException si ocurre un error de lectura del archivo.
            System.out.println("Error de lectura del archivo " + ex.getMessage());
            // 11. (La línea comentada anteriormente es una instrucción para salir del programa con un código de error)
        }
    }
}
