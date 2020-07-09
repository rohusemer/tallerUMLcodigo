/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;
import java.util.Date;
import sistemaclinico.Cita;
import sistemaclinico.HistoriaClinica;

/**
 *
 * @author segur
 */
public class Paciente extends Persona{
    protected String email;
    private Cita cita;
    private ArrayList<HistoriaClinica> hc = new ArrayList<>();
    private ArrayList<Cita> citas; 

    public Paciente(String email, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String rol) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, rol);
        this.cita = new Cita();
        this.citas = new ArrayList<>();
        this.email = email;
    }

        public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
    
    
    public boolean solicitarCita(){
        System.out.println(this.nombre +" Solicito cita");
        cita.toString();
        return true;            
    }

    @Override
    public String toString() {
        return "................................Datos del paciente................................" + "\n"+
                "Nombre: "+this.nombre+"\t"+" Apellido :"+this.apellido+"\n"+
                "Cedula: "+this.cedula+"\n"+
                "Direccion: "+this.direccion+"\t"+"email=" + email ;
    }

    
    
    
    
}
