<%@page import="trabajo.DAO.PrestamoDAO" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="prestamoactivo" class="trabajo.IW.PrestamoBean" scope="session" />
<jsp:useBean id="listaPrestamo" class="trabajo.IW.ListaPrestamosBean" scope="session" />
<%

	PrestamoDAO x = new PrestamoDAO();
	
	System.out.println(request.getParameter("id_prestamo"));
	
	String prestamo = request.getParameter("id_prestamo");
	
	if(x.load_prestamo(Integer.parseInt(prestamo)) == true){
		prestamoactivo.setId_prestamo(x.getId_prestamo());
		prestamoactivo.setId_libro(x.getId_libro());
		prestamoactivo.setTitulo(x.getTitulo());
		prestamoactivo.setAutor(x.getAutor());
		prestamoactivo.setUsuario(x.getUsuario());
		prestamoactivo.setFecha_inicio_prestamo(x.getFecha_inicio_prestamo());
		prestamoactivo.setFecha_final_prestamo(x.getFecha_inicio_prestamo()+30);
		response.sendRedirect("../Vistas/Prestamo.jsp");
	}


%>