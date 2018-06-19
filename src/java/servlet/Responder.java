/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre
 */
@WebServlet(name = "Responder", urlPatterns = {"/Responder"})
public class Responder extends HttpServlet {

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
        if (request.getParameter("btnAtrasR") != null){
            PrintWriter out = response.getWriter();
                    out.println("<!DOCTYPE html>\n" +
                                "<!--\n" +
                                "To change this license header, choose License Headers in Project Properties.\n" +
                                "To change this template file, choose Tools | Templates\n" +
                                "and open the template in the editor.\n" +
                                "-->\n" +
                                "<html>\n" +
                                "    <head>\n" +
                                "        <title>Tickets</title>\n" +
                                "        <meta charset=\"UTF-8\">\n" +
                                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                "    </head>\n" +
                                "    <body>\n" +
                                "         <h1>\n" +
                                "            Tickets\n" +
                                "        </h1>\n" +
                                "        <form name=\"formProfeTickets\" action=\"TicketsProfe\" >\n" +
                                "            \n" +
                                "            <div> \n" +
                                "                <label for=\"Ordenar\"> Ordenar </label> \n" +
                                "            </div>\n" +
                                "            \n" +
                                "            <br>\n" +
                                "            \n" +
                                "            <div>\n" +
                                "                <select>\n" +
                                "                    <option value=\"OrdenCursoGeneral\">Curso</option>\n" +
                                "                    <option value=\"OrdenCarnetGeneral\">Carnet</option>\n" +
                                "                    <option value=\"OrdenTipoGeneral\">Tipo</option>\n" +
                                "                </select>\n" +
                                "            </div>\n" +
                                "                <br>\n" +
                                "                \n" +
                                "            <div> \n" +
                                "                <label for=\"Filtro\"> Filtro de Tipos </label> \n" +
                                "            </div>\n" +
                                "                \n" +
                                "                <br>\n" +
                                "                \n" +
                                "            <div>\n" +
                                "                <select>\n" +
                                "                    <option value=\"Consulta\">Consulta</option>\n" +
                                "                    <option value=\"Reclamo\">Reclamo</option>\n" +
                                "                    <option value=\"Revision\">Revisión</option>\n" +
                                "                </select>\n" +
                                "            </div>\n" +
                                "                <br> \n" +
                                "            \n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Aplicar\" name=\"btnAplicar\" /> <br> <br>\n" +
                                "            \n" +
                                "            <div>"+
                                                    "<select name=\"Cursos\">" );
                    
                    
                    out.println( "                </select>"    +            
                                "                <br>\n" +
                                "                <br>\n" +                    
                                "\n" +
                                "                \n" +
                                "            <div> \n" +
                                "                <label for=\"DetalleTicketP\"> Detalle </label> \n" +
                                "            </div>\n" +
                                "            \n" +
                                "            <br> \n" +
                                "            <br>\n" +
                                "            <div>\n" +
                                "            <textarea name= \"DetalleTick\" rows=\"4\" cols=\"50\">Detalle de los tickets\n" +
                                "            </textarea>\n" +
                                "            </div>     \n" +
                                " \n" +
                                "            <br>\n" +
                                "            <div>\n" +
                                "            <input type=\"submit\" value=\"Descargar detalle\" name=\"btnDescargarTickP\" />\n" +
                                "            </div>\n" +
                                "            <br>\n" +
                                "            \n" +
                                "            \n" +
                                "            <input type=\"submit\" value=\"Atras\" name=\"btnAtrasTickP\" />\n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Responder\" name=\"btnResponderTickP\" />\n" +
                                "            \n" +
                                "\n" +
                                "        </form>\n" +
                                "    </body>\n" +
                                "</html>\n" +
                                "");
                }
        else  if (request.getParameter("btnConfiguracion") != null){
                    response.sendRedirect("ConfigurarProfe.html");
                }
        else{
                if (request.getParameter("btnTicketsCurso") != null){
                    PrintWriter out = response.getWriter();
                    out.println("<!DOCTYPE html>\n" +
                                "<!--\n" +
                                "To change this license header, choose License Headers in Project Properties.\n" +
                                "To change this template file, choose Tools | Templates\n" +
                                "and open the template in the editor.\n" +
                                "-->\n" +
                                "<html>\n" +
                                "    <head>\n" +
                                "        <title>Tickets</title>\n" +
                                "        <meta charset=\"UTF-8\">\n" +
                                "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                "    </head>\n" +
                                "    <body>\n" +
                                "         <h1>\n" +
                                "            Tickets\n" +
                                "        </h1>\n" +
                                "        <form name=\"formProfeTickets\" action=\"TicketsProfe\" >\n" +
                                "            \n" +
                                "            <div> \n" +
                                "                <label for=\"Ordenar\"> Ordenar </label> \n" +
                                "            </div>\n" +
                                "            \n" +
                                "            <br>\n" +
                                "            \n" +
                                "            <div>\n" +
                                "                <select>\n" +
                                "                    <option value=\"OrdenCursoGeneral\">Curso</option>\n" +
                                "                    <option value=\"OrdenCarnetGeneral\">Carnet</option>\n" +
                                "                    <option value=\"OrdenTipoGeneral\">Tipo</option>\n" +
                                "                </select>\n" +
                                "            </div>\n" +
                                "                <br>\n" +
                                "                \n" +
                                "            <div> \n" +
                                "                <label for=\"Filtro\"> Filtro de Tipos </label> \n" +
                                "            </div>\n" +
                                "                \n" +
                                "                <br>\n" +
                                "                \n" +
                                "            <div>\n" +
                                "                <select>\n" +
                                "                    <option value=\"Consulta\">Consulta</option>\n" +
                                "                    <option value=\"Reclamo\">Reclamo</option>\n" +
                                "                    <option value=\"Revision\">Revisión</option>\n" +
                                "                </select>\n" +
                                "            </div>\n" +
                                "                <br> \n" +
                                "            \n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Aplicar\" name=\"btnAplicar\" /> <br> <br>\n" +
                                "            \n" +
                                "            <div>"+
                                                    "<select name=\"Cursos\">" );
                    
                    out.println("                </select>"    +            
                                "                <br>\n" +
                                "                <br>\n" +                    
                                "\n" +
                                "                \n" +
                                "            <div> \n" +
                                "                <label for=\"DetalleTicketP\"> Detalle </label> \n" +
                                "            </div>\n" +
                                "            \n" +
                                "            <br> \n" +
                                "            <br>\n" +
                                "            <div>\n" +
                                "            <textarea name= \"DetalleTick\" rows=\"4\" cols=\"50\">Detalle de los tickets\n" +
                                "            </textarea>\n" +
                                "            </div>     \n" +
                                " \n" +
                                "            <br>\n" +
                                "            <div>\n" +
                                "            <input type=\"submit\" value=\"Descargar detalle\" name=\"btnDescargarTickP\" />\n" +
                                "            </div>\n" +
                                "            <br>\n" +
                                "            \n" +
                                "            \n" +
                                "            <input type=\"submit\" value=\"Atras\" name=\"btnAtrasTickP\" />\n" +
                                "            &nbsp;\n" +
                                "            <input type=\"submit\" value=\"Responder\" name=\"btnResponderTickP\" />\n" +
                                "            \n" +
                                "\n" +
                                "        </form>\n" +
                                "    </body>\n" +
                                "</html>\n" +
                                "");
            }
        else{
                if (request.getParameter("btnEnviar") != null){
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
