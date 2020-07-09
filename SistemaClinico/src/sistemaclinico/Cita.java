/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaclinico;

import Pagos.Pago;
import usuarios.Persona;
import java.util.Date;

/**
 *
 * @author segur
 */
public class Cita {
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Persona persona;
    
    public void RealizarPago(Pago pago,float monto){
    }
    
    
}
