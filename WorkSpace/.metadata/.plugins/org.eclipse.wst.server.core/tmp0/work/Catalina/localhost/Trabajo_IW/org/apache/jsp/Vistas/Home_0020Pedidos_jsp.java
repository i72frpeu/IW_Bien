/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.49
 * Generated at: 2020-05-27 17:20:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_0020Pedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/Vistas/../Includes/headerprof.jsp", Long.valueOf(1590598990192L));
    _jspx_dependants.put("/Vistas/../Includes/headeradmin.jsp", Long.valueOf(1590598968121L));
    _jspx_dependants.put("/Vistas/../Includes/header.jsp", Long.valueOf(1590598949842L));
  }

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

if(Usuario.getTipo() == 1){

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/header.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("    <!--Definimos el logo-->\r\n");
      out.write("    <img src=\"../img/logo.PNG\" alt=\"LOGO\" class=\"logo_home\">\r\n");
      out.write("    <!--Enlace a HOME-->\r\n");
      out.write("\t<a href=\"../Controlador/Home.jsp\" class=\"link_home\"><strong>HOME</strong></a>\r\n");
      out.write("    <!--Enlace a AMIGOS-->\r\n");
      out.write("    <a href=\"Home Reservas.jsp\" class=\"link_amigos\"><strong>RESERVAS</strong></a>\r\n");
      out.write("    <!--Enlace a BUSCADOR-->\r\n");
      out.write("    <a href=\"Home Prestamos.jsp\" class=\"link_buscador\"><strong>PRESTAMOS</strong></a>\r\n");
      out.write("    <!--Definimos imagen usuario-->\r\n");
      out.write("    <div>\r\n");
      out.write("      <img src=\"../img/profile-42914_960_720.png\" alt=\"IMG_USER\" class=\"img_user\">\r\n");
      out.write("      <div class=\"options_user\">\r\n");
      out.write("      \t<h3>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((trabajo.IW.UsuarioBean)_jspx_page_context.findAttribute("Usuario")).getUsuario())));
      out.write("</h3>\r\n");
      out.write("      \t<a href=\"../index.jsp\"> Cerrar Sesion </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html> \r\n");
      out.write('\r');
      out.write('\n');
 
}else{
	if(Usuario.getTipo() == 2){

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/headerprof.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("    <!--Definimos el logo-->\r\n");
      out.write("    <img src=\"../img/logo.PNG\" alt=\"LOGO\" class=\"logo_home\">\r\n");
      out.write("    <!--Enlace a HOME-->\r\n");
      out.write("\t<a href=\"../Controlador/Home.jsp\" class=\"link_home\"><strong>HOME</strong></a>\r\n");
      out.write("    <!--Enlace a Reservas-->\r\n");
      out.write("    <a href=\"Home Reservas.jsp\" class=\"link_amigos\"><strong>RESERVAS</strong></a>\r\n");
      out.write("    <!--Enlace a Prestamos-->\r\n");
      out.write("    <a href=\"Home Prestamos.jsp\" class=\"link_buscador\"><strong>PRESTAMOS</strong></a>\r\n");
      out.write("    <!-- Enlace pedidos -->\r\n");
      out.write("    <a href=\"Home Pedidos.jsp\" class=\"link_foro\"><strong>PEDIDOS</strong></a>\r\n");
      out.write("    <!--Definimos imagen usuario-->\r\n");
      out.write("    <div>\r\n");
      out.write("      <img src=\"../img/profile-42914_960_720.png\" alt=\"IMG_USER\" class=\"img_user\">\r\n");
      out.write("      <div class=\"options_user\">\r\n");
      out.write("      \t<h3>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((trabajo.IW.UsuarioBean)_jspx_page_context.findAttribute("Usuario")).getUsuario())));
      out.write("</h3>\r\n");
      out.write("      \t<a href=\"../index.jsp\"> Cerrar Sesion </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html> ");
      out.write('\r');
      out.write('\n');
 
}else{
	if(Usuario.getTipo() == 3){

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/headeradmin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <header class=\"main-header\">\r\n");
      out.write("    <!--Definimos el logo-->\r\n");
      out.write("    <img src=\"../img/logo.PNG\" alt=\"LOGO\" class=\"logo_home\">\r\n");
      out.write("    <!--Enlace a HOME-->\r\n");
      out.write("\t<a href=\"../Controlador/Home.jsp\" class=\"link_home\"><strong>HOME</strong></a>\r\n");
      out.write("    <!--Enlace a Reservas-->\r\n");
      out.write("    <a href=\"Home Reservas.jsp\" class=\"link_amigos\"><strong>RESERVAS</strong></a>\r\n");
      out.write("    <!--Enlace a Prestamos-->\r\n");
      out.write("    <a href=\"Home Prestamos.jsp\" class=\"link_buscador\"><strong>PRESTAMOS</strong></a>\r\n");
      out.write("    <!-- Enlace pedidos -->\r\n");
      out.write("    <a href=\"Home Pedidos.jsp\" class=\"link_foro\"><strong>PEDIDOS</strong></a>\r\n");
      out.write("    <!--Definimos imagen usuario-->\r\n");
      out.write("    <a href=\"Home Expansiones.jsp\" class=\"link_Expansiones\"><strong>EXPANSIONES</strong></a>\r\n");
      out.write("    <div>\r\n");
      out.write("      <img src=\"../img/profile-42914_960_720.png\" alt=\"IMG_USER\" class=\"img_user\">\r\n");
      out.write("      <div class=\"options_user\">\r\n");
      out.write("      \t<h3>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((trabajo.IW.UsuarioBean)_jspx_page_context.findAttribute("Usuario")).getUsuario())));
      out.write("</h3>\r\n");
      out.write("      \t<a href=\"../index.jsp\"> Cerrar Sesion </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write(" </body>\r\n");
      out.write(" </html> ");
      out.write('\r');
      out.write('\n');

}}}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<title>Home Pedidos</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../CSS/wf7.0.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!--Roll de artículos-->\r\n");
      out.write("  <div class=\"div_home_1\">\r\n");
      out.write("    <table class=\"dos\">\r\n");
      out.write("    ");
 for (int i = 0; i < 8; i++){ 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>\r\n");
      out.write("              <table class=\"uno\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td class=\"td_user_img\">Titulo Libro</td>\r\n");
      out.write("                    <td> <a href=\"Pedido.jsp\"><button name=\"foro\" class=\"boton_user\">Ver Pedido</button></a><td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
} 
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("\t<div class=\"div_boton_pedido\">\r\n");
      out.write("  \t<a href=\"Crear Pedido.jsp\" class=\"boton_pedido\"><button>Crear Pedido</button></a>\r\n");
      out.write("  \t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
