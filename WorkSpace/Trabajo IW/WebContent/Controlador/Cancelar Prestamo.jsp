<%@page import="trabajo.DAO.PrestamoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="prestamoactivo" class="trabajo.IW.PrestamoBean" scope="session" />
<jsp:useBean id="listaprestamos" class="trabajo.IW.ListaPrestamosBean" scope="session" />
<%
	PrestamoDAO aux = new PrestamoDAO();
	
	listaprestamos.removePrestamo(prestamoactivo.getId_prestamo());

	aux.eliminarPrestamo(prestamoactivo.getId_prestamo());
	
	response.sendRedirect("../Vistas/Home Prestamos.jsp");
%>