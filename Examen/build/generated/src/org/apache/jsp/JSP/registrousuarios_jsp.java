package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrousuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Registro ANICARE</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\n");
      out.write("\t\t\t<header id=\"header\" class=\"alt\">\n");
      out.write("\t\t\t\t<div class=\"inner\">\n");
      out.write("\t\t\t\t\t<h1>Registro</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<section id=\"intro\" class=\"main\">\n");
      out.write("\t\t\t\t\t\t<article>\n");
      out.write("                                                    <h2>Registro</h2>\n");
      out.write("                                                        <form method=\"post\" action=\"Registro.jsp\">\n");
      out.write("                                                            <span>\n");
      out.write("                                                                <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"slide-up\">\n");
      out.write("                                                                <label for=\"nombre\">Nombre</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            <span>\n");
      out.write("                                                                <input type=\"text\" name=\"ApellidoPaterno\" id=\"ApellidoPaterno\" class=\"slide-up\">\n");
      out.write("                                                                <label for=\"apellidoPaterno\">Apellido Paterno</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            <span>\n");
      out.write("                                                                <input type=\"text\" name=\"ApellidoMaterno\" id=\"ApellidoMaterno\" class=\"slide-up\">\n");
      out.write("                                                                <label for=\"apellidoMaterno\">Apellido Materno</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            <span>\n");
      out.write("                                                                <input type=\"text\" name=\"Escuela\" id=\"Escuela\" class=\"slide-up\">\n");
      out.write("                                                                <label for=\"telefono\">Escuela</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            <span>\n");
      out.write("                                                            <input type=\"text\" name=\"MateriaFavorita\" id=\"MateriaFavorita\" class=\"slide-up\">\n");
      out.write("                                                            <label for=\"nombreusu\">Materia Favorita</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            <span>\n");
      out.write("                                                            <input type=\"email\" name=\"DeporteFavorito\" id=\"DeporteFavorito\" class=\"slide-up\">\n");
      out.write("                                                            <label for=\"correo\">DeporteFavorito</label>\n");
      out.write("                                                            </span>\n");
      out.write("                                                            <br><br>\n");
      out.write("                                                            \n");
      out.write("                                                            <input type=\"submit\" value=\"Registrarme\" class=\"nop\">\n");
      out.write("                                                        </form>\n");
      out.write("                                                    </div> \n");
      out.write("                                                </article>\n");
      out.write("\t\t\t\t\t</section>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</body>\n");
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
