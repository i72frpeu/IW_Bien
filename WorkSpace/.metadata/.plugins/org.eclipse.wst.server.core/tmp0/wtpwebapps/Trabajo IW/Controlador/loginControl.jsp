<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<jsp:useBean id="listaReservas" class="trabajo.IW.ListaReservasBean" scope="session" />
<jsp:useBean id="listaprestamos" class="trabajo.IW.ListaPrestamosBean" scope="session" />
<%
	

	int id = 0;
	
	

	if(Usuario.iniciarSesion(request.getParameter("email"), request.getParameter("contr")) == true){
	
		
		listaLibros.loadLibros();
		
		if(Usuario.getTipo() == 1){
			listaReservas.loadReserva(Usuario.getUsuario());
			listaprestamos.loadPrestamo(Usuario.getUsuario());
			response.sendRedirect("../Home (Libros).jsp");
		}else{
			if(Usuario.getTipo() == 2){
				listaReservas.loadReserva(Usuario.getUsuario());
				listaprestamos.loadPrestamo(Usuario.getUsuario());
				response.sendRedirect("../Home (Profesor).jsp");
		}else{
			if(Usuario.getTipo() == 3){
				listaReservas.loadReserva();
				listaprestamos.loadPrestamos();
				response.sendRedirect("../Home (Admin).jsp");
			}
		}
	} 
}
		
		
%>
