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
public class Fachada_Enviar {
    
    public static String enviar(String tipo){
        //tipo C, (re)E, (rp)P
        String out;
        out= "<!DOCTYPE html>"
                + "<!--"
                + "To change this license header, choose License Headers in Project Properties."
                + "To change this template file, choose Tools | Templates"
                + "and open the template in the editor."
                + "-->"
                + "<html>"
                + "    <head>"
                + "        <title>Envio de ticket</title>"
                + "        <meta charset=\"UTF-8\">"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "    </head>"
                + "    <body>"
                + "        <h1>"
                + "            Enviar ticket"
                + "        </h1>"
                + "        <form name=\"formEnviarTicket\" action=\"EnviarTicket\" >"
                +"            <div> "
                + "                <label for=\"Fecha\"> Fecha </label> "
                + "                &nbsp;"
                + "                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
                + "                <label for=\"Carnet\"> Carnet </label> "
                + "            </div>"
                + "            <br>"
                + "            <div>"
                + " <input type=\"text\" name=\"fechaE\">"
                + "            &nbsp;"
                + "            <input type=\"text\" name=\"carnetE\">"
                + "            <br>"
                + "            <br>"
                + "            "
                + "            </div>"
                + "            "
                + "            <br>"
                + "            <div>"
                + "                <label for=\"Nombre\"> Nombre </label> "
                + "                &nbsp;"
                + "                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;"
                + "                <label for=\"Correo\"> Correo </label> "                
                + "            </div>"
                + "            "
                + "            <br>"
                + "            <div>"
                + "            <input type=\"text\" name=\"nombreE\">"
                +"             <input type=\"text\" name=\"correo\">"
                + "            <div>"
                + "            <br>"
                + "            <br>"
                + "            <div> "
                + "                <label for=\"Detalle\"> Detalle </label> "
                + "            </div>"
                + "            "
                + "            <br>"
                + "            <div>"
                + "            <textarea name=\"Detalle\" rows=\"4\" cols=\"50\">"
                + "            </textarea>"
                + "            </div>   "
                + "            <br>"
                + "            <br>";
        if(tipo == "C" || tipo == "RE"){
            
            out = out + "            <div>"
                + "                <label for=\"Tipo\"> Tipo </label> "               
                + "            </div>"
                + "            "
                + "            <br>"                    
                + "            <div>"
                + "            <input type=\"text\" name=\"tipo\">"
                + "            <div>"
                + "            <br>"
                + "            <br>";
        }
        if(tipo == "C" ){
            
            out = out                 + "            <div> "
                + "                <label for=\"Asunto\"> Asunto </label> "
                + "            </div>"
                + "            "
                + "            <br>"
                + "            <div>"
                + "            <textarea name=\"Asunto\" rows=\"4\" cols=\"50\">"
                + "            </textarea>"
                + "            </div>   "
                + "            <br>"
                + "            <br>";
        }
        if(tipo == "RP" ){
            
            out = out                 + "            <div> "
                + "                <label for=\"FechaPropuesta\"> Fecha Propuesta </label> "
                + "            </div>"
                + "            "
                + "            <br>"  
                + "            <div>"
                + "            <input type=\"text\" name=\"FechaPro\">"
                + "            </div>   "
                + "            <br>"
                + "            <br>";
        }
                if(tipo == "RE" || tipo == "RP"){
            
            out = out                 + "            <div> "
                + "                <label for=\"Archivo\"> Archivo </label> "
                + "            </div>"
                + "            "
                + "            <br>"  
                + "            <div>"
                + "            <input type=\"submit\" value=\"Archivo\" name=\"btnArchivo\" />"
                + "            </div>   "
                + "            <br>"
                + "            <br>";
        }

               out= out + 
                 "            <br>"
                + "            <br>"
                + "            "
                + "            <div>"
                + "            <input type=\"submit\" value=\"Atras\" name=\"btnAtrasE\" />"
                + "            &nbsp;"
                + "            <input type=\"submit\" value=\"Enviar\" name=\"btnEnviarE\" />"
                + "            </div>"
                + "            "
                + "        </form>"
                + "    </body>"
                + "</html>";
        
        return out;
    }
    
}
