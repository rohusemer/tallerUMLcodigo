/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagos;

/**
 *
 * @author segur
 */
public class PagoEfectivo implements Pago{
    protected float monto;

    public PagoEfectivo(float monto) {
        this.monto = monto;
    }

    public float getMonto() {
        return monto;
    }

    @Override
    public boolean realizarPago(float monto) {
        return true;
    }
    
    
}
