<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:useBean id="Usuario" class="trabajo.IW.UsuarioBean" scope="session" />
<jsp:useBean id="listaLibros" class="trabajo.IW.ListalibrosBean" scope="session" />
<%
	

	int id = 0;
		
	int i = Usuario.numeroUsers();
		
		if(Usuario.registrarse(i, 1, request.getParameter("nombre"), request.getParameter("apellidos"), request.getParameter("usuario"), request.getParameter("password"),request.getParameter("email") , request.getParameter("carnet")) == true){
			
			if(Usuario.iniciarSesion(request.getParameter("email"), request.getParameter("password")) == true){
				listaLibros.loadLibros();
				
				if(Usuario.getTipo() == 1){
					response.sendRedirect("../Home (Libros).jsp");
				}else{
					if(Usuario.getTipo() == 2){
						response.sendRedirect("../Home (Profesor).jsp");
				}else{
					if(Usuario.getTipo() == 3){
						response.sendRedirect("../Home (Admin).jsp");
					}
				}
			} 
		}	
}

		
		
%>