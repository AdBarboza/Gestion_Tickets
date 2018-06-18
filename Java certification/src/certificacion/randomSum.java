/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificacion;
import java.util.*;
//import java.util.Random; //Arriba ya lo importa

/**
 *
 * @author Adrián
 */
public class randomSum {
    public static int sumar(){
        Random rand = new Random();
        int a = rand.nextInt(50);
        int b = rand.nextInt(50);
        return a+b;
    } 
}
