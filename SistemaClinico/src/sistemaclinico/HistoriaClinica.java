/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.ArrayList;

/**
 *
 * @author segur
 */
public class HistoriaClinica {
    protected int nro;
    protected ArrayList enfermedades;
    protected ArrayList alergias;
    protected ArrayList otros;

    public HistoriaClinica(int nro, ArrayList enfermedades, ArrayList alergias, ArrayList otros) {
        this.nro = nro;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.otros = otros;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public ArrayList getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList alergias) {
        this.alergias = alergias;
    }

    public ArrayList getOtros() {
        return otros;
    }

    public void setOtros(ArrayList otros) {
        this.otros = otros;
    }
    
    
    
}
