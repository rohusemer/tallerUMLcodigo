/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;
import java.util.Date;
import sistemaclinico.PlanNutricional;
import sistemaclinico.Recetas;

/**
 *
 * @author segur
 */
public class Doctor extends Persona{
    protected int regDoctor;
    protected String especialidad;
    protected String descPlan;
    private ArrayList<Recetas> rc = new ArrayList<>();
    

    public Doctor(int regDoctor, String especialidad, String descPlan, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String rol) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, rol);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.descPlan = descPlan;
    }

    public int getRegDoctor() {
        return regDoctor;
    }

    public void setRegDoctor(int regDoctor) {
        this.regDoctor = regDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

           
    
    public void recetar(){
                
    }
    
    public void agregarPlanNut(){
        
        
    }
    
    public void imprimirReceta(){
        for(Recetas receta:rc){
            System.out.println(receta);
        }
         
    }
    
    public void registrarSecretaria(){
        
    }

    @Override
    public String toString() {
        return "................................Datos del Doctor................................" + "\n"+
                "Nombre: "+this.nombre+"\t"+" Direccio :"+this.direccion+"\n"+
                "Registro=" + regDoctor +"\n"+
                "Area medica" + especialidad + '}';
    }
    
    
}
