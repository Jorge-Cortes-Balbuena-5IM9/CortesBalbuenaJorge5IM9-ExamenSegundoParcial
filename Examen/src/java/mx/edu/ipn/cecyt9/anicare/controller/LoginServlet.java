package mx.edu.ipn.cecyt9.anicare.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
            String usuario = request.getParameter("Nombre");
            String contra = request.getParameter("password");
            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            String url="jdbc:mysql://localhost/Examen";
            String user="root";
            String password="n0m3l0";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                sentencia = conexion.createStatement();
                System.out.println("OK");
            }
            catch(Exception e){
                System.out.println("NO");
            }
            resultado = sentencia.executeQuery("select * from usuarios1 where Nombre = '"+usuario+"' and Contraseña = '"+contra+"'");
            int contador = 0;
            while(resultado.next()){
                contador++;
            }
            if(contador == 1){
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("usuario", usuario);
                response.sendRedirect("JSP/Desplegar.jsp");
            }
            else{
                try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet Login</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<script>alert('Usuario o contraseña incorrectos')</script>");
                    out.println("<script>window.location='JSP/index.jsp'</script>");
                    out.println("</body>");
                    out.println("</html>");
                    }
                HttpSession sesion = request.getSession(false);
            }
        }catch(Exception e){
            System.out.println("Error en la conexion");
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
