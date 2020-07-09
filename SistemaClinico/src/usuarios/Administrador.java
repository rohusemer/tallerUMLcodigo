/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author segur
 */
public class Administrador extends Persona{
    ArrayList<Persona> usuarios = new ArrayList<>();

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, String rol) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, rol);
    }
     
    public void registrarUsuario(Persona persona){
        for(Persona p: usuarios){
            if(p.getUsuario().equals(persona.nombre)){
                System.out.println("Ususrio ya Existente"); 
            }else{
                usuarios.add(persona);
                System.out.println("Ususario: "+persona.nombre+" registrado");
            }   
        }
    }
    public void asignarRol(Persona persona,String rol){
        if(persona.rol == null){
            persona.setRol(rol);
        }          
        
    }

       
    
}
