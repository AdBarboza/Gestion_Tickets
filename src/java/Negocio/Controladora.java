/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Control.Controlador;
import Control.PropertiesToXml;
import Control.XmlToTicket_C;
import Control.XmlToTicket_RE;
import Control.XmlToTicket_RP;
import Modelo.Ticket;
import Modelo.Tickete_C;
import java.util.ArrayList;

/**
 *
 * @author Adrián
 */
public class Controladora {
    private static Controladora controller;
    
    private static int idP;
    private static int idC;
    
    private static String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        Controladora.tipo = tipo;
    }
    

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        Controladora.idP = idP;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        Controladora.idC = idC;
    }

    
    private Controladora() {
        
    }
    
    public static Controladora getInstance(){
        if (controller == null){
            controller = new Controladora();
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
    
    public void EnviarTicket(int idP, int idC, String tipo){
        PropertiesToXml propertoxml = new PropertiesToXml();
        String path = propertoxml.convertir("C:\\Users\\Jafeth Leiva\\Desktop\\TEC\\TEC 2018 - l Semestre\\Diseño\\Gestion_Tickets\\ticketConsulta.properties");
        System.out.println(path);
        Ticket ticket;
        if(tipo.equals("C")){
            XmlToTicket_C ticketC = new XmlToTicket_C();
            ticket = (Ticket)ticketC.convertir(path);
            Controlador.getInstance().enviarTicket(idP, idC,ticket);
        }
        else if(tipo.equals("RE")){
            XmlToTicket_RE ticketRE = new XmlToTicket_RE();
            ticket = (Ticket)ticketRE.convertir(path);
            Controlador.getInstance().enviarTicket(idP, idC,ticket);
        }
        else if(tipo.equals("RP")){
            XmlToTicket_RP ticketRP = new XmlToTicket_RP();
            ticket = (Ticket)ticketRP.convertir(path);
            Controlador.getInstance().enviarTicket(idP, idC,ticket);
        }
    }
}
