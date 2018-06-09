/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public abstract class BridgeSujeto_TicketBO {
    protected ArrayList<Observador> observadores;
    
    abstract  public void añadir(Observador obs);
    abstract  public void eliminar(Observador obs);
    abstract protected void actualizacion();
    abstract protected void notificar();
}
