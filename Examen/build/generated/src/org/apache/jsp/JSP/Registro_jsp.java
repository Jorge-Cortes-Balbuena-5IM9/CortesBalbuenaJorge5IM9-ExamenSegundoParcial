package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                System.out.println("Conectado");
            }
            catch(Exception e){
                System.out.println("No hay conexion");
            }
        
      out.write("\n");
      out.write("        ");

            String usuario = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("contra");
            String contra2 = request.getParameter("contra2");
            String nombre = request.getParameter("nombre");
            String apellidoPaterno = request.getParameter("apellidoPaterno");
            String apellidoMaterno = request.getParameter("apellidoMaterno");
            String telefono = request.getParameter("escuela");
            try{
                if(contra.equals(contra2)){
                    sentencia.executeUpdate("insert into usuarios (usuario, correo, contra, nombre, apellidoPaterno, apellidoMaterno, telefono) values('"+usuario+"','"+correo+"','"+contra+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+telefono+"');");
                    out.println("<script>alert('Usuario registrado')</script>");
                    try{
                        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, user, password);
                        sentencia = conexion.createStatement();
                        System.out.println("Conectado");
                    }
                    catch(Exception e){
                        System.out.println("Sin conexion");
                    }
                    resultado = sentencia.executeQuery("select * from usuarios where usuario = '"+usuario+"' and contra = '"+contra+"'");
                    int contador = 0;
                    while(resultado.next()){
                        contador++;
                    }
                    if(contador == 1){
                        HttpSession sesion = request.getSession(true);
                        sesion.setAttribute("usuario", usuario);
                        response.sendRedirect("index.jsp");
                    }
                    else{
                        if(contador != 1){
                        try{
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Servlet Login</title>");            
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<script>alert('Usuario o contraseña incorrectos')</script>");
                            out.println("<script>window.location='index.jsp'</script>");
                            out.println("</body>");
                            out.println("</html>");
                            }
                        catch(Exception e){
                    System.out.println("Error en la conexion");
                }
                        HttpSession sesion = request.getSession(false);
                    }
                        }
                }catch(Exception e){
                    System.out.println("Error en la conexion");
                }
                        }       
                else{
                    out.println("<script>alert('Comprueba la cotraseña')</script>");
                    out.println("<script>window.location='registrorusuarios.jsp'</script>");
                    System.out.println("No entró");
                }
            }catch(Exception e){
                out.println("<script>alert('Registro fallido')</script>");
                out.println("<script>window.location='index.jsp'</script>");
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
