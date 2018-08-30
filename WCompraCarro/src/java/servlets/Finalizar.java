/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ERICK
 */
public class Finalizar extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Finalizar</title>");            
            out.println("</head>");
            out.println("<body>");
            
            float total = 0.0f;
            String modelos = request.getParameter("modelos");
            String portas = request.getParameter("portas");
            String acessorios [] = request.getParameterValues("acessorios");
            
            out.println("<h1>Itens selecionados: </h1>");
                //ELX - Lógica

                if("elx".equals(modelos) & "p2".equals(portas)){
                    
                    total += 20000 + 0;
                    out.println("<label>Modelo: ELX </label><br>");
                    out.println("<label>Portas: 2</label>");
                    
                }else if("elx".equals(modelos) & "p4".equals(portas)){
                    
                    total += 20000 + 4000;
                    out.println("<label>Modelo: ELX </label><br>");
                    out.println("<label>Portas: 4</label>");
                    
                }else if("ex".equals(modelos) & "p2".equals(portas)){
                    
                    total += 10000 + 0;
                    out.println("<label>Modelo: EX </label><br>");
                    out.println("<label>Portas: 2</label>");
                    
                }else if("ex".equals(modelos) & "p4".equals(portas)){
                    
                    total += 10000 + 4000;
                    out.println("<label>Modelo: EX </label><br>");
                    out.println("<label>Portas: 4</label>");
                    
                }else if("master".equals(modelos) & "p2".equals(portas)){
                    
                    total += 30000 + 0;
                    out.println("<label>Modelo: MASTER </label><br>");
                    out.println("<label>Portas: 2</label>");
                    
                }else if("master".equals(modelos) & "p4".equals(portas)){
                    
                    total += 30000 + 4000;
                    out.println("<label>Modelo: MASTER </label><br>");
                    out.println("<label>Portas: 4</label>");
                    
                }
                if(acessorios!=null){
                    for(int i = 0;i < acessorios.length; i++){
                        if("arc".equals(acessorios[i])){
                            total += 3000;
                            out.println("<br><label>Acessórios: Ar Condicionado</label>");
                        }else if("dir".equals(acessorios[i])){
                            total += 2000;
                            out.println("<br><label>Acessórios: Direção</label>");
                        }else if("vete".equals(acessorios[i])){
                             total += 1000;
                             out.println("<br><label>Acessórios: Vidro Elétrico/Trava Elétrica</label>");
                        }
                    }
                }
            out.println("<h3>Total: " + total + "</h3>");
            out.println("</body>");
            out.println("</html>");
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
