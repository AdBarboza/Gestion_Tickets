/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Control.Controlador;
import Modelo.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet(name = "ConfigurarProfe", urlPatterns = {"/ConfigurarProfe"})
public class ConfigurarProfe extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btnAceptar") != null){
                /*atención al boton de Registro*/
                /*redirecciona al servlet para que despliegue otra pagina*/
                //response.sendRedirect("ProfePrincipal.html");
            }
        else if(request.getParameter("btnCargar") != null){
                Controlador controller = Controlador.getInstance();
                Curso curso;
                String c= request.getParameter("Cursos").split(":")[0];
                System.out.println(request.getParameter("Cursos").split(":")[0]+ "putaaaaaaaaaaaaaaaaa");
                curso = controller.verEstados(1);
                System.out.println(Controlador.getInstance().verEstados(Integer.parseInt(c)).isEst_C()+ "holaaaaaa k pex");
                System.out.println(curso.isEst_RE() + "holaaaaaa k pex2");
                System.out.println(curso.isEst_RP() + "holaaaaaa k pex3");
                printEstados(request, response, curso);
            }
        else{
                if (request.getParameter("btnAtrasConf") != null){
                    //Mensaje de que se envió
                                    PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>\n" +
"<!--\n" +
"To change this license header, choose License Headers in Project Properties.\n" +
"To change this template file, choose Tools | Templates\n" +
"and open the template in the editor.\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>Pantalla Principal</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    </head>\n" +
"    <body>\n" +
"            <h1>\n" +
"                Cursos\n" +
"            </h1>\n" +
"            <form name=\"formProfePrincipal\" action=\"ProfePrincipal\" >\n" +
"                \n" +
"                <input type=\"submit\" value=\"Configuración\" name=\"btnConfiguracion\" />\n" +
"                \n" +
"                <br>\n" +
"                <br>\n" +
"                \n" 
+ "                <div>"+
                    "<select name=\"Cursos\">" );
            
            /*BridgeControlador controller = BridgeControlador.getInstance();
             ArrayList<Curso> ac = (ArrayList<Curso>)controller.getControllerOld().verCursos();
             for(Curso c : ac){
                 out.println("<option value=\"" + c.getCodigo()+":"+c.getNbr() + "\">" +  c.getCodigo()+":"+c.getNbr() + "</option>");
             }
                */
            out.println( "                </select>"    +    
"                <br>\n" +
"                <br>\n" +
"                \n" +
"                <input type=\"submit\" value=\"Ticktes\" name=\"btnTickets\" />\n" +
"                &nbsp;\n" +
"                <input type=\"submit\" value=\"Ticktes por Curso\" name=\"btnTicketsCurso\" />\n" +
"                &nbsp;\n" +
"                <input type=\"submit\" value=\"Salir\" name=\"btnSalir\" />\n" +
"   \n" +
"            </form>\n" +
"    </body>\n" +
"</html>\n" +
"");
                }
            }
    }
    
    private void printEstados(HttpServletRequest request, HttpServletResponse response, Curso curso) throws IOException{
        PrintWriter out = response.getWriter();
        //Controlador controller = Controlador.getInstance();
        //curso = controller.verEstados(0)
                    out.println("<html>\n" +
                                "    <head>\n" +
                                "        <title>Configuracion</title>\n" +
                                "        <meta charset=\"UTF-8\">\n" +
                                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                "    </head>\n" +
                                "    <body>\n" +
                                "        \n" +
                                "        <h1>\n" +
                                "            Configuracion\n" +
                                "        </h1>\n" +
                                "        \n" +
                                "        <form name=\"formConfigurarProfe\" action=\"ConfigurarProfe\">\n" );
                    if(curso.isEst_C()){
                        out.println("        <input type=\"checkbox\" name=\"Consulta\" value=\"tipo\" checked> Consulta<br> <br>");
                    }else{
                        out.println("        <input type=\"checkbox\" name=\"Consulta\" value=\"tipo\"> Consulta<br> <br>");
                    }
                    if(curso.isEst_RE()){
                        out.println("        <input type=\"checkbox\" name=\"Revision\" value=\"tipo\" checked> Revision<br> <br>");
                    }
                    else{
                        out.println("        <input type=\"checkbox\" name=\"Revision\" value=\"tipo\"> Revision<br> <br>");
                    }
                    if(curso.isEst_RP()){
                        out.println("        <input type=\"checkbox\" name=\"Reclamo\" value=\"tipo\" checked> Reclamo<br> <br>");
                    }
                    else{
                        out.println("        <input type=\"checkbox\" name=\"Reclamo\" value=\"tipo\"> Reclamo<br> <br>");
                    }
                    
                    out.println("                <div>"+
                                                    "<select name=\"Cursos\">" );

                                            Controlador controller = Controlador.getInstance();
                                            ArrayList<Curso> ac = (ArrayList<Curso>)controller.verCursos();
                                             for(Curso c : ac){
                                                 out.println("<option value=\"" + c.getCodigo()+":"+c.getNbr() + "\">" +  c.getCodigo()+":"+c.getNbr() + "</option>");
                                             }

                                             out.println("                </select>"    +    
                                "                <br>\n" +
                                "                <br>\n" +
                                                "            <input type=\"submit\" value=\"Aceptar\" name=\"btnAceptar\">\n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Atras\" name=\"btnAtrasConf\">\n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Cargar Cursos\" name=\"btnCargar\">\n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Reiniciar Config\" name=\"btnReiniciar\">\n" +
                                "        </form>\n" +
                                "    </body>\n" +
                                "</html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    
}
