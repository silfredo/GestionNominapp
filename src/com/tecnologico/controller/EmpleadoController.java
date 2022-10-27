package com.tecnologico.controller;

/**
 *
 * @author Silfredo.Blanco
 * @author Nicky.Meza
 * @author Esteban.Garcia
 * @author Isaias.Vargas
 * @author Luis.Fabra
 *
 */
public class EmpleadoController {

    public void Calcular_Auxilio(float Salario, float salarioM, float AuxilioT, float SubsidioT, int DiasT) {
        if (Salario <= (salarioM * 2)) {
            AuxilioT = SubsidioT * DiasT / 30;
        } else {
            AuxilioT = 0;
        }
    }

    public void Calcular_Pension(float pension, int Salario) {
        pension = Salario * 0.04f;
    }

    public void Calcular_Salud(float salud, int Salario) {
        salud = Salario * 0.04f;

    }

    public void Calcular_Deducciones(float pension, float salud, float TotalDeducciones) {
        TotalDeducciones = salud + pension;
    }

    public void Calcular_Devengo(float Salario, float AuxilioT,float TotalDevengo) {

        TotalDevengo = Salario + AuxilioT;
    }

    public void Calcular_Total(float TotalDevengo, float TotalDeducciones, float TotalPagar) {
        TotalPagar = TotalDevengo - TotalDeducciones;
    }

}
