/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Control.Controlador;
import Modelo.Ticket;
import Modelo.Tickete_C;
import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public class BridgeControlador {
    private static BridgeControlador controller;

    private BridgeControlador() {
        
    }
    
    public static BridgeControlador getInstance(){
        if (controller == null){
            controller = new BridgeControlador();
        }
        return controller;
    }
     
    public ArrayList<Ticket> VerTicketesEstudiante(String idEst){
       //falta por implementar
       ArrayList<Ticket> a= new ArrayList<Ticket>();
       a.add(new Tickete_C());
       a.get(0).setEstado("Implementar");
       return a; 
    }
}
