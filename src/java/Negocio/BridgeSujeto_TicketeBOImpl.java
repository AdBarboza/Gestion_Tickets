/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Adrián
 */
public class BridgeSujeto_TicketeBOImpl extends BridgeSujeto_TicketBO{

    @Override
    public void añadir(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void eliminar(Observador obs) {
        observadores.remove(obs);
    }

    @Override
    protected void actualizacion() {
        //Aca revisa el estado de los ticketes y notifica por cada estado encontrado
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void notificar() {
        for (Observador obs : observadores) {
            obs.actualizar();
        }
    }
    
}
