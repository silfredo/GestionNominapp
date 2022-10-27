package com.tecnologico.util;

/**
 *
 * @author Silfredo.Blanco
 * @author Nicky.Meza
 * @author Esteban.Garcia
 * @author Isaias.Vargas
 * @author Luis.Fabra
 * 
 */
public class Salario {
    //ATRIBUTOS
    private float pension;
    private float salud;
    private float AuxilioT;
    private int recargo;
    private int HrsExtras;

    /**
     * @return the pension
     */
    public float getPension() {
        return pension;
    }

    /**
     * @param pension the pension to set
     */
    public void setPension(float pension) {
        this.pension = pension;
    }

    /**
     * @return the salud
     */
    public float getSalud() {
        return salud;
    }

    /**
     * @param salud the salud to set
     */
    public void setSalud(float salud) {
        this.salud = salud;
    }

    /**
     * @return the AuxilioT
     */
    public float getAuxilioT() {
        return AuxilioT;
    }

    /**
     * @param AuxilioT the AuxilioT to set
     */
    public void setAuxilioT(float AuxilioT) {
        this.AuxilioT = AuxilioT;
    }

    /**
     * @return the recargo
     */
    public int getRecargo() {
        return recargo;
    }

    /**
     * @param recargo the recargo to set
     */
    public void setRecargo(int recargo) {
        this.recargo = recargo;
    }

    /**
     * @return the HrsExtras
     */
    public int getHrsExtras() {
        return HrsExtras;
    }

    /**
     * @param HrsExtras the HrsExtras to set
     */
    public void setHrsExtras(int HrsExtras) {
        this.HrsExtras = HrsExtras;
    }
    
}
