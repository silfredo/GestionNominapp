package com.tecnologico.view;

import java.util.Scanner;

/**
 *
 * @author Silfredo.Blanco
 * @author Nicky.Meza
 * @author Esteban.Garcia
 * @author Isaias.Vargas
 * @author Luis.Fabra
 *
 */
public class GnAppMenu {

    public static int showMenuOption() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENIDO A GestioNapp");
        System.out.println("""
               1. Agregar informacion del empleado
               2. Editar empleado
               3. Mostrar Empleado          
               4. Eliminar Empleado
               5. Liquidar Empleado 
               6. Salir           
               """);
        System.out.print("Ingrese una de las anteriores opciones: ");

        String valorOpcion = teclado.next();
        
        int opcion = 0;

        return opcion;

    }
}
