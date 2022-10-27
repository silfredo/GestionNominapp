package com.tecnologico.util;

/**
 *
 * @author sianw
 */
public class FuncionSalario {

    private float TotalDeducciones;
    private float TotalDevengo;
    private float SueldoPagar;
    private float SubsidioT = 117172;
    private float SalarioM = 1000000;
    private int DiasT;

    /**
     * @return the TotalDeducciones
     */
    public float getTotalDeducciones() {
        return TotalDeducciones;
    }

    /**
     * @param TotalDeducciones the TotalDeducciones to set
     */
    public void setTotalDeducciones(float TotalDeducciones) {
        this.TotalDeducciones = TotalDeducciones;
    }

    /**
     * @return the TotalDevengo
     */
    public float getTotalDevengo() {
        return TotalDevengo;
    }

    /**
     * @param TotalDevengo the TotalDevengo to set
     */
    public void setTotalDevengo(float TotalDevengo) {
        this.TotalDevengo = TotalDevengo;
    }

    /**
     * @return the SueldoPagar
     */
    public float getSueldoPagar() {
        return SueldoPagar;
    }

    /**
     * @param SueldoPagar the SueldoPagar to set
     */
    public void setSueldoPagar(float SueldoPagar) {
        this.SueldoPagar = SueldoPagar;
    }

    /**
     * @return the SubsidioT
     */
    public float getSubsidioT() {
        return SubsidioT;
    }

    /**
     * @param SubsidioT the SubsidioT to set
     */
    public void setSubsidioT(float SubsidioT) {
        this.SubsidioT = SubsidioT;
    }

    /**
     * @return the SalarioM
     */
    public float getSalarioM() {
        return SalarioM;
    }

    /**
     * @param SalarioM the SalarioM to set
     */
    public void setSalarioM(float SalarioM) {
        this.SalarioM = SalarioM;
    }

    /**
     * @return the DiasT
     */
    public int getDiasT() {
        return DiasT;
    }

    /**
     * @param DiasT the DiasT to set
     */
    public void setDiasT(int DiasT) {
        this.DiasT = DiasT;
    }

}
