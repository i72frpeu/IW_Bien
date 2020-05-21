/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.49
 * Generated at: 2020-05-21 16:33:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Controlador;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import trabajo.DAO.LibroDAO;

public final class GuardarLibro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("trabajo.DAO.LibroDAO");
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

      out.write("\r\n");
      out.write("\r\n");
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
      trabajo.IW.ListalibrosBean listaLibros = null;
      synchronized (session) {
        listaLibros = (trabajo.IW.ListalibrosBean) _jspx_page_context.getAttribute("listaLibros", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (listaLibros == null){
          listaLibros = new trabajo.IW.ListalibrosBean();
          _jspx_page_context.setAttribute("listaLibros", listaLibros, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      trabajo.IW.LibroBean libroactivo = null;
      synchronized (session) {
        libroactivo = (trabajo.IW.LibroBean) _jspx_page_context.getAttribute("libroactivo", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (libroactivo == null){
          libroactivo = new trabajo.IW.LibroBean();
          _jspx_page_context.setAttribute("libroactivo", libroactivo, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');



	LibroDAO x = new LibroDAO();

	int i = x.numeroLibros();

	x.guardarLibro(i, request.getParameter("titulo"), request.getParameter("autor"), request.getParameter("materia"), request.getParameter("editorial"), Integer.parseInt(request.getParameter("paginas")), Integer.parseInt(request.getParameter("encuadernamiento")));

	x.setId_libro(i);
	x.setTitulo(request.getParameter("titulo"));
	x.setAutor(request.getParameter("autor"));
	x.setMateria(request.getParameter("materia"));
	x.setEditorial(request.getParameter("editorial"));
	x.setPaginas(Integer.parseInt(request.getParameter("paginas")));
	x.setEncuadernamiento(Integer.parseInt(request.getParameter("encuadernamiento")));
	
	listaLibros.addlibro(x);
	
	String libro = request.getParameter("titulo");
	
	if(x.load_libro(libro) == true){
		libroactivo.setId_libro(x.getId_libro());
		libroactivo.setTitulo(x.getTitulo());
		libroactivo.setAutor(x.getAutor());
		libroactivo.setMateria(x.getMateria());
		libroactivo.setPaginas(x.getPaginas());
		libroactivo.setEditorial(x.getEditorial());
		libroactivo.setEncuadernamiento(x.getEncuadernamiento());
		if(Usuario.getTipo() == 1){
			response.sendRedirect("../Vistas/Libro.jsp");
		}else{
			if(Usuario.getTipo() == 2){
				response.sendRedirect("../Vistas/Libro.jsp");
		}else{
			if(Usuario.getTipo() == 3){
				response.sendRedirect("../Vistas/Libro Admin.jsp");
			}
		}
	} 
	}


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
