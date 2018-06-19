/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Control.Controlador;
import Modelo.Curso;
import Modelo.Profesor;
import Modelo.Ticket;
import Negocio.BridgeControlador;
import Negocio.Fachada_Enviar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.weld.bean.builtin.FacadeInjectionPoint;

/**
 *
 * @author Andre
 */
@WebServlet(name = "EstudiantePrincipal", urlPatterns = {"/EstudiantePrincipal"})
public class EstudiantePrincipal extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        if(request.getParameter("btnCargar")!= null){ //listo
            btnCargarServlet(request,response, request.getParameter("Cursos"));
        }
        else if (request.getParameter("btnBuscar") != null){
                btnBuscarServlet(request, response);
            }
        else if (request.getParameter("btnTicketC") != null){
            Fachada_Enviar f = new Fachada_Enviar();
            PrintWriter out = response.getWriter();
            out.println(f.enviar("C"));
            }
        else  if (request.getParameter("btnTicketRE") != null){
            Fachada_Enviar f = new Fachada_Enviar();
            PrintWriter out = response.getWriter();
            out.println(f.enviar("RE"));
                }
        else{
                if (request.getParameter("btnTicketRP") != null){
                    Fachada_Enviar f = new Fachada_Enviar();
                    PrintWriter out = response.getWriter();
                    out.println(f.enviar("RP"));
                }
            }
        
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
    
    private void btnBuscarServlet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>"
                + "<!--"
                + "To change this license header, choose License Headers in Project Properties."
                + "To change this template file, choose Tools | Templates"
                + "and open the template in the editor."
                + "-->"
                + "<html>"
                + "    <head>"
                + "        <title>Busqueda de tiquetes</title>"
                + "        <meta charset=\"UTF-8\">"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "    </head>"
                + "    <body>"
                + "        <div>"
                + "            <h1>"
                + "                Busqueda de tiquetes enviados"
                + "            </h1>"
                + "<p>"
                + " A continuación se muestran los tiquetes que usted ha enviado."
                + "</p>"//por aca puede que cambie a un list box
                + "<form name=\"formBuscar\" action=\"PantallaBuscar\" >"
                + "<div class=\"list-group\">");
        
        BridgeControlador controller = BridgeControlador.getInstance();
        String idEst = request.getParameter("carnet");
        ArrayList<Ticket> at = controller.VerTicketesEstudiante(idEst); //cuidado con la carga de la bd
        for (Ticket t : at){
            out.println("<div>"
                + "<a href=\"#\" class=\"list-group-item\">"+t.getEstado()+"</a>"
                + "</div>");
        }   
        out.println("</div>"
                + "<input type=\"submit\" value=\"Atras\" name=\"btnAtras\" />"
                + "</form>"
                + "</div>"
                + "</body>"
                + "</html>");
    }
    private void btnCargarServlet(HttpServletRequest request, HttpServletResponse response, String curso) throws IOException{
        PrintWriter out = response.getWriter();
                
                out.println("<!DOCTYPE html>"
                        + "<!--"
                        + "To change this license header, choose License Headers in Project Properties."
                        + "To change this template file, choose Tools | Templates"
                        + "and open the template in the editor."
                        + "-->"
                        + "<html>"
                        + "<head>"
                        + "        <title>Bienvenido</title>"
                        + "        <meta charset=\"UTF-8\">"
                        + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                        + "    </head>"
                        + "    <body>"
                        + "        <div>"
                        + "            <h1>"
                        + "                Pantalla principal de Estudiantes"
                        + "            </h1>"
                        + "            <p>"
                        + "                      Bienvenido a la plataforma de tiquetes. Porfavot selecciones un Curso y un profesor para enviar un tiquete"
                        + "                o bien coloque su número de carnet para ver una lista de sus tiquetes enviados."
                        + "            </p>"
                        + "            <form name=\"formEstudiantePrincipal\" action=\"EstudiantePrincipal\" >"
                        + "                <div>"
                        + "                <input type=\"text\" name=\"carnet\">"
                        + "                &nbsp;"
                        + "                <input type=\"submit\" value=\"Buscar\" name=\"btnBuscar\" />"
                        + "                </div>"
                        + "                "
                        + "                <br>"
                        + "                "
                        + "                <div>"
                        + "                <select name=\"Cursos\">");
                Controlador controller = Controlador.getInstance();
                ArrayList<Curso> ac = (ArrayList<Curso>)controller.verCursos();
                ac.forEach((c) -> {
                    out.println("<option value=\"" + c.getCodigo()+":"+c.getNbr() + "\">" +  c.getCodigo()+":"+c.getNbr() + "</option>");
        });
                
                out.println( "             </select>"
                        + "&nbsp; &nbsp;"
                        + "<input type=\"submit\" value=\"Cargar Profes\" name=\"btnCargar\" />"
                        + "                </div>"
                        + "                <br>"
                        + "                <div>"
                        + "                <select>");
                
                 String nameC = curso.split(":")[0];
                 //out.println("<option value=\"" + nameC+ "\">" +  nameC + "</option>");//aca carga profes
                 ArrayList<Profesor> profes = (ArrayList<Profesor>)controller.verProfesAsociados(Integer.parseInt(nameC));
                 for (Profesor p : profes){
                     out.println("<option value=\"" + p.getId()+":"+ p.getNbr()+ "\">" + p.getId()+":"+ p.getNbr() + "</option>");
                 };
                        //FOR DE CB
                        /*<option value=\"volvo\">Profe 1</option>"
                        + "                    <option value=\"saab\">Profe 2</option>"
                        + "                    <option value=\"mercedes\">Profe 3</option>"
                        + "                    <option value=\"audi\">Profe 4</option>"*/

                                
                        out.println("</select>"
                        + "                </div>                                   "
                        + "                <br>"
                        + ""
                        + "                <input type=\"submit\" value=\"Ticket Consulta\" name=\"btnTicketC\" />"
                        + "                <input type=\"submit\" value=\"Ticket Revision\" name=\"btnTicketRP\" />"
                        + "                <input type=\"submit\" value=\"Ticket Reclamo\" name=\"btnTicketRE\" />"
                        + "            </form>"
                        + "        </div>"
                        + "    </body>"
                        + "</html>");
    }
}