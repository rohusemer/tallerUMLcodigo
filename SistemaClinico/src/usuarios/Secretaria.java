/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;
import java.util.Date;
import sistemaclinico.Cita;

/**
 *
 * @author segur
 */
public class Secretaria extends Persona{
    private ArrayList<Paciente> pacientes;
    
    private Cita cita = new Cita();
    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String rol) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, rol);
        this.pacientes = new ArrayList<>();
    }
    
    
    public void verificarCita(){
        
    }
    public void agendarCita(){
        for(Paciente paciente: pacientes){
            if(paciente.solicitarCita()){
                
            }
        }
    }
}
