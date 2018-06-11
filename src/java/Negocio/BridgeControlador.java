/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Control.Controlador;

/**
 *
 * @author Adrián
 */
public class BridgeControlador {
    private static BridgeControlador controller;
    private Controlador controllerOld;

    private BridgeControlador() {
        controllerOld = Controlador.getInstance();
    }
    
    public static BridgeControlador getInstance(){
        if (controller == null){
            controller = new BridgeControlador();
        }
        return controller;
    }

    public Controlador getControllerOld() {
        return controllerOld;
    }

    public void setControllerOld(Controlador controllerOld) {
        this.controllerOld = controllerOld;
    }
     
}
