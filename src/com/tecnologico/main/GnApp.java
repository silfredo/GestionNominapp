package com.tecnologico.main;

import com.tecnologico.view.AgregarEmpleadoMenu;
import com.tecnologico.view.EditarEmpleadoMenu;
import com.tecnologico.view.MostrarEmpleadoMenu;
import com.tecnologico.view.EliminarEmpleadoMenu;
import com.tecnologico.view.LiquidarEmpleadoMenu;
import com.tecnologico.view.GnAppMenu;

/**
 *
 * @author Silfredo.Blanco
 * @author Nicky.Meza
 * @author Esteban.Garcia
 * @author Isaias.Vargas
 * @author Luis.Fabra
 *
 */
public class GnApp {

    public static void main(String[] args) {

    }

    public static void startApplication() {
        int opcion = 0;

        while (opcion != 6) {

            opcion = GnAppMenu.showMenuOption();

            switch (opcion) {
                case 1:
                    AgregarEmpleadoMenu.show();
                    break;
                case 2:
                    EditarEmpleadoMenu.show();
                    break;
                case 3:
                    MostrarEmpleadoMenu.show();
                    break;
                case 4:
                    EliminarEmpleadoMenu.show();
                    break;
                case 5:
                    LiquidarEmpleadoMenu.show();
                    break;
                case 6:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA!");
            }
        }
    }
}
