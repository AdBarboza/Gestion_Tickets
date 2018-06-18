/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;

/**
 *
 * @author Adrián
 */
public class twoclases {
    auxiliar aux = new auxiliar();
    
    public twoclases(){
    }
    
    public auxiliar getAux(){
        return aux;
    }
}

class auxiliar{ //this class can't be accessed by other file just by twoclases

    String name ="Soy aux";
    public auxiliar() {
    }
    
}
