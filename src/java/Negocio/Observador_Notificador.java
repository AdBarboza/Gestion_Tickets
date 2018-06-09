/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import org.jboss.weld.util.Observers;

/**
 *
 * @author Adrián
 */
public class Observador_Notificador extends Observador{
    int nuevasNotificaciones;

    public Observador_Notificador() {
        nuevasNotificaciones = 0;
    }

    public Observador_Notificador(int nuevasNotificaciones) {
        this.nuevasNotificaciones = nuevasNotificaciones;
    }

    public int getNuevasNotificaciones() {
        return nuevasNotificaciones;
    }

    public void setNuevasNotificaciones(int nuevasNotificaciones) {
        this.nuevasNotificaciones = nuevasNotificaciones;
    }
    
    @Override
    public void actualizar() {
        nuevasNotificaciones++;
    }
    
}
