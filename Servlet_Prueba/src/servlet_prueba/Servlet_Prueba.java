/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet_prueba;

/**
 *
 * @author Adrián
 */
public class Servlet_Prueba {
    public static Servlet_Prueba controller;

    private Servlet_Prueba() {
    }
    
    public static Servlet_Prueba getInstance(){
        if(controller == null){
            controller = new Servlet_Prueba();
        }
        return controller;
    }
    
    public boolean logear(String nbr, String pass){
        if(nbr.equals(pass)){
            return true;
        }
        return false;
    }
    
}
