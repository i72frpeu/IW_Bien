/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.49
 * Generated at: 2020-05-26 14:48:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario_0020Prestamo_0020Reserva_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      trabajo.IW.UsuarioBean Usuario = null;
      synchronized (session) {
        Usuario = (trabajo.IW.UsuarioBean) _jspx_page_context.getAttribute("Usuario", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (Usuario == null){
          Usuario = new trabajo.IW.UsuarioBean();
          _jspx_page_context.setAttribute("Usuario", Usuario, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      trabajo.IW.ReservaBean reservaactiva = null;
      synchronized (session) {
        reservaactiva = (trabajo.IW.ReservaBean) _jspx_page_context.getAttribute("reservaactiva", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (reservaactiva == null){
          reservaactiva = new trabajo.IW.ReservaBean();
          _jspx_page_context.setAttribute("reservaactiva", reservaactiva, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("  <title>Formulario Prestamo</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../CSS/wf2.1.css\">\r\n");
      out.write("  <script src=\"p2.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!--Mensaje de bienvenida-->\r\n");
      out.write("  <h2 class=\"title_wf2-1\"><strong>Realizar Prestamo</strong></h2>\r\n");
      out.write("\r\n");
      out.write("  <!--NOMBRE Y APELLIDOS-->\r\n");
      out.write("  <div class=\"registro\">\r\n");
      out.write("    <form action=\"../Controlador/Realizar Prestamo.jsp\" method=\"post\" target=\"_self\">\r\n");
      out.write("      \r\n");
      out.write("      <strong>ID libro</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"id\" value=\"");
      out.print( reservaactiva.getIDLibroReserva() );
      out.write("\" required><br><br>\r\n");
      out.write("      \r\n");
      out.write("      <strong>Titulo</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"libro\" value=\"");
      out.print( reservaactiva.getTitulo() );
      out.write("\" required><br><br>\r\n");
      out.write("      \r\n");
      out.write("      <strong>Autor</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"Autor\" value=\"");
      out.print( reservaactiva.getAutorLibroReserva() );
      out.write("\" required><br><br>\r\n");
      out.write("      \r\n");
      out.write("      <strong>Usuario</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"usuario\" value=\"");
      out.print( reservaactiva.getUsuario() );
      out.write("\" required><br><br>\r\n");
      out.write("      \r\n");
      out.write("      <strong>Carnet</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"carnet\" value=\"");
      out.print( reservaactiva.getCarnet_universidad() );
      out.write("\" required><br><br>\r\n");
      out.write("      \r\n");
      out.write("      <strong>Fecha Inicio</strong><br>\r\n");
      out.write("      <input type=\"text\" name=\"fecha\" required><br><br>\r\n");
      out.write("           \r\n");
      out.write("      <input type=\"submit\" value=\"Confirmar Prestamo\"> \r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
