package com.excepcion.practica.practica2;

import java.text.NumberFormat;

public class Empleado {
   private int id;
   private String nombres;
   private String apellidos;
   private float salario;

    public Empleado(int id, String nombres, String apellidos, float salario) {
        // 1. Constructor de la clase Empleado, recibe un ID, nombres, apellidos y salario.
        this.id = id;         // 2. Asigna el ID proporcionado al atributo "id".
        this.nombres = nombres; // 3. Asigna el nombre proporcionado al atributo "nombres".
        this.apellidos = apellidos; // 4. Asigna el apellido proporcionado al atributo "apellidos".
        this.salario = salario; // 5. Asigna el salario proporcionado al atributo "salario".
    }

    public int getId() {
        return id; // 6. Método para obtener el ID del empleado.
    }

    public String getNombres() {
        return nombres; // 7. Método para obtener los nombres del empleado.
    }

    public String getApellidos() {
        return apellidos; // 8. Método para obtener los apellidos del empleado.
    }

    public float getSalario() {
        return salario; // 9. Método para obtener el salario del empleado.
    }

    @Override
    public String toString() {
        // 10. Método que sobrescribe el método toString de la clase Object.
        return "Empleado iD:  " + getId() +"\n"+ 
                "Nombre de Empleado: " + getNombres()+" "  + getApellidos() +"\n"+
                " Salario: " + NumberFormat.getCurrencyInstance().format((double)getSalario());
        // 11. Devuelve una cadena formateada con información del empleado, incluyendo el ID, nombre completo y salario.
    }
}

