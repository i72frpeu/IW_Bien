<%@page import="trabajo.DAO.ReservaDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="reservaactiva" class="trabajo.IW.ReservaBean" scope="session" />
<jsp:useBean id="listaReservas" class="trabajo.IW.ListaReservasBean" scope="session" />

<%
	ReservaDAO aux = new ReservaDAO();
	
	listaReservas.removeReserva(reservaactiva.getIdReserva());

	aux.cancelarReserva(reservaactiva.getIdReserva());
	
	response.sendRedirect("../Vistas/Home Reservas.jsp");
%>