/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import Negocio.consultaProperties;
import Negocio.reclamoProperties;
import Negocio.revisionProperties;
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
@WebServlet(name = "EnviarTicket", urlPatterns = {"/EnviarTicket"})
public class EnviarTicket extends HttpServlet {

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
        String tipo = ""; // ESTO NO VA, ES SOLO PRUEBA
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("btnAtrasE") != null){
                    response.sendRedirect("EstudiantePrincipal.html");
                }
        else{
                if (request.getParameter("btnEnviarE") != null){
                    if(tipo == "C"){
                        String fecha,carnet,nombre,correo,tipoConsulta,detalle,asunto;
                        fecha = request.getParameter("fechaE");
                        carnet = request.getParameter("carnetE");
                        nombre = request.getParameter("nombreE");
                        correo = request.getParameter("correo");
                        tipoConsulta = request.getParameter("tipo");
                        detalle = request.getParameter("Detalle");
                        asunto = request.getParameter("Asunto");
                        
                        consultaProperties.creaProperties(fecha, carnet, nombre, correo, tipoConsulta, detalle, asunto);
                    }
                    else if(tipo == "RE"){
                        String fecha,carnet,nombre,correo,detalle,tipoReclamo;
                        fecha = request.getParameter("fechaE");
                        carnet = request.getParameter("carnetE");
                        nombre = request.getParameter("nombreE");
                        correo = request.getParameter("correo");
                        tipoReclamo = request.getParameter("tipo");
                        detalle = request.getParameter("Detalle");
                        
                        reclamoProperties.creaProperties(fecha, carnet, nombre, correo, tipoReclamo,detalle);
                    }
                    else if(tipo == "RP"){
                        String fecha,carnet,nombre,correo,fechaPro,detalle;
                        fecha = request.getParameter("fechaE");
                        carnet = request.getParameter("carnetE");
                        nombre = request.getParameter("nombreE");
                        correo = request.getParameter("correo");
                        detalle = request.getParameter("Detalle");
                        fechaPro = request.getParameter("FechaPro");                        
                        
                        revisionProperties.creaProperties(fecha, carnet, nombre, correo, detalle, fechaPro);
                    }
                    response.sendRedirect("EstudiantePrincipal.html");
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


