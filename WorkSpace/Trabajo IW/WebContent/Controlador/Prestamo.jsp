<%@page import="trabajo.DAO.PrestamoDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="prestamoactivo" class="trabajo.IW.PrestamoBean" scope="session" />
<%

	PrestamoDAO x = new PrestamoDAO();
		
	String titulo = request.getParameter("titulo");
	String usuario = request.getParameter("usuario");
	
	if(x.load_prestamo(titulo, usuario) == true){
		prestamoactivo.setId_prestamo(x.getId_prestamo());
		prestamoactivo.setIDLibroPrestamo();
		prestamoactivo.setTitulo(x.getTitulo());
		prestamoactivo.setAutor(x.getAutor());
		prestamoactivo.setUsuario(x.getUsuario());
		prestamoactivo.setCarnet(x.getCarnet());
		prestamoactivo.setFecha_inicio_prestamo(x.getFecha_inicio_prestamo());
		prestamoactivo.setFecha_final_prestamo(x.getFecha_inicio_prestamo()+30);
		if(Usuario.getTipo() == 3){
			response.sendRedirect("../Vistas/Prestamo (Admin).jsp");
		}else{
			response.sendRedirect("../Vistas/Prestamo.jsp");
		}
	}


%>