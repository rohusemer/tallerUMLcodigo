/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author segur
 */
public class Recetas {
    protected Date fecha;
    private ArrayList<Medicamento> md;
    private ArrayList<PlanNutricional> pn;

    public Recetas(Date fecha) {
        this.pn = new ArrayList<>();
        this.md = new ArrayList<>();
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Medicamento> getMd() {
        return md;
    }

    public void setMd(ArrayList<Medicamento> md) {
        this.md = md;
    }

    public ArrayList<PlanNutricional> getPn() {
        return pn;
    }

    public void setPn(ArrayList<PlanNutricional> pn) {
        this.pn = pn;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
}
