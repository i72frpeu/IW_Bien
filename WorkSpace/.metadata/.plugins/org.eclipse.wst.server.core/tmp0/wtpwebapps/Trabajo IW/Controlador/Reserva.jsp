<%@page import="trabajo.DAO.ReservaDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaReservas" class="trabajo.IW.ListaReservasBean" scope="session" />
<jsp:useBean id="reservaactiva" class="trabajo.IW.ReservaBean" scope="session" />
<%
	ReservaDAO nuevaReserva = new ReservaDAO();

	int id = nuevaReserva.comprobarId();
	
	nuevaReserva.guardarReserva(id, request.getParameter("titulo"), request.getParameter("usuario"), request.getParameter("carnet"), Integer.parseInt(request.getParameter("Fecha")));
	
	nuevaReserva.setIdReserva(id);
	nuevaReserva.setTitulo(request.getParameter("titulo"));
	nuevaReserva.setUsuario(request.getParameter("usuario"));
	nuevaReserva.setCarnet_universidad(request.getParameter("carnet"));
	nuevaReserva.setfecha_inicio_Reserva(Integer.parseInt(request.getParameter("Fecha")));
	nuevaReserva.setfecha_final_Reserva(30 + Integer.parseInt(request.getParameter("Fecha")));
	
	listaReservas.addReserva(nuevaReserva);
	
	String libro = request.getParameter("titulo");
	
	if(nuevaReserva.getTitulo().equals(libro)){
		reservaactiva.setTitulo(nuevaReserva.getTitulo());
		reservaactiva.setIdReserva(nuevaReserva.getIdReserva());
		reservaactiva.setUsuario(nuevaReserva.getUsuario());
		reservaactiva.setCarnet_universidad(nuevaReserva.getCarnet_universidad());
		reservaactiva.setfecha_inicio_Reserva(nuevaReserva.getFecha_inicio_Reserva());
		reservaactiva.setfecha_final_Reserva(nuevaReserva.getFecha_final_Reserva());
		response.sendRedirect("../Vistas/Reserva.jsp");
	}

	
%>