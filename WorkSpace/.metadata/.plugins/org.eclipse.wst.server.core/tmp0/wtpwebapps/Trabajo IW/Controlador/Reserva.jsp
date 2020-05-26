<%@page import="trabajo.DAO.ReservaDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaReservas" class="trabajo.IW.ListaReservasBean" scope="session" />
<jsp:useBean id="reservaactiva" class="trabajo.IW.ReservaBean" scope="session" />
<%


	ReservaDAO x = new ReservaDAO();
	
	String libro = request.getParameter("titulo");
	String user = request.getParameter("usuario");
	
	if(x.load_reserva(user, libro) == true){
		reservaactiva.setTitulo(x.getTitulo());
		reservaactiva.setIdReserva(x.getIdReserva());
		reservaactiva.setUsuario(x.getUsuario());
		reservaactiva.setCarnet_universidad(x.getCarnet_universidad());
		reservaactiva.setfecha_inicio_Reserva(x.getFecha_inicio_Reserva());
		reservaactiva.setfecha_final_Reserva(x.getFecha_final_Reserva());
		if(Usuario.getTipo() == 3){
			response.sendRedirect("../Vistas/Reserva (Admin).jsp");
		}else{
			response.sendRedirect("../Vistas/Reserva.jsp");
		}
		
	}


%>