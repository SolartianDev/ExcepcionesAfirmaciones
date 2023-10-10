package com.excepcion.practica.practica2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoImplementacion {
    // 1. Declaración de la clase EmpleadoImplementacion.

    private static Empleado[] empleadoArray = new Empleado[10];
    // 2. Declaración de un arreglo de objetos Empleado llamado empleadoArray con una longitud máxima de 10 elementos.

    public EmpleadoImplementacion() {
        // 3. Constructor de la clase EmpleadoImplementacion, no realiza ninguna acción al ser instanciado.
    }

    public void agregar(Empleado emp) throws InvalidOperationException {
        // 4. Método para agregar un empleado al arreglo.
        if (empleadoArray[emp.getId()] != null) {
            // 5. Verifica si el elemento en la posición del ID del empleado ya está ocupado.
            throw new InvalidOperationException("Error al agregar empleado, el empleado ya existe " + emp.getId());
            // 6. Lanza una excepción si el empleado ya existe.
        }
        try {
            empleadoArray[emp.getId()] = emp;
            // 7. Intenta agregar el empleado al arreglo en la posición correspondiente a su ID.
        } catch (ArrayIndexOutOfBoundsException ex) {
            // 8. Captura una excepción si se intenta agregar más empleados de los que el arreglo puede manejar.
            throw new InvalidOperationException("Error al agregar el empleado, solo se pueden agregar más de " + empleadoArray.length + " Empleados");
            // 9. Lanza una excepción por intentar agregar más empleados de lo permitido.
        }
    }

    public void eliminar(int id) throws InvalidOperationException {
        // 10. Método para eliminar un empleado del arreglo por su ID.
        if (empleadoArray[id] == null) {
            // 11. Verifica si el elemento en la posición del ID del empleado está vacío.
            throw new InvalidOperationException("Error al eliminar el Empleado, el Empleado con el id número " + id + " no existe ");
            // 12. Lanza una excepción si el empleado no existe en la posición especificada.
        }
        try {
            empleadoArray[id] = null;
            // 13. Intenta eliminar el empleado estableciendo la posición correspondiente en null.
        } catch (ArrayIndexOutOfBoundsException e) {
            // 14. Captura una excepción si se intenta eliminar un empleado en una posición no válida.
            throw new InvalidOperationException("Error eliminando el empleado " + empleadoArray.length);
            // 15. Lanza una excepción por intentar eliminar un empleado en una posición no válida.
        }
    }

    public Empleado[] getTodosLosEmpleado() {
        // 16. Método para obtener un arreglo con todos los empleados existentes.
        List<Empleado> emps = new ArrayList<>();
        // 17. Crea una lista de empleados vacía.

        for (Empleado e : empleadoArray) {
            // 18. Recorre el arreglo de empleados.
            if (e != null) {
                // 19. Verifica si el elemento en la posición actual no es nulo (existe un empleado).
                emps.add(e);
                // 20. Agrega el empleado a la lista.
            }
        }
        return emps.toArray(new Empleado[0]);
        // 21. Convierte la lista de empleados a un arreglo y lo devuelve.
    }

    public Empleado encontrarPorID(int id) throws InvalidOperationException {
        // 22. Método para encontrar un empleado por su ID.
        try {
            return empleadoArray[id];
            // 23. Devuelve el empleado en la posición correspondiente al ID proporcionado.
        } catch (ArrayIndexOutOfBoundsException e) {
            // 24. Captura una excepción si se intenta buscar un empleado en una posición no válida.
            throw new InvalidOperationException("Error al buscar al empleado " + e);
            // 25. Lanza una excepción por intentar buscar un empleado en una posición no válida.
        }
    }
}

