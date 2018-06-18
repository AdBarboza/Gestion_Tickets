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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = Celsius.convertir(222.3);
        System.out.println(a);
        a = Celsius.convertir(0X101101);
        System.out.println(a);
        a = Celsius.convertir(3434.3655);
        System.out.println(a);
        a = Celsius.convertir(0F);
        System.out.println(a);
        int b = 10;
        System.out.println(b*1f); //Convert int to float or its better to use parse ? 
        
        System.out.println("");
        
        int r = randomSum.sumar();
        System.out.println(r);
        
        System.out.println("");
        
        twoclases tc = new twoclases();
        System.out.println(tc.getAux().name);
        
    }
    
}
