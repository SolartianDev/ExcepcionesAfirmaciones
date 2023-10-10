package com.excepcion.practica.practica2;

// 1. Declaración del paquete y nombre de la clase.
public class InvalidOperationException extends Exception {
    // 2. Declaración de la clase que extiende la clase Exception.

    public InvalidOperationException(String message) {
        // 3. Constructor que acepta un mensaje como parámetro.
        super(message); // 4. Llama al constructor de la clase base (Exception) con el mensaje.
    }

    public InvalidOperationException(String message, Throwable cause) {
        // 5. Constructor que acepta un mensaje y una causa como parámetros.
        super(message, cause); // 6. Llama al constructor de la clase base con el mensaje y la causa.
    }

    public InvalidOperationException(Throwable cause) {
        // 7. Constructor que acepta solo una causa como parámetro.
        super(cause); // 8. Llama al constructor de la clase base con la causa.
    }
}
