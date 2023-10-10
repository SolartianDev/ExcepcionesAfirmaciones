package com.excepcion.practica.practica2;

public class EmpleadoTest {
    public static void main(String[] args) throws InvalidOperationException {
        // 1. Declaración de la clase EmpleadoTest y método principal.

        EmpleadoImplementacion empArr = new EmpleadoImplementacion();
        // 2. Creación de una instancia de EmpleadoImplementacion llamada empArr.

        // Creación de 10 objetos Empleado y adición a empArr.
        Empleado e1 = new Empleado(0, "Sara", "Montero", 123.43f);
        empArr.agregar(e1);
        // 3. Creación de un objeto Empleado e1 y agregado al empArr.

        Empleado e2 = new Empleado(1, "Juan", "Rodriguez", 123.43f);
        empArr.agregar(e2);
        // 4. Creación de un objeto Empleado e2 y agregado al empArr.

        Empleado e3 = new Empleado(2, "Pedro", "Castro", 123.43f);
        empArr.agregar(e3);
        // 5. Creación de un objeto Empleado e3 y agregado al empArr.

        Empleado e4 = new Empleado(3, "Miguel", "Ramirez", 123.43f);
        empArr.agregar(e4);
        // 6. Creación de un objeto Empleado e4 y agregado al empArr.

        Empleado e5 = new Empleado(4, "Orlando", "Vargas", 123.43f);
        empArr.agregar(e5);
        // 7. Creación de un objeto Empleado e5 y agregado al empArr.

        Empleado e6 = new Empleado(5, "Gloria", "Montenegro", 123.43f);
        empArr.agregar(e6);
        // 8. Creación de un objeto Empleado e6 y agregado al empArr.

        Empleado e7 = new Empleado(6, "Andrea", "Cortes", 123.43f);
        empArr.agregar(e7);
        // 9. Creación de un objeto Empleado e7 y agregado al empArr.

        Empleado e8 = new Empleado(7, "Sergio", "Velasquez", 123.43f);
        empArr.agregar(e8);
        // 10. Creación de un objeto Empleado e8 y agregado al empArr.

        Empleado e9 = new Empleado(8, "Maria", "Lopez", 123.43f);
        empArr.agregar(e9);
        // 11. Creación de un objeto Empleado e9 y agregado al empArr.

        Empleado e10 = new Empleado(9, "Samuel", "Casas", 123.43f);
        empArr.agregar(e10);
        // 12. Creación de un objeto Empleado e10 y agregado al empArr.

        Empleado[] todosLosEmpleados = empArr.getTodosLosEmpleado();
        // 13. Obtiene un arreglo de todos los empleados registrados.

        for (Empleado empleado : todosLosEmpleados) {
            // 14. Recorre el arreglo de empleados.
            System.out.println(empleado + "\n");
            // 15. Imprime la información de cada empleado.
        }

        Empleado e = empArr.encontrarPorID(5);
        // 16. Busca un empleado por su ID y almacena el resultado en e.

        if (e != null) {
            // 17. Verifica si se encontró al empleado.
            System.out.println("Empleado Encontrado");
            System.out.println(e + "\n");
            // 18. Imprime "Empleado Encontrado" y la información del empleado encontrado.
        } else {
            System.out.println("\n\n Empleado no encontrado");
            // 19. Imprime un mensaje indicando que el empleado no se encontró.
        }

        empArr.eliminar(1);
        // 20. Elimina un empleado con el ID 1.
    }
}

