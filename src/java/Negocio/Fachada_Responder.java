/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Andre
 */
public class Fachada_Responder {
    
    
    public String responder(String tipo){
        String htmlOut;
        htmlOut = "<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Responder</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <h1>\n" +
"            Responder Ticket\n" +
"        </h1>\n" +
"        <form name=\"formResponder\" action=\"Responder\" >";
        if(tipo == "C"){
            htmlOut = htmlOut + "<div> \n" +
"                <label for=\"Fecha\"> Fecha </label> \n" +
"                &nbsp;\n" +
"                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"                <label for=\"Lugar\"> Lugar </label> \n" +
"            </div>\n" +
"            \n" +
"            <input type=\"text\" name=\"fechaR\">\n" +
"            &nbsp;\n" +
"            <input type=\"lugar\" name=\"lugarR\">";
        }else if(tipo == "RP"){
            htmlOut = htmlOut + "<div> \n" +
"                <label for=\"Fecha\"> Fecha </label> \n" +
"                &nbsp;\n" +
"                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;\n" +
"                <label for=\"Lugar\"> Lugar </label> \n" +
"            </div>\n" +
"            \n" +
"            <input type=\"text\" name=\"fechaR\">\n" +
"            &nbsp;\n" +
"            <input type=\"lugar\" name=\"lugarR\">" + "            <br>\n" +
"            <br>\n" +
"            \n" +
"            <input type=\"submit\" value=\"Enviar Archivo\" name=\"btnArchivo\" />\n" +
"            \n" +
"            <br>\n" +
"            <br>";
        }else{
            htmlOut = htmlOut + "<div>\n" +
"            <input type=\"submit\" value=\"EnviarArchivo\" name=\"btnEnviarArch\" />\n" +
"            </div>";
        }
        
        htmlOut = htmlOut + "<div>\n" +
"            <input type=\"submit\" value=\"Atras\" name=\"btnAtrasR\" />\n" +
"            &nbsp;\n" +
"            <input type=\"submit\" value=\"Enviar\" name=\"btnEnviar\" />\n" +
"            </div>" +
                "            \n" +
"        </form>\n" +
"    </body>\n" +
"</html>";
        return htmlOut;
        
    };
}
